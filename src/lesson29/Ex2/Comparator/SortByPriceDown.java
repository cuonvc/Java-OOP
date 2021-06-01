package lesson29.Ex2.Comparator;

import lesson29.Ex2.Transport;

import java.util.Comparator;

public class SortByPriceDown implements Comparator<Transport> {
    @Override
    public int compare(Transport o1, Transport o2) {
        if (o2.getPrice() > o1.getPrice()) {
            return 1;
        } else if (o1.getPrice() == o2.getPrice()){
            return 0;
        } else {
            return -1;
        }
    }
}
