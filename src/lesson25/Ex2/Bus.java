package lesson25.Ex2;

public class Bus extends Automobile{
    private int numberOfseat;   //số ghế ngồi
    private float tonnageMax;  //tải trọng tối đa
    private float capacityEnergy;  //sức chứa bình xăng
    private long shippedPerson;  //số khách đã chở




    public final int getNumberOfseat() {
        return numberOfseat;
    }

    public final void setNumberOfseat(int numberOfseat) {
        this.numberOfseat = numberOfseat;
    }

    public final float getTonnageMax() {
        return tonnageMax;
    }

    public final void setTonnageMax(float tonnageMax) {
        this.tonnageMax = tonnageMax;
    }

    public final float getCapacityEnergy() {
        return capacityEnergy;
    }

    public final void setCapacityEnergy(float capacityEnergy) {
        this.capacityEnergy = capacityEnergy;
    }

    public final long getShippedPerson() {
        return shippedPerson;
    }

    public final void setShippedPerson(long shippedPerson) {
        this.shippedPerson = shippedPerson;
    }




    @Override
    public void turnOn() {
        System.out.println("Xe khách nổ máy");
    }

    @Override
    public void turnOff() {
        System.out.println("xe khách tắt máy");
    }

    @Override
    public void speedUp() {
        System.out.println("Xe khách tăng tốc");
    }

    @Override
    public void stop() {
        System.out.println("Xe khách dừng lại");
    }

    @Override
    public void lightOn() {
        System.out.println("Xe khách bật đèn");
    }
}
