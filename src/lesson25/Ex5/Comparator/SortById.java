package lesson25.Ex5.Comparator;

import lesson29.Ex5.Employee;

import java.util.Comparator;

public class SortById implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getIdEmp().compareTo(o2.getIdEmp());
    }
}
