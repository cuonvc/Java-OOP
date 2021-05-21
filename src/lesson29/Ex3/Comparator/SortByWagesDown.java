package lesson29.Ex3.Comparator;

import lesson29.Ex3.Teacher;

import java.util.Comparator;

public class SortByWagesDown implements Comparator<Teacher> {
    @Override
    public int compare(Teacher o1, Teacher o2) {
        if (o1.getWages() > o2.getWages()) {
            return -1;
        } else if (o1.getWages() == o2.getWages()) {
            return 0;
        } else {
            return 1;
        }
    }
}
