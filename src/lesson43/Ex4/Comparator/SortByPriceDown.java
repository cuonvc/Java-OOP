package lesson43.Ex4.Comparator;

import lesson43.Ex4.Smartphone;

import java.util.Comparator;

public class SortByPriceDown implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o2, Smartphone o1) {   //cứ tăng thì so t1 với t2, còn giảm thì t2 với t1
        if (o2.getPrice() < o1.getPrice()) {
            return 1;
        } else if (o1.getPrice() == o2.getPrice()) {
            return 0;
        } else {
            return -1;
        }
    }
}
