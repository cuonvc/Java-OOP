package lesson38.Ex4;

public class Driver {
    private String personId;
    private String fullName;
    private float experience;
    private int station;

    public Driver() {
    }

    public Driver(String personId, String fullName) {
        this.personId = personId;
        this.fullName = fullName;
    }

    public Driver(String personId, String fullName, float experience, int station) {
        this.personId = personId;
        this.fullName = fullName;
        this.experience = experience;
        this.station = station;
    }

    public final String getPersonId() {
        return personId;
    }

    public final void setPersonId(String personId) {
        this.personId = personId;
    }

    public final String getFullName() {
        return fullName;
    }

    public final void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public final float getExperience() {
        return experience;
    }

    public final void setExperience(float experience) {
        this.experience = experience;
    }

    public final int getStation() {
        return station;
    }

    public final  void setStation(int station) {
        this.station = station;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "personId='" + personId + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
