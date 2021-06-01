package lesson21.Ex2;

import java.util.Date;

public class Transport {
    private String brand;  //hãng xe
    private Date manufactureYear;  //năm sản xuất
    private String someoneProduction;  //nơi sản xuất
    private long price;  //giá thành
    private String size;   //kích thước
    private int amount;  //số lương
    private String licensePlace;  //biển số

    public Transport() {
    }

    //các method
    public void active() {
        System.out.println("hành độn nổ máy");
    }
    public void shutdown() {
        System.out.println("hành động tắt máy");
    }
    public void speedUp() {
        System.out.println("tăng tốc");
    }
    public void stop() {
        System.out.println("Phanh lại");
    }
    public void turnOnLight() {
        System.out.println("Bật đèn");
    }

    public Transport(String brand, Date manufactureYear, String someoneProduction,
                     long price, String size, int amount, String licensePlace) {
        this.brand = brand;
        this.manufactureYear = manufactureYear;
        this.someoneProduction = someoneProduction;
        this.price = price;
        this.size = size;
        this.amount = amount;
        this.licensePlace = licensePlace;
    }

//getter and setter dạng final
    public final String getBrand() {
        return brand;
    }

    public final void setBrand(String brand) {
        this.brand = brand;
    }

    public final Date getManufactureYear() {
        return manufactureYear;
    }

    public final void setManufactureYear(Date manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public final String getSomeoneProduction() {
        return someoneProduction;
    }

    public final void setSomeoneProduction(String someoneProduction) {
        this.someoneProduction = someoneProduction;
    }

    public final long getPrice() {
        return price;
    }

    public final void setPrice(long price) {
        this.price = price;
    }

    public final String getSize() {
        return size;
    }

    public final void setSize(String size) {
        this.size = size;
    }

    public final int getAmount() {
        return amount;
    }

    public final void setAmount(int amount) {
        this.amount = amount;
    }

    public final String getLicensePlace() {
        return licensePlace;
    }

    public final void setLicensePlace(String licensePlace) {
        this.licensePlace = licensePlace;
    }
}
