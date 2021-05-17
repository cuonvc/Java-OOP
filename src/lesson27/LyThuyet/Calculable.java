package lesson27.LyThuyet;

public interface Calculable {
    int add(int a, int b);   //cộng 2 số

    int sub(int a, int b);   //trừ 2 số



//default method thì có thể sử dụng thoải mái ở các lớp khác mà không cần implement
    //  (ỨNg dụng để áp dụng cho các trường hợp muốn update một tính năng nào đó mà không muốn làm ảnh hưởng đến code cũ)
    default float div(int a, int b) {   //chia 2 số
        if (b == 0) {
            System.out.println("Mẫu số phải khác 0");
            return Float.NaN;
        }
        return (a * 1.0f) / b;
    }

    default int mul(int a, int b) {   //nhân 2 số
        return a * b;
    }
}



class Calculator implements Calculable {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }
    //có thể implement nốt hai cái phương thức div và mul kia nhưng sẽ làm xáo trộn đến nhiều thứ khác

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        Calculable calculable = new Calculator();

        System.out.println(a + " + " + b + " = " + calculable.add(a, b));
        System.out.println(a + " - " + b + " = " + calculable.sub(a, b));
        //thay vì phải implement như add và sub thì div và mul chỉ cần gọi ra từ default method ở lớp trên là xong
        System.out.println(a + " * " + b + " = " + calculable.mul(a, b));
        System.out.println(a + " / " + b + " = " + calculable.div(a, b));
    }
}
