package lesson18.Ex2;

public class Ex2_Truck extends Ex2_Autumobile {
    private float payload;  //trọng tải
    private String purpose;  //mục đích sử dụng
    private float shippedAmount;  //số tấn hàng đã vận chuyển


    public Ex2_Truck(String brand, String manufactureYear, String address, long price, float weight, String id,
                     int numberOfWheel, String engineType, String name, String color, Owner owner, float payload,
                     String purpose, float shippedAmount) {
        super(brand, manufactureYear, address, price, weight, id, numberOfWheel, engineType, name, color, owner);
        this.payload = payload;
        this.purpose = purpose;
        this.shippedAmount = shippedAmount;
    }


    public float getPayload() {
        return payload;
    }

    public void setPayload(float payload) {
        this.payload = payload;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public float getShippedAmount() {
        return shippedAmount;
    }

    public void setShippedAmount(float shippedAmount) {
        this.shippedAmount = shippedAmount;
    }
}
