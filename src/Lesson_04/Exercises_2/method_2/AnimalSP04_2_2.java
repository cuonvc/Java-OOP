public enum AnimalSP04_2_2 {
    //hằng số
    the_Rat("tí"), the_buffalo("sửu"), the_tiger("dần"), the_cat("mão"),
    the_dragon("thìn"), the_snake("tỵ"), the_horse("ngọ"), the_goat("mùi"),
    the_monkey("thân"), the_chicken("dậu"), the_dog("tuất"), the_pig("hợi");

    //properties
    private String value;

    //constructor
    AnimalSP04_2_2(String name) {
        value = name;
    }

    //method(getter)
    public String getValue() {
        return value;
    }
}
