package lesson28;
//tạo lớp vô danh từ một abstract class
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    protected abstract void move();

    protected abstract void eat();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}


class AnimalExample {
    public static void main(String[] args) {
        Animal cat = new Animal("Tom") {
            @Override
            protected void move() {
                System.out.println("Con mèo " + getName()
                        + " đang chạy ngoài sân");
            }

            @Override
            protected void eat() {
                System.out.println("Con mèo "
                        + getName() + " đang ăn vụng");
            }
        };

        System.out.println("Tên con mèo: " + cat.getName());
        cat.eat();
        cat.move();
    }
}