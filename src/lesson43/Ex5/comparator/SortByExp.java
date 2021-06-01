package lesson43.Ex5.comparator;

import lesson43.Ex5.Employee;

import java.util.Comparator;

public class SortByExp implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getExperience() < o2.getExperience()) {
            return -1;
        } else if (o1.getExperience() == o2.getExperience()) {
            return 0;
        } else {
            return 1;
        }
    }
}
