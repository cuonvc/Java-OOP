package lesson43.Ex5.comparator;

import lesson43.Ex5.Employee;

import java.util.Comparator;

public class SortByNameDown implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o2.getFirstName().compareTo(o1.getFirstName());
    }
}
