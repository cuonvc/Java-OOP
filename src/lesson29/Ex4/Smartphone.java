package lesson29.Ex4;

public class Smartphone implements Comparable<Smartphone> {
    private static int nextId = 1001;
    private String id;  //mã thiết bị
    private String brand;  //tên hãng
    private String deviceName;  //tên thiết bị
    private float price;  //giá bán
    private int manufactureYear;  //năm sản xuất
    private float size;  //kích thước màn hình (inch)

    public Smartphone() {
    }

    public Smartphone(String id, String brand, String deviceName,
                      float price, int manufactureYear, float size) {
        this.setNextIdSMP(id);
        this.brand = brand;
        this.deviceName = deviceName;
        this.price = price;
        this.manufactureYear = manufactureYear;
        this.size = size;
    }

    /**
     * thiết lập mã id
     * @param id
     */
    private void setNextIdSMP(String id) {
        if (id == null) {
            this.id = "SMP" + nextId;
            nextId++;
        } else {
            this.id = id;
        }
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Smartphone.nextId = nextId;
    }

    public final String getId() {
        return id;
    }

    public final void setId(String id) {
        this.id = id;
    }

    public final String getBrand() {
        return brand;
    }

    public final void setBrand(String brand) {
        this.brand = brand;
    }

    public final String getDeviceName() {
        return deviceName;
    }

    public final void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public float getPrice() {
        return price;
    }

    public final void setPrice(float price) {
        this.price = price;
    }

    public final int getManufactureYear() {
        return manufactureYear;
    }

    public final void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public final float getSize() {
        return size;
    }

    public final void setSize(float size) {
        this.size = size;
    }

    @Override
    //sắp xếp tên thiết bị từ a-z
    public int compareTo(Smartphone o) {
        return this.deviceName.compareTo(o.deviceName);
    }
}
