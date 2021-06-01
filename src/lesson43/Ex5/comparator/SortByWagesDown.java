package lesson43.Ex5.comparator;

import lesson43.Ex5.Employee;

import java.util.Comparator;

public class SortByWagesDown implements Comparator<Employee> {
    @Override
    public int compare(Employee o2, Employee o1) {
        if (o2.getWages() < o1.getWages()) {
            return 1;
        } else if (o2.getWages() == o1.getWages()) {
            return 0;
        } else {
            return -1;
        }
    }
}
