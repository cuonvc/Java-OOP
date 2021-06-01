package lesson36.Ex5.Comparator;

import lesson36.Ex5.Employee;

import java.util.Comparator;

public class SortByBirthDown implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o2.getDayOfBirth().getTime() < o1.getDayOfBirth().getTime()) { //tức là o2-o1=âm
            return -1;
        } else if (o1.getDayOfBirth().getTime() == o2.getDayOfBirth().getTime()) {
            return 0;
        } else {
            return 1;
        }
    }
}
