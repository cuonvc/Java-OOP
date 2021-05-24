package lesson36.UncheckedEx;

public class InvalidGradeException extends RuntimeException {
    private float invalidGrade;

    public InvalidGradeException(float invalidGrade) {
        this.invalidGrade = invalidGrade;
    }

    public InvalidGradeException(String message, float invalidGrade) {
        super(message);
        this.invalidGrade = invalidGrade;
    }


    public float getInvalidGrade() {
        return invalidGrade;
    }

    public void setInvalidGrade(float invalidGrade) {
        this.invalidGrade = invalidGrade;
    }
}
