package lesson43.Ex3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lecturer {
    private String id;
    private String fullName;
    private String specialize;
    private float wages;
    private float experience;

    public Lecturer() {
    }

    public Lecturer(String id, String fullName, String
            specialize, float wages, float experience) {
        this.id = id;
        this.fullName = fullName;
        this.specialize = specialize;
        this.wages = wages;
        this.experience = experience;
    }

    public final String getId() {
        return id;
    }

    public final void setId(String id) {
        this.id = id;
    }

    public final String getFullName() {
        return fullName;
    }

    public final void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public final String getSpecialize() {
        return specialize;
    }

    public final void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    public final float getWages() {
        return wages;
    }

    public void setWages(float wages) throws InvalidStringWagesException {
        if (wages >= 0.00f && wages <= 80.00f) {
            this.wages = wages;
        } else {
            this.wages = 0.0f;
            String msg = "Lỗi cú pháp";
            throw new InvalidStringWagesException(msg, wages);
        }
    }

    public final float getExperience() {
        return experience;
    }

    public final void setExperience(float experience) {
        this.experience = experience;
    }


}
