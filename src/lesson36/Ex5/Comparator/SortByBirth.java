package lesson36.Ex5.Comparator;

import lesson36.Ex5.Employee;

import java.util.Comparator;

public class SortByBirth implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getDayOfBirth().getTime() < o2.getDayOfBirth().getTime()) { //tức là o1-o2=âm
            return -1;
        } else if (o1.getDayOfBirth().getTime() == o2.getDayOfBirth().getTime()) {
            return 0;
        }
        return 1;
    }
}
