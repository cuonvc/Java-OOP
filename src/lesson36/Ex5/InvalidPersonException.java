package lesson36.Ex5;

import java.util.Date;

public class InvalidPersonException extends Exception {
    private String invalidFullName;
    private int invalidDayInTheMonth;
    private Date invalidDayOfBirth;

    public InvalidPersonException(int invalidDayInTheMonth) {
        this.invalidDayInTheMonth = invalidDayInTheMonth;
    }

    public InvalidPersonException(String message, int invalidDayInTheMonth) {
        super(message);
        this.invalidDayInTheMonth = invalidDayInTheMonth;
    }

    public InvalidPersonException(String message, String invalidFullName) {
        super(message);
        this.invalidFullName = invalidFullName;
    }


    public final String getInvalidFullName() {
        return invalidFullName;
    }

    public final void setInvalidFullName(String invalidFullName) {
        this.invalidFullName = invalidFullName;
    }

    public final int getInvalidDayInTheMonth() {
        return invalidDayInTheMonth;
    }

    public final void setInvalidDayInTheMonth(int invalidDayInTheMonth) {
        this.invalidDayInTheMonth = invalidDayInTheMonth;
    }

//    public final Date getInvalidDayOfBirth() {
//        return invalidDayOfBirth;
//    }
//
//    public final void setInvalidDayOfBirth(Date invalidDayOfBirth) {
//        this.invalidDayOfBirth = invalidDayOfBirth;
//    }
}
