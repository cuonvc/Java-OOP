package lesson29.Ex4.Comparator;

import lesson29.Ex4.Smartphone;

import java.util.Comparator;

public class SortByBrandDown implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o2.getBrand().compareTo(o1.getBrand());
    }
}
