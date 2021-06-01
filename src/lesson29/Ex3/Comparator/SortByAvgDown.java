package lesson29.Ex3.Comparator;

import lesson29.Ex3.Student;

import java.util.Comparator;

public class SortByAvgDown implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAvgGrade() > o2.getAvgGrade()) {
            return -1;
        } else if (o1.getAvgGrade() == o2.getAvgGrade()) {
            return 0;
        } else {
            return 1;
        }
    }
}
