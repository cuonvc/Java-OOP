package lesson38.Ex3;

public class Subject {
    private String subjectId;
    private String subjectName;
    private int numberOfCredit;

    public Subject() {
    }

    public Subject(String subjectId, String subjectName, int numberOfCredit) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.numberOfCredit = numberOfCredit;
    }

    public final String getSubjectId() {
        return subjectId;
    }

    public final void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public final String getSubjectName() {
        return subjectName;
    }

    public final void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public final int getNumberOfCredit() {
        return numberOfCredit;
    }

    public final void setNumberOfCredit(int numberOfCredit) {
        this.numberOfCredit = numberOfCredit;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectId='" + subjectId + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", numberOfCredit=" + numberOfCredit +
                '}';
    }
}
