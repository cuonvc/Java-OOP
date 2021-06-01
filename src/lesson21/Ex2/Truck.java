package lesson21.Ex2;


public class Truck extends Automobile{
    private float payload;   //trọng tải (tấn)
    private String purpose;  //mục đích sử dụng
    private float shipped;   //số hàng hóa đã vận chuyển (tấn)


    public Truck(float payload, String purpose, float shipped) {
        this.payload = payload;
        this.purpose = purpose;
        this.shipped = shipped;
    }

    public Truck(int numberOfWheel, String typeOfEngine, String name,
                 String color, String owner, float payload, String purpose, float shipped) {
        super(numberOfWheel, typeOfEngine, name, color, owner);
        this.payload = payload;
        this.purpose = purpose;
        this.shipped = shipped;
    }



    @Override
    public void active() {
        super.active();
    }

    @Override
    public void shutdown() {
        super.shutdown();
    }

    @Override
    public void speedUp() {
        super.speedUp();
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public void turnOnLight() {
        super.turnOnLight();
    }


    public final float getPayload() {
        return payload;
    }

    public final void setPayload(float payload) {
        this.payload = payload;
    }

    public final String getPurpose() {
        return purpose;
    }

    public final void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public final float getShipped() {
        return shipped;
    }

    public final void setShipped(float shipped) {
        this.shipped = shipped;
    }
}
