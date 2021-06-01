package lesson25.Ex2;

public class ElectricBike extends Transpost {
    private String color;  //màu sắc
    private float voltage;  //điện áp ắc quy
    private float kilometOfFullCharge;  //số km đi được trong 1 lần sạc
    private float timeOfFullCharge;  //thời gian sạc đầy
    private float voltageOfCharge;  //điện áp sạc




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

    public final float getTimeOfFullCharge() {
        return timeOfFullCharge;
    }

    public final void setTimeOfFullCharge(float timeOfFullCharge) {
        this.timeOfFullCharge = timeOfFullCharge;
    }

    public final float getVoltageOfCharge() {
        return voltageOfCharge;
    }

    public final void setVoltageOfCharge(float voltageOfCharge) {
        this.voltageOfCharge = voltageOfCharge;
    }




    @Override
    public void turnOn() {
        System.out.println("Khởi động xe điện");
    }

    @Override
    public void turnOff() {
        System.out.println("Tắt xe điện");
    }

    @Override
    public void speedUp() {
        System.out.println("Xe điện tăng tốc");
    }

    @Override
    public void stop() {
        System.out.println("Xe điện dừng lại");
    }

    @Override
    public void lightOn() {
        System.out.println("Xe điện bật đèn");
    }
}
