package lesson27.LyThuyet;

public interface Splittable {
    //phương thức private static
    //private static chỉ sử dụng trong nội bộ trong interface
    //mục đích của thằng static là làm cho phương thức được cố định, không cho override
    private static String[] splitByWhitespace(String src) {
        if (src == null) {
            return null;
        }
        return src.split("\\s+");
    }

    //phương thức tách lấy tên của một người
    //ta có thể bỏ keyword public đi vì mặc định phương thức static luôn là public
    public static String getFirstName(String fullName) {
        if (fullName == null) {
            return null;
        }
        String[] words = splitByWhitespace(fullName);  //chỉ static mới gọi đến được static thôi
        return words[words.length];
    }
    //một phương thức abstract
    String[] split(String src, String regex);
}



class Example2 implements Splittable {
    @Override
    public String[] split(String src, String regex) {
        if (src == null) {
            return null;
        }
        return src.split(regex);
    }

}