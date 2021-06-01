package lesson43.Ex5.comparator;


import lesson43.Ex5.Employee;

import java.util.Comparator;

public class SortByDateDown implements Comparator<Employee> {

    @Override
    public int compare(Employee o2, Employee o1) {
        if (o2.getDayOfBirth().getTime() < o1.getDayOfBirth().getTime()) {
            return 1;
        } else if (o2.getDayOfBirth().getTime() == o1.getDayOfBirth().getTime()) {
            return 0;
        } else {
            return -1;
        }
    }
}
