package lesson41.TreeSet;

public class Car implements Comparable<Car>{
    private String brand;

    public Car() {
    }

    public Car(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return this.brand.compareTo(o.brand);
    }
}
