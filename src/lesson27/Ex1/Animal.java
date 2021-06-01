package lesson27.Ex1;

public abstract class Animal implements AnimalAction {
    private String name;  //tên
    private int age;   //tuổi
    private String bestFood;  //thức ăn yêu thích
    private float weight;  //trọng lượng


    public Animal () {
    }


    public Animal(String name, int age, String bestFood, float weight) {
        this.name = name;
        this.age = age;
        this.bestFood = bestFood;
        this.weight = weight;
    }


    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final int getAge() {
        return age;
    }

    public final void setAge(int age) {
        this.age = age;
    }

    public final String getBestFood() {
        return bestFood;
    }

    public final void setBestFood(String bestFood) {
        this.bestFood = bestFood;
    }

    public final float getWeight() {
        return weight;
    }

    public final void setWeight(float weight) {
        this.weight = weight;
    }


    @Override
    public void eat(String food) {
        System.out.println("Độnh vật đang ăn " + food);
    }

    @Override
    public void sleep() {
        System.out.println("Bọn chúng đang ngủ");
    }

    @Override
    public void move() {
        System.out.println("Bọn chúng đang di chuyển theo bầy đàn");
    }

    @Override
    public void reproduction() {
        System.out.println("Chúng sinh sản bằng hình thức đẻ trứng");
    }
}
