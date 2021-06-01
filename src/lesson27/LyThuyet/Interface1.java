package lesson27.LyThuyet;

public interface Interface1 {
    default void show(String msg) {
        System.out.println("Gọi show() của interface1: " + msg);
    }
}



interface Interface2 {
    default void show(String msg) {
        System.out.println("Gọi show() của interface2: " + msg    );
    }
}

//nếu class mà kế thừa 2 hoặc nhiều interface có phương thức default giống nhau
// thì phải implement phương thức đó ra (trường hợp này là phương thức show)
class Example implements Interface1, Interface2{
    public static void main(String[] args) {
        Example example = new Example();
        var msg = "I'm a devoloper";
        example.show(msg);
    }

    @Override
    public void show(String msg) {
        Interface1.super.show(msg);   //hiển thị phương thức của Interface1
        Interface2.super.show(msg);   //hiển thị phương thức của Interface2
        System.out.println("Gọi show() của Example: " + msg);  //còn đây chỉ là gọi ra String ở chính lớp Example
    }
}