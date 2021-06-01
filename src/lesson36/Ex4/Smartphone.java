package lesson36.Ex4;

public class Smartphone implements Comparable <Smartphone>{
    private String id;
    private String brand;
    private String name;
    private float price;
    private int manufactureYear;
    private float size;

    public Smartphone() {
    }

    public Smartphone(String id, String brand, String name, float price,
                      int manufactureYear, float size) throws InvalidBrandException {
        this.id = id;
        setBrand(brand);
        this.name = name;
        this.price = price;
        this.manufactureYear = manufactureYear;
        this.size = size;
    }

    public final String getId() {
        return id;
    }

    public final void setId(String id) {
        this.id = id;
    }

    public final String getBrand() {
        return brand;
    }

    public final void setBrand(String brand) throws InvalidBrandException {
        if (checkBrand(brand)) {
            this.brand = brand;
        } else {
            this.brand = null;
            String msg = "Tên hãng không hợp lệ";
            throw new InvalidBrandException(msg, brand);
        }
    }

    /**
     * kiểm tra xem brand nhập vào có trùng với một trong các phần tử của brand[] hay ko
     * @param brand
     * @return
     */
    private boolean checkBrand(String brand) {
        String[] brands = {"Apple", "SamSung",
                "Huawei", "Xiaomi", "Vsmart", "Oppo"};
        for (var br : brands) {
            if (br.compareToIgnoreCase(brand) == 0) {
                return true;
            }
        }
        return false;
    }


    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final float getPrice() {
        return price;
    }

    public final void setPrice(float price) {
        this.price = price;
    }

    public final int getManufactureYear() {
        return manufactureYear;
    }

    public final void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public final float getSize() {
        return size;
    }

    public final void setSize(float size) {
        this.size = size;
    }


    @Override
    public int compareTo(Smartphone o) {
        return this.id.compareTo(o.id);
    }
}
