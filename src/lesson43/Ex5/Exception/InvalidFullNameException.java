package lesson43.Ex5.Exception;

public class InvalidFullNameException extends Exception{
    private String InvalidFullName;

    public InvalidFullNameException() {
    }

    public InvalidFullNameException(String invalidFullName) {
        InvalidFullName = invalidFullName;
    }

    public InvalidFullNameException(String message, String invalidFullName) {
        super(message);
        InvalidFullName = invalidFullName;
    }

    public final String getInvalidFullName() {
        return InvalidFullName;
    }

    public final void setInvalidFullName(String invalidFullName) {
        InvalidFullName = invalidFullName;
    }
}
