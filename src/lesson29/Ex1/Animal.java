package lesson29.Ex1;

public abstract class Animal {
    private String name;
    private String species;
    private float height;
    private float weight;
    private String habitat;
    private String reproduction;

    public Animal() {
    }

    public Animal(String name, String species, float height, float weight) {
        this.name = name;
        this.species = species;
        this.height = height;
        this.weight = weight;
    }

    public Animal(String name, String species, float height, float weight,
                  String habitat, String reproduction) {
        this.name = name;
        this.species = species;
        this.height = height;
        this.weight = weight;
        this.habitat = habitat;
        this.reproduction = reproduction;
    }


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


    protected abstract void eat(String food);

    protected abstract void sleep();

    protected abstract void move();

    protected abstract void relax();

}
