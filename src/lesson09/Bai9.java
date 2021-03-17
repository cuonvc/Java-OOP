package lesson09;

public class Bai9 {
    public static void main(String[] args) {
        Student Cuong = new Student();
        Student.FullName fullname = Cuong.new FullName();

        //tuy 2 cái bên dưới đều gọi ra SeasonSP04 nhưng
        SeasonSP04 fall = SeasonSP04.FALL;   //thằng này là lớp season của package lesson09
        lesson04.SeasonSP04 spring = lesson04.SeasonSP04.SPRING;   //thằng này là season của package lesson04
        //tóm lại là nếu 2 class mà trùng tên nhau. nếu class nào ở trong package của nó thì cứ khai báo như bình thường
        //còn class nào bên ngoài package đó thì phải chỉ rõ cái gói của nó là lesssonX.tenClass
    }

}

