package lesson36.Ex4.Comparator;

import lesson36.Ex4.Smartphone;

import java.util.Comparator;

public class SortByBrand implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getBrand().compareTo(o2.getBrand());
    }
}
