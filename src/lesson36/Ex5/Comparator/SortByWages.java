package lesson36.Ex5.Comparator;

import lesson36.Ex5.Employee;

import java.util.Comparator;

public class SortByWages implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getBasicWages() < o2.getBasicWages()) {  //tức là o1-o2=âm (thằng trước phải nhỏ hơn thằng sau)
            return -1;
        } else if (o1.getBasicWages() == o2.getBasicWages()){
            return 0;
        } else {
            return 1;
        }
    }
}
