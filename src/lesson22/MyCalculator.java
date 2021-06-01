package lesson22;
//ví dụ về các phương thức overload
//ví vụ về tính đa hình
public class MyCalculator {
    /**
     * phương thức Overload với tham số kiểu int
     */
    public static int sum(int a, int b) {
        return a + b;
    }

    /**
     * phương thức Overload với tham số kiểu long
     */
    public static long sum(long a, long b) {
        return a + b;
    }

    /**
     * phương thức Overload với tham số kiểu float
     */
    public static float sum(float a, float b) {
        return a + b;
    }

    /**
     * phương thức Overload với tham số kiểu double
     */
    public static double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        int sumInt = sum(1, 1);
        long sumLong = sum(1000000L, 22222222L);
        float sumFloat = sum(1.2f, 2.3f);
        double sumDouble = sum(2.20303, 1.32442);

    }
}
