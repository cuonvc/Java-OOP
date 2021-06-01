package lesson36.Ex3;

public class Instructor {
    private String id;
    private String fullName;
    private String specialize;
    private long wages;
    private float experience;


    public Instructor() {
    }

    public Instructor(String id, String fullName, String specialize,
                      long wages, float experience) throws InvalidWagesException {
        this.id = id;
        this.fullName = fullName;
        this.specialize = specialize;
        setWages(wages);
        this.experience = experience;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    public long getWages() {
        return wages;
    }

    public void setWages(long wages) throws InvalidWagesException {
        if (wages >= 0 && wages <= 50000000) {
            this.wages = wages;
        } else {
            this.wages = 0;
            String msg = "Giá trị không hợp lệ";
            throw new InvalidWagesException(msg, wages);
        }
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }


}
