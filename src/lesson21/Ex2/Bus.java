package lesson21.Ex2;

public class Bus extends Automobile{
    private int numberOfChair;   //số ghế ngồi
    private float maxPayload;  //trọng tải tối đa
    private float petrolCapacity;   //dung tích bình xăng
    private long guestShipped;  //số khách đã chở

    public Bus(int numberOfChair, float maxPayload, float petrolCapacity, long guestShipped) {
        this.numberOfChair = numberOfChair;
        this.maxPayload = maxPayload;
        this.petrolCapacity = petrolCapacity;
        this.guestShipped = guestShipped;
    }

    public Bus(int numberOfWheel, String typeOfEngine, String name,
               String color, String owner, int numberOfChair, float maxPayload,
               float petrolCapacity, long guestShipped) {
        super(numberOfWheel, typeOfEngine, name, color, owner);
        this.numberOfChair = numberOfChair;
        this.maxPayload = maxPayload;
        this.petrolCapacity = petrolCapacity;
        this.guestShipped = guestShipped;
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


    public final int getNumberOfChair() {
        return numberOfChair;
    }

    public final void setNumberOfChair(int numberOfChair) {
        this.numberOfChair = numberOfChair;
    }

    public final float getMaxPayload() {
        return maxPayload;
    }

    public final void setMaxPayload(float maxPayload) {
        this.maxPayload = maxPayload;
    }

    public final float getPetrolCapacity() {
        return petrolCapacity;
    }

    public final void setPetrolCapacity(float petrolCapacity) {
        this.petrolCapacity = petrolCapacity;
    }

    public final long getGuestShipped() {
        return guestShipped;
    }

    public final void setGuestShipped(long guestShipped) {
        this.guestShipped = guestShipped;
    }
}
