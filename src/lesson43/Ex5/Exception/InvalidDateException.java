package lesson43.Ex5.Exception;

public class InvalidDateException extends Exception{
    private String invalidDate;

    public InvalidDateException() {
    }

    public InvalidDateException(String invalidDate) {
        this.invalidDate = invalidDate;
    }

    public InvalidDateException(String message, String invalidDate) {
        super(message);
        this.invalidDate = invalidDate;
    }

    public final String getInvalidDate() {
        return invalidDate;
    }

    public final void setInvalidDate(String invalidDate) {
        this.invalidDate = invalidDate;
    }
}
