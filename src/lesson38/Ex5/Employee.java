package lesson38.Ex5;

import java.util.Date;

public class Employee {
    private String personId;
    private String fullName;
    private Date dayOfBirth;
    private float wages;

    public Employee() {
    }

    public Employee(String personId, String fullName) {
        this.personId = personId;
        this.fullName = fullName;
    }

    public final String getPersonId() {
        return personId;
    }

    public final void setPersonId(String personId) {
        this.personId = personId;
    }

    public final String getFullName() {
        return fullName;
    }

    public final void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public final Date getDayOfBirth() {
        return dayOfBirth;
    }

    public final void setDayOfBirth(Date dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public final float getWages() {
        return wages;
    }

    public final void setWages(float wages) {
        this.wages = wages;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "personId='" + personId + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
