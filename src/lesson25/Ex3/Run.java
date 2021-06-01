package lesson25.Ex3;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Run {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Person teacher = new Teacher("01234567890123", "Trần văn A", "Hà Nội",
                dateFormat.parse("12/03/1970"), "abc@gmail.com", "0987654321",
                "HAU123", "CTDL&GT", 12000000, 3.4f);

        Person student = new Student("877324727414341", "Nguyễn Văn Cường", "Hưng Yên",
                dateFormat.parse("05/08/2002"), "cuongnvc5802@gmail.com", "0865235802",
                "2055010026", "Kien Truc Ha Noi", "20CN2", "CNTT", 3.2f);

        Person graduate = new Graduate("8593894243424", "Nguyễn Văn B", "Ha Noi",
                dateFormat.parse("23/02/1999"), "NVB@gmail.com", "0123456789",
                "2055010000", "Kien Truc Ha Noi", "18CN2", "CNTT", 3.8f,
                dateFormat.parse("12/12/1212"), 12, 5, 10000000,
                "NASA", "Team leader");




        // ...bla...bla...
    }
}
