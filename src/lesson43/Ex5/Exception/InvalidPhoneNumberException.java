package lesson43.Ex5.Exception;

public class InvalidPhoneNumberException extends Exception{
    private String invalidPhone;

    public InvalidPhoneNumberException() {
    }

    public InvalidPhoneNumberException(String invalidPhone) {
        this.invalidPhone = invalidPhone;
    }

    public InvalidPhoneNumberException(String message, String invalidPhone) {
        super(message);
        this.invalidPhone = invalidPhone;
    }

    public final String getInvalidPhone() {
        return invalidPhone;
    }

    public final void setInvalidPhone(String invalidPhone) {
        this.invalidPhone = invalidPhone;
    }
}
