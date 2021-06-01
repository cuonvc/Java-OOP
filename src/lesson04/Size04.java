package lesson04;

public class Size04 {
    //VÍ DỤ 1(enum nằm trong class): vd về size quần áo
    enum Size {
        EXTRA_SMALL, SMALL, MEDIUM, LARGE, EXTRA_LARGE
    }

    public static void main(String[] args) {
//        Size mySize = Size.MEDIUM;
//        Size myBrotherSize = Size.EXTRA_LARGE;
        Size mySize = Size.MEDIUM;
        Size myBrotherSize = Size.MEDIUM;

        if (mySize == myBrotherSize) {
            System.out.println("mặc vừa của anh, thôi năm sau mua :v");
        } else {
            System.out.println("được mua bộ mới !");
        }

    }
}
