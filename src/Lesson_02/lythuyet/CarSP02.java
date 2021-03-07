public class CarSP02 {
    public String name;
    public float weight;
    public long year;
    public String type;


    //để tạo constructor: nhấn tổ hợp ALT + INS -> constructor
    //hoặc chuột phải vào một vị trí trống TRONG LỚP  chọn generate -> constructor
    //nếu tạo default constructor thì chọn select none, còn tạo constructor có tham số thì chọn các tham số thích hợp

    //default constructor
    public CarSP02() {
        super();
    }

    //constructor có 1 tham số
    public CarSP02(String name) {
        this.name = name;
        CarShow02.showInfo(this); //giữ nguyên cái show name ở carShow28 và chuyển dòng này qua từng
        //constructor để hiểu cách hoạt động (đương nhiên là phải đọc lại commment ở cuối class trước khi run)
    }

    //constructor có 2 tham số
    public CarSP02(String name, float weight) {
        this.name = name;
        this.weight = weight;
    }

    //constructor có 3 tham số
    public CarSP02(String name, float weight, long year) {
        this.name = name;
        this.weight = weight;
        this.year = year;
    }

    //constructor có 4 tham số
    public CarSP02(String name, float weight, long year, String type) {
        this(name, weight, year); //cái này có thể viết như này thay vì viết mỗi tham số 1 dòng như ở trên
        this.type = type;
        //nhưng để chương trình chạy đúng thì tất cả các constructor phải viết các tham số theo cùng một kiểu
        //như constructor thứ 5 hoặc cùng 1 kiểu như constructor thứ 4,3,2. vì đây là bài lý thuyết viết để hiểu
        //nên mới viết lẫn cả 2 kiểu như này (đương nhiên là chương trình chạy sẽ không được chuẩn).
    }
}
