package lesson38.Ex3;

public class RegisterStudent<K, V> {
    private K subject;
    private V numberOfStudent;

    public RegisterStudent() {
    }

    public RegisterStudent(K subject, V numberOfStudent) {
        this.subject = subject;
        this.numberOfStudent = numberOfStudent;
    }

    public K getSubject() {
        return subject;
    }

    public void setSubject(K subject) {
        this.subject = subject;
    }

    public V getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(V numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    @Override
    public String toString() {
        return "RegisterStudent{" +
                "subject=" + subject +
                ", numberOfStudent=" + numberOfStudent +
                '}';
    }
}
