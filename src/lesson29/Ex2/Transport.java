package lesson29.Ex2;

public abstract class Transport implements Comparable<Transport> {
    private String brand;
    private int manufactureYear;
    private String madeIn;
    private Double price;
    private Size size;
    private float weight;
    private String id;

    @Override
    /**
     * sắp xếp tên hãng theo thứ tự từ a-z
     */
    public int compareTo(Transport o) {
        return brand.compareTo(o.brand);
    }

    public Transport() {
    }

    public Transport(String brand, int manufactureYear, String madeIn, Double price, float weight) {
        this.brand = brand;
        this.manufactureYear = manufactureYear;
        this.madeIn = madeIn;
        this.price = price;
        this.weight = weight;
    }

    public Transport(String brand, int manufactureYear, String madeIn,
                     Double price, String size, float weight, String id) {
        this.brand = brand;
        this.manufactureYear = manufactureYear;
        this.madeIn = madeIn;
        this.price = price;
        this.setSize(size);
        this.weight = weight;
        this.id = id;
    }

    public final String getBrand() {
        return brand;
    }

    public final void setBrand(String brand) {
        this.brand = brand;
    }

    public final int getManufactureYear() {
        return manufactureYear;
    }

    public final void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public final String getMadeIn() {
        return madeIn;
    }

    public final void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public final Double getPrice() {
        return price;
    }

    public final void setPrice(Double price) {
        this.price = price;
    }

    public final String getSize() {
        return size.lengths + " x " + size.width + " x " + size.height;
    }

    public final void setSize(String size) {
        this.size = new Size();
        if (size != null && size.length() > 0) {
            String[] words = size.split("\\s+");
            this.size.lengths = Float.parseFloat(words[0]);
            this.size.width = Float.parseFloat(words[1]);
            this.size.height = Float.parseFloat(words[2]);
        }
    }

    public final float getWeight() {
        return weight;
    }

    public final void setWeight(float weight) {
        this.weight = weight;
    }

    public final String getId() {
        return id;
    }

    public final void setId(String id) {
        this.id = id;
    }

    class Size {
        private float lengths;
        private float width;
        private float height;

        public Size() {
        }

        public Size(float length, float width, float height) {
            this.lengths = length;
            this.width = width;
            this.height = height;
        }

        public final float getLength() {
            return lengths;
        }

        public final void setLength(float length) {
            this.lengths = length;
        }

        public final float getWidth() {
            return width;
        }

        public final void setWidth(float width) {
            this.width = width;
        }

        public final float getHeight() {
            return height;
        }

        public final void setHeight(float height) {
            this.height = height;
        }
    }


    abstract void turnOn();

    abstract void turnOff();

    abstract void speedUp();

    abstract void stop();

    abstract void lightOn();
}