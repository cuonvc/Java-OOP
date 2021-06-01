package lesson27.Ex1;

public interface AnimalAction {
    void eat(String food);    //ăn
    void sleep();    //ngủ
    void move();    //di chuyển
    void reproduction();    //sinh sản


    default void talk() {
        System.out.println("Giao tiếp với con cái");
    }

    default void shower() {
        System.out.println("Bọn chúng đang tắm bùn");
    }
}
