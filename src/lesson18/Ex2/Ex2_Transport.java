package lesson18.Ex2;

public class Ex2_Transport {
//properties
    private String brand;  //hãng sản xuất
    private String manufactureYear;  //năm sản xuất
    private String address;  //nơi sản xuất
    private long price;  //giá thành
    private float weight; //trọng lượng
    private String id;  //biển số


//constructors
    public Ex2_Transport(String brand, String manufactureYear, String address, long price, float weight, String id) {
        this.brand = brand;
        this.manufactureYear = manufactureYear;
        this.address = address;
        this.price = price;
        this.weight = weight;
        this.id = id;
    }

//getter and setter

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(String manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
