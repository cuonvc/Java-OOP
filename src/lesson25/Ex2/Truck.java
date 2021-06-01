package lesson25.Ex2;

public class Truck extends Automobile {
    private float tonnage;  //trọng tải (tấn)
    private String purpose;  //mục đích sử dụng
    private float merchandiseShipped;  //số hàng hóa đã vận chuyển (tấn)


    public final float getTonnage() {
        return tonnage;
    }

    public final void setTonnage(float tonnage) {
        this.tonnage = tonnage;
    }

    public final String getPurpose() {
        return purpose;
    }

    public final void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public final float getMerchandiseShipped() {
        return merchandiseShipped;
    }

    public final void setMerchandiseShipped(float merchandiseShipped) {
        this.merchandiseShipped = merchandiseShipped;
    }


    @Override
    public void turnOn() {
        System.out.println("xe tải nổ máy");
    }

    @Override
    public void turnOff() {
        System.out.println("Xe tải tắt máy");
    }

    @Override
    public void speedUp() {
        System.out.println("Xe tải tăng tốc");
    }

    @Override
    public void stop() {
        System.out.println("Xe tải dùng lại");
    }

    @Override
    public void lightOn() {
        System.out.println("Xe tải bật đèn");
    }
}
