package lesson36.Ex5.Comparator;

import lesson36.Ex5.Employee;

import java.util.Comparator;

public class SortByNameDown implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o2.getFullNameStr().compareTo(o1.getFullNameStr());
    }
}
