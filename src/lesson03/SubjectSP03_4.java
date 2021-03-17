package lesson03;

public class SubjectSP03_4 {
//properties
    private String id;
    private String name;
    private int terms;
    private int lesson;
    private int test;




//constructor
    //default constructor (khởi tạo mặc định)
    public SubjectSP03_4() {
        id = "";
        name = "";
        terms = 0;
        lesson = 0;
        test = 0;
    }
    //constructor 1 tham số
    public SubjectSP03_4(String id) {
        this.id = id;
    }
    //constructor 2 tham số
    public SubjectSP03_4(String id, String name) {
        this.id = id;
        this.name = name;
    }
    //constructor 3 tham số
    public SubjectSP03_4(String id, String name, int terms) {
        this.id = id;
        this.name = name;
        this.terms = terms;
    }
    //constructor 4 tham số
    public SubjectSP03_4(String id, String name, int terms, int lesson) {
        this.id = id;
        this.name = name;
        this.terms = terms;
        this.lesson = lesson;
    }
    //constructor 5 tham số
    public SubjectSP03_4(String id, String name, int terms, int lesson, int test) {
        this.id = id;
        this.name = name;
        this.terms = terms;
        this.lesson = lesson;
        this.test = test;
    }




//getter and setter

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTerms() {
        return terms;
    }

    public void setTerms(int terms) {
        this.terms = terms;
    }

    public int getLesson() {
        return lesson;
    }

    public void setLesson(int lesson) {
        this.lesson = lesson;
    }

    public int getTest() {
        return test;
    }

    public void setTest(int test) {
        this.test = test;
    }




//phương thức hiển thị các thông tin của môn học
    public void showInfoLine() {
        System.out.printf("%-15s %-16s %-15d %-15d %-15d \n", id, name, terms, lesson, test);
    }
}
