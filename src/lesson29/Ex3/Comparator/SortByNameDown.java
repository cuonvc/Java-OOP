package lesson29.Ex3.Comparator;

import lesson29.Ex3.Teacher;

import java.util.Comparator;

public class SortByNameDown implements Comparator<Teacher> {
    @Override
    public int compare(Teacher o1, Teacher o2) {
        return o2.getFullName().compareTo(o1.getFullName());
    }
}
