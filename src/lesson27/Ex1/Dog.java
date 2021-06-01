package lesson27.Ex1;

public class Dog extends Animal {
    private String petName;  //tên thường gọi
    private String color;  //màu lông
    private String species;  //giống loài


    public Dog(String petName) {
        this.petName = petName;
    }

    public Dog(String petName, String color, String species) {
        this.petName = petName;
        this.color = color;
        this.species = species;
    }

    public Dog(String name, int age, String bestFood, float weight, String petName, String color, String species) {
        super(name, age, bestFood, weight);
        this.petName = petName;
        this.color = color;
        this.species = species;
    }



    public final String getPetName() {
        return petName;
    }

    public final void setPetName(String petName) {
        this.petName = petName;
    }

    public final String getColor() {
        return color;
    }

    public final void setColor(String color) {
        this.color = color;
    }

    public final String getSpecies() {
        return species;
    }

    public final void setSpecies(String species) {
        this.species = species;
    }


    public void happy() {   //hành động vẫy đuôi
        System.out.println(petName +  " đang vẫy đuôi mừng");
    }

    public void bark() {   //hành động sủa
        System.out.println(petName + " đang sủa");
    }


    @Override
    public void eat(String food) {
        System.out.println(petName + " đang ăn " + food);
    }

    @Override
    public void sleep() {
        System.out.println(petName + " đang ngủ");
    }

    //...
}
