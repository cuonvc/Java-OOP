package lesson18.Ex2;

public class Ex2_ElectricBike extends Ex2_Transport {
    private String color;
    private float voltage;  //điện áp ắc quy
    private float kmNumberOfCharging;  //số km cho một lần sạc
    private float ChargingTime;  //thời gian sạc đầy
    private float chargingVoltage;  //điện áp khi sạc

    public Ex2_ElectricBike(String brand, String manufactureYear, String address, long price, float weight,
                            String id, String color, float voltage, float kmNumberOfCharging, float chargingTime,
                            float chargingVoltage) {
        super(brand, manufactureYear, address, price, weight, id);
        this.color = color;
        this.voltage = voltage;
        this.kmNumberOfCharging = kmNumberOfCharging;
        ChargingTime = chargingTime;
        this.chargingVoltage = chargingVoltage;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getVoltage() {
        return voltage;
    }

    public void setVoltage(float voltage) {
        this.voltage = voltage;
    }

    public float getKmNumberOfCharging() {
        return kmNumberOfCharging;
    }

    public void setKmNumberOfCharging(float kmNumberOfCharging) {
        this.kmNumberOfCharging = kmNumberOfCharging;
    }

    public float getChargingTime() {
        return ChargingTime;
    }

    public void setChargingTime(float chargingTime) {
        ChargingTime = chargingTime;
    }

    public float getChargingVoltage() {
        return chargingVoltage;
    }

    public void setChargingVoltage(float chargingVoltage) {
        this.chargingVoltage = chargingVoltage;
    }
}
