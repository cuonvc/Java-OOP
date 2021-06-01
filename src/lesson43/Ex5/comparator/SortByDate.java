package lesson43.Ex5.comparator;

import lesson43.Ex5.Employee;

import java.util.Comparator;

public class SortByDate implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getDayOfBirth().getTime() < o2.getDayOfBirth().getTime()) {
            return -1;
        } else if (o1.getDayOfBirth().getTime() == o2.getDayOfBirth().getTime()) {
            return 0;
        } else {
            return 1;
        }
    }
}
