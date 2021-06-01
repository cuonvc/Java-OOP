package lesson29.Ex3.Comparator;

import lesson29.Ex3.Teacher;

import java.util.Comparator;

public class SortByExpDown implements Comparator<Teacher> {
    @Override
    public int compare(Teacher o1, Teacher o2) {
        if (o1.getExperience() > o2.getExperience()) {
            return -1;
        } else if (o1.getExperience() == o2.getExperience()){
            return 0;
        } else {
            return 1;
        }
    }
}
