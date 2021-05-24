package lesson36.UncheckedEx;

public class Student {
    private String id;
    private String fullName;
    private float avgGrade;

    public Student() {
    }

    public Student(String id) {
        this.id = id;
    }

    public Student(String id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public Student(String id, String fullName, float avgGrade) {
        this.id = id;
        this.fullName = fullName;
        setAvgGrade(avgGrade);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public float getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(float avgGrade) {
        if (avgGrade >= 0 && avgGrade <= 10) {
            this.avgGrade = avgGrade;
        } else {
            this.avgGrade = 0.0f;
            String msg = "Điểm không hợp lệ";
            throw new InvalidGradeException(msg, avgGrade);
        }
    }
}
