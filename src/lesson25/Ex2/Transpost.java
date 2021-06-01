package lesson25.Ex2;

import java.util.Date;

public abstract class Transpost {
    private String brand;  //hãng sản xuất
    private Date productionYear;  //năm sản xuất
    private String productionWhere; //nơi sản xuất
    private long price;  //giá thành
    private String size;  //kích thước
    private float weight;  //trọng lượng
    private String licensePlate;  //biển số xe



    public final String getBrand() {
        return brand;
    }

    public final void setBrand(String brand) {
        this.brand = brand;
    }

    public final Date getProductionYear() {
        return productionYear;
    }

    public final void setProductionYear(Date productionYear) {
        this.productionYear = productionYear;
    }

    public final String getProductionWhere() {
        return productionWhere;
    }

    public final void setProductionWhere(String productionWhere) {
        this.productionWhere = productionWhere;
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

    public final float getWeight() {
        return weight;
    }

    public final void setWeight(float weight) {
        this.weight = weight;
    }

    public final String getLicensePlate() {
        return licensePlate;
    }

    public final void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

//các hành động
    public abstract void turnOn();  //khởi động xe
    public abstract void turnOff();  //tắt xe
    public abstract void speedUp();  //tăng tốc
    public abstract void stop();  //dừng lại
    public abstract void lightOn();   //bật đèn

}
