package lesson36.Ex5.Comparator;

import lesson36.Ex5.Employee;

import java.util.Comparator;

public class SortByWagesDown implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o2.getBasicWages() > o1.getBasicWages()) {  //tức là o2-01=dương (số sau lớn hơn số trước)
            return 1;
        } else if (o1.getBasicWages() == o2.getBasicWages()) {
            return 0;
        } else {
            return -1;
        }
    }
}
