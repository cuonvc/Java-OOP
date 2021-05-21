package lesson29.Ex2.Comparator;

import lesson29.Ex2.Transport;

import java.util.Comparator;

public class SortByYearDown implements Comparator<Transport> {
    @Override
    public int compare(Transport o1, Transport o2) {
        return o2.getManufactureYear() - o1.getManufactureYear();
    }
}
