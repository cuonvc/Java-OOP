package lesson29.Ex2;

public class Truck extends Automobile {
    private float tonnage;  //trọng tải
    private String uses;  //mục đích sử dụng
    private String shippedGoods;  //số hàng hóa đã vận chuyển

    public Truck(float tonnage, String uses, String shippedGoods) {
        this.tonnage = tonnage;
        this.uses = uses;
        this.shippedGoods = shippedGoods;
    }

    public Truck(int numberOfWheel, String typeOfEngine, String name,
                 String color, Owner owner, float tonnage,
                 String uses, String shippedGoods) {
        super(numberOfWheel, typeOfEngine, name, color, owner);
        this.tonnage = tonnage;
        this.uses = uses;
        this.shippedGoods = shippedGoods;
    }

    public final float getTonnage() {
        return tonnage;
    }

    public final void setTonnage(float tonnage) {
        this.tonnage = tonnage;
    }

    public final String getUses() {
        return uses;
    }

    public final void setUses(String uses) {
        this.uses = uses;
    }

    public final String getShippedGoods() {
        return shippedGoods;
    }

    public final void setShippedGoods(String shippedGoods) {
        this.shippedGoods = shippedGoods;
    }
}
