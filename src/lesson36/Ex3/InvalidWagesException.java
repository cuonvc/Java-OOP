package lesson36.Ex3;

public class InvalidWagesException extends Exception {
    private long invalidWages;

    public InvalidWagesException(long invalidWages) {
        this.invalidWages = invalidWages;
    }

    public InvalidWagesException(String message, long invalidWages) {
        super(message);
        this.invalidWages = invalidWages;
    }

    public long getInvalidWages() {
        return invalidWages;
    }

    public void setInvalidWages(long invalidWages) {
        this.invalidWages = invalidWages;
    }
}
