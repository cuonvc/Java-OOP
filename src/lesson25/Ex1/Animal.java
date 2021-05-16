package lesson25.Ex1;

public abstract class Animal {
    private String name;  //tên
    private String species;  //loài động vật
    private float height;  //chiều cao
    private float weight;  //cân nặng
    private String habitat;  //môi trường sống
    private String reproduction;  //hình thức sinh sản


//các hành động
    protected abstract void sleep();

    protected abstract void relax();

    protected abstract void move();





    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final String getSpecies() {
        return species;
    }

    public final void setSpecies(String species) {
        this.species = species;
    }

    public final float getHeight() {
        return height;
    }

    public final void setHeight(float height) {
        this.height = height;
    }

    public final float getWeight() {
        return weight;
    }

    public final void setWeight(float weight) {
        this.weight = weight;
    }

    public final String getHabitat() {
        return habitat;
    }

    public final void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public final String getReproduction() {
        return reproduction;
    }

    public final void setReproduction(String reproduction) {
        this.reproduction = reproduction;
    }
}
