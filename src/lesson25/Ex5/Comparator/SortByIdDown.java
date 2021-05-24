package lesson25.Ex5.Comparator;

import lesson29.Ex5.Employee;

import java.util.Comparator;

public class SortByIdDown implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o2.getIdEmp().compareTo(o1.getIdEmp());
    }
}
