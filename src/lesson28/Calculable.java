package lesson28;
//tạo một lớp vô danh từ một interface
public interface Calculable {
    int add(int a, int b);

    int sub(int a, int b);

    default float div(int a, int b) {
        return 0;
    }

    default int mul(int a, int b) {
        return 0;
    }
}

class Example {
    public static void main(String[] args) {
        //tạo đối tượng từ lớp vô danh, nó implement từ interface
        Calculable myCalculator = new Calculable() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }

            @Override
            public int sub(int a, int b) {
                return a - b;
            }


            //có thể override thêm các default method hoặc ko

            @Override
            public float div(int a, int b) {
                return a * b;
            }
        };


        //sử dụng các phương thức đã được lớp vô danh implement từ lớp cha
        System.out.println(myCalculator.add(10, 5));
        System.out.println(myCalculator.sub(12, 7));
        System.out.println(myCalculator.div(20, 10));
        System.out.println(myCalculator.mul(12,3));



    }
}
