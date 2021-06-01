package lesson43.Ex4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Smartphone implements Comparable<Smartphone>{
    private static int nextId = 1;
    private String deviceId;
    private String brand;
    private String deviceName;
    private double price;
    private int manufactureYear;
    private float screenSize;

    public Smartphone() {
    }

    public Smartphone(String deviceId, String brand, String deviceName,
                      double price, int manufactureYear, float screenSize)
            throws InvalidBrandException {
        this.setNextSmpId(deviceId);
        this.setBrand(brand);
        this.deviceName = deviceName;
        this.price = price;
        this.manufactureYear = manufactureYear;
        this.screenSize = screenSize;
    }

    private void setNextSmpId(String deviceId) {
        if (deviceId == null) {
            this.deviceId = "SMP" + nextId;
            nextId++;
        } else {
            this.deviceId = deviceId;
        }
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Smartphone.nextId = nextId;
    }

    public final String getDeviceId() {
        return deviceId;
    }

    public final void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public final String getBrand() {
        return brand;
    }

    public final void setBrand(String brand) throws InvalidBrandException {
        String regex = "(apple)|(samsung)|(huawei)|(vsmart)|(xiaomi)|(oppo)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(brand.toLowerCase());
        if (matcher.matches()) {
            this.brand = brand.toUpperCase();
        } else {
            String msg = "Tên hãng không tồn tại";
            throw new InvalidBrandException(msg, brand);
        }
    }

    public final String getDeviceName() {
        return deviceName;
    }

    public final void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public final double getPrice() {
        return price;
    }

    public final void setPrice(double price) {
        this.price = price;
    }

    public final int getManufactureYear() {
        return manufactureYear;
    }

    public final void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public final float getScreenSize() {
        return screenSize;
    }

    public final void setScreenSize(float screenSize) {
        this.screenSize = screenSize;
    }


    @Override
    public int compareTo(Smartphone o) {
        return this.deviceId.compareTo(o.deviceId);
    }
}
