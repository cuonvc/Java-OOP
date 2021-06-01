package lesson36.Ex1;

public class InvalidAgeException extends Exception {
    private float invalidAge;

    public InvalidAgeException(float invalidAge) {
        this.invalidAge = invalidAge;
    }

    public InvalidAgeException(String message, float invalidAge) {
        super(message);
        this.invalidAge = invalidAge;
    }


    public float getInvalidAge() {
        return invalidAge;
    }

    public void setInvalidAge(float invalidAge) {
        this.invalidAge = invalidAge;
    }
}
