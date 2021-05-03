package lesson18.Ex1;

public class Ex1_Animal {
    //properties
    private String name;
    private String species;
    private float hight;
    private float weight;
    private String habitat;
    private String reproduction;

    //method
    public void eat() {
        System.out.println(name + " đang ăn.");
    }
    public void relax() {
        System.out.println(name + " đang chơi đùa.");
    }


//constructors
    public Ex1_Animal(String name, String species, float hight, float weight, String habitat, String reproduction) {
        this.name = name;
        this.species = species;
        this.hight = hight;
        this.weight = weight;
        this.habitat = habitat;
        this.reproduction = reproduction;
    }

    //getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public float getHight() {
        return hight;
    }

    public void setHight(float hight) {
        this.hight = hight;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getReproduction() {
        return reproduction;
    }

    public void setReproduction(String reproduction) {
        this.reproduction = reproduction;
    }
}

