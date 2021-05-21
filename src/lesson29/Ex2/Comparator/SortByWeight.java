package lesson29.Ex2.Comparator;

import lesson29.Ex2.Transport;

import java.util.Comparator;

public class SortByWeight implements Comparator<Transport> {
    @Override
    public int compare(Transport o1, Transport o2) {
        if (o2.getWeight() > o1.getWeight()) {
            return -1;
        } else if (o1.getWeight() == o2.getWeight()) {
            return 0;
        } else {
            return 1;
        }
    }
}
