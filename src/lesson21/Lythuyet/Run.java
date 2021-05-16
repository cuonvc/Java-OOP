package lesson21.Lythuyet;

public class Run {
    public static void main(String[] args) {

        Person person = new Person();  //Gọi phương thức từ đối tượng của Person
        person.work();

        System.out.println("=================================");
        Student student = new Student();  //gọi phương thức (Override) từ đối tương của Student
        student.work();

        System.out.println("=================================");
        Person Cuong = new Student();    //gọi phương thức từ đối tưởng Person và tham chiếu đến Student
        Cuong.work();






//        Animal animal = new Animal();
//        Animal dog = new dog();
//        Animal cat = new cat();
//        Animal bird = new bird();
//
//        //show
//        animal.move();
//        dog.move();
//        cat.move();
//        bird.move();
    }
}
