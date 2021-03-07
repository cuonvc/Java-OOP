public enum ZodiacSP04_3_2 {
    //các hằng số
    aries("bạch dương"), taurus("kim ngưu"), gemini("song tử"), cancer("cự giải"),
    leo("sư tử"), virgo("xử nữ"), libra("thiên bình"), scorpius("bọ cạp"),
    sagittarius("nhân mã"),capricorn("ma kết"), aquarius("bảo bình"), pisces("song ngư");

    //properties
    private String value;

    //constructor
    ZodiacSP04_3_2(String name) {
        value = name;
    }

    //method(getter)
    public String getValue() {
        return value;
    }
}
