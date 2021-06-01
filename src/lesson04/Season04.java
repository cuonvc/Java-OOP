package lesson04;

public class Season04 {
    //CŨNG LÀ VÍ DỤ 2(season): TẠO ENUM BÊN NGOÀI LỚP(CLASS) VÀ KẾT HỢP VỚI MỘT CLASS KHÁC ĐỂ HIỂN THỊ NỘI DUNG
    public static void main(String[] args) {
        SeasonSP04 winter = SeasonSP04.WINTER;
        SeasonSP04 summer = SeasonSP04.SUMMER;

        System.out.println(winter.getValue());  //hiển thị ra tên tiếng việt của giá trị
        System.out.println(winter);  //hiển thị ra chính giá trị đó
        System.out.println(winter == summer);  //so sánh xem giá trị của 2 thằng có bằng (trùng) nhau hay không
        System.out.println(winter == winter);
    }
}
