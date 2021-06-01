package lesson43.Ex4.Comparator;

import lesson43.Ex4.Smartphone;

import java.util.Comparator;

public class SortByYearDown implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o2, Smartphone o1) {
        if (o2.getManufactureYear() < o1.getManufactureYear()) {
            return 1;
        } else if (o1.getManufactureYear() == o2.getManufactureYear()) {
            return 0;
        } else {
            return -1;
        }
    }
}
