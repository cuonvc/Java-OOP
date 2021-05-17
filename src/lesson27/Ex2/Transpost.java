package lesson27.Ex2;

public abstract class Transpost implements TranspostAction {
    private String brand;  //hãng sản xuất
    private String manufactureYear;  //năm sản xuất
    private String name;   //tên xe
    private double price;   //giá bán
    private float weight;   //trọng lượng
    private String type;   //loại xe

    public Transpost() {

    }


    public Transpost(String brand, String manufactureYear, String name, double price, float weight, String type) {
        this.brand = brand;
        this.manufactureYear = manufactureYear;
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.type = type;
    }



    public final String getBrand() {
        return brand;
    }

    public final void setBrand(String brand) {
        this.brand = brand;
    }

    public final String getManufactureYear() {
        return manufactureYear;
    }

    public final void setManufactureYear(String manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final double getPrice() {
        return price;
    }

    public final void setPrice(double price) {
        this.price = price;
    }

    public final float getWeight() {
        return weight;
    }

    public final void setWeight(float weight) {
        this.weight = weight;
    }

    public final String getType() {
        return type;
    }

    public final void setType(String type) {
        this.type = type;
    }





    @Override
    public void startEngine() {
        System.out.println("Nổ máy");
    }

    @Override
    public void shutdown() {
        System.out.println("Tắt máy");
    }

    @Override
    public void stop() {
        System.out.println("Phanh lại");
    }

    @Override
    public void speedUp() {
        System.out.println("Tăng tốc");
    }

    @Override
    public void lightOn() {
        System.out.println("Bật đèn");
    }
}
