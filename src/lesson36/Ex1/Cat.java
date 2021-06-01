package lesson36.Ex1;

public class Cat {
    private String color;
    private float age;
    private String bestFood;
    private String eyeColor;
    private String petName;

    public Cat() {
    }

    public Cat(String color, float age, String bestFood,
               String eyeColor, String petName) throws InvalidAgeException {
        this.color = color;
        setAge(age);
        this.bestFood = bestFood;
        this.eyeColor = eyeColor;
        this.petName = petName;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) throws InvalidAgeException {
        if (age >= 0 && age <= 50) {
            this.age = age;
        } else {
            this.age = 0.0f;
            String msg = "Tuổi không hợp lệ";
            throw new InvalidAgeException(msg, age);
        }
    }

    public String getBestFood() {
        return bestFood;
    }

    public void setBestFood(String bestFood) {
        this.bestFood = bestFood;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }
}
