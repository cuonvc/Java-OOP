package lesson29.Ex1.Comparator;

import lesson29.Ex1.Animal;

import java.util.Comparator;

public class SortByName implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
