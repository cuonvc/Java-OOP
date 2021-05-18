package lesson28;
//tạo một lớp vô danh từ một lớp bình thường
public class Father {
    public void speak() {
        System.out.println("My father is speaking EN");
    }
}

class FatherExample {
    public static void main(String[] args) {
        //tạo lớp vô danh kế thừa lớp Father
        Father son = new Father() {
            @Override
            public void speak() {
                super.speak();
                System.out.println("Son is speaking VNms");
            }
        };


        //sử dụng đối tượng của lớp vô danh
        son.speak();
    }
}