package lesson43.Ex3;

public class InvalidStringWagesException extends Exception{
    private float InvalidWages;

    public InvalidStringWagesException(float invalidWages) {
        InvalidWages = invalidWages;
    }

    public InvalidStringWagesException(String message, float invalidWages) {
        super(message);
        InvalidWages = invalidWages;
    }

    public float getInvalidWages() {
        return InvalidWages;
    }

    public void setInvalidWages(float invalidWages) {
        InvalidWages = invalidWages;
    }
}
