package lesson29.Ex1.Comparator;

import lesson29.Ex1.Animal;

import java.util.Comparator;

public class SortByWeightUP implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        if (o1.getWeight() > o2.getWeight()) {
            return 1;
        } else if (o1.getWeight() == o2.getWeight()) {
            return 0;
        } else {
            return -1;
        }
    }
}
