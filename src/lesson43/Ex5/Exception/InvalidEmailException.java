package lesson43.Ex5.Exception;

public class InvalidEmailException extends Exception{
    private String invalidEmail;

    public InvalidEmailException(String invalidEmail) {
        this.invalidEmail = invalidEmail;
    }

    public InvalidEmailException(String message, String invalidEmail) {
        super(message);
        this.invalidEmail = invalidEmail;
    }

    public final String getInvalidEmail() {
        return invalidEmail;
    }

    public final void setInvalidEmail(String invalidEmail) {
        this.invalidEmail = invalidEmail;
    }
}
