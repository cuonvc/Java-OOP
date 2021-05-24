package lesson36.Ex5.Comparator;

import lesson36.Ex5.Employee;

import java.util.Comparator;

public class SortByExperience implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getExperience() < o2.getExperience()) {  //tức là o1-o2=âm
            return -1;
        } else if (o1.getExperience() == o2.getExperience()) {
            return 0;
        } else {
            return 1;
        }
    }
}
