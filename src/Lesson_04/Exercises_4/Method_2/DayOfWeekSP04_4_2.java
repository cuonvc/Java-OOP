public enum DayOfWeekSP04_4_2 {

    //các hằng số
    monday("Monday"), tuesday("Tuesday"), wednesday("Wednesday"),
    thursday("Thursday"), friday("Friday"), saturday("Saturday"), sunday("SunDay");

    //properties
    private String value;

    //constructor
    DayOfWeekSP04_4_2 (String name) {
        value = name;
    }

    //method (getter)
    public String getValue () {
        return value;
    }
}
