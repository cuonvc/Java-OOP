package lesson36.Ex5.Comparator;

import lesson36.Ex5.Employee;
import lesson36.Ex5.Person;

import java.util.Comparator;

public class SortByName implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getFullNameStr().compareTo(o2.getFullNameStr());
    }
}
