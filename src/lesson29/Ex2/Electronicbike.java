package lesson29.Ex2;

public class Electronicbike extends Transport {
    private String color;  //màu sắc
    private float voltage;  //điện áp sạc
    private float kilometOfFullCharge;  //số km cho một lần sạc đầy
    private float timeCharge;  //thời gian sạc

    public Electronicbike(String color, float voltage,
                          float kilometOfFullCharge, float timeCharge) {
        this.color = color;
        this.voltage = voltage;
        this.kilometOfFullCharge = kilometOfFullCharge;
        this.timeCharge = timeCharge;
    }

    public Electronicbike(String brand, int manufactureYear, String madeIn, Double price, float weight) {
        super(brand, manufactureYear, madeIn, price, weight);
    }

    public final String getColor() {
        return color;
    }

    public final void setColor(String color) {
        this.color = color;
    }

    public final float getVoltage() {
        return voltage;
    }

    public final void setVoltage(float voltage) {
        this.voltage = voltage;
    }

    public final float getKilometOfFullCharge() {
        return kilometOfFullCharge;
    }

    public final void setKilometOfFullCharge(float kilometOfFullCharge) {
        this.kilometOfFullCharge = kilometOfFullCharge;
    }

    public final float getTimeCharge() {
        return timeCharge;
    }

    public final void setTimeCharge(float timeCharge) {
        this.timeCharge = timeCharge;
    }



    @Override
    void turnOn() {
        System.out.println("Xe điện khởi động");
    }

    @Override
    void turnOff() {
        System.out.println("Xe điện tắt máy");
    }

    @Override
    void speedUp() {
        System.out.println("Xe điện tăng tốc");
    }

    @Override
    void stop() {
        System.out.println("Xe điện phanh lại");
    }

    @Override
    void lightOn() {
        System.out.println("Xe điện bật đèn");
    }

}
