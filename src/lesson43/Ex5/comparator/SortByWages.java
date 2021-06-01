package lesson43.Ex5.comparator;

import lesson43.Ex5.Employee;

import java.util.Comparator;

public class SortByWages implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getWages() < o2.getWages()) {
            return -1;
        } else if (o1.getWages() == o2.getWages()) {
            return 0;
        } else {
            return 1;
        }
    }
}
