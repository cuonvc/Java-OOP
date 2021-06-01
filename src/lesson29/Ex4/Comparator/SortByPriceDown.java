package lesson29.Ex4.Comparator;

import lesson29.Ex4.Smartphone;

import java.util.Comparator;

public class SortByPriceDown implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        if (o1.getPrice() > o2.getPrice()) {
            return -1;
        } else if (o1.getPrice() == o2.getPrice()) {
            return 0;
        } else {
            return 1;
        }
    }
}
