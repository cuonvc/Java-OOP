package lesson43.Ex2;

public class InvalidAmountStringException extends Exception{
    private String invalidAmountString;

    public InvalidAmountStringException(String invalidAmountString) {
        this.invalidAmountString = invalidAmountString;
    }

    public InvalidAmountStringException(String message, String invalidAmountString) {
        super(message);
        this.invalidAmountString = invalidAmountString;
    }

    public String getInvalidAmountString() {
        return invalidAmountString;
    }

    public void setInvalidAmountString(String invalidAmountString) {
        this.invalidAmountString = invalidAmountString;
    }
}
