package lesson43.Ex5;

import lesson43.Ex5.Exception.InvalidEmailException;
import lesson43.Ex5.Exception.InvalidFullNameException;
import lesson43.Ex5.Exception.InvalidPhoneNumberException;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Person implements Comparable<Person>{
    private String idCard;
    private FullName fullname;
    private String address;
    private Date dayOfBirth;
    private String email;
    private String phoneNumber;

    public Person() {
    }

    public Person(String idCard, String fullname, String address,
                  Date dayOfBirth, String email, String phoneNumber) throws
            InvalidFullNameException, InvalidPhoneNumberException, InvalidEmailException {
        this.idCard = idCard;
        this.setFullname(fullname);
        this.address = address;
        this.dayOfBirth = dayOfBirth;
        this.setEmail(email);
        this.setPhoneNumber(phoneNumber);
    }


    public final String getIdCard() {
        return idCard;
    }

    public final void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public FullName getFullname() {
        return fullname;
    }

    public String getFirstName() {
        return fullname.firstName; // phương thức này để lấy getFirstName cho
        // SortByName vì khác gói ko thể gọi qua getter
        // inner class chỉ visible với các lớp cùng gói và các phương thức trong cùng lớp chưa inner class
        //giờ tách lớp FullName đó ra làm 1 lớp độc lập bên ngoài hoặc là tạo phương
        // thức get/set first/last/mid name ở lớp Person thay vì Fullname
    }

    public final String getFullNameStr() {
            return fullname.lastName + " " + fullname.midName + fullname.firstName;
    }

    public final void setFullname(String fullname) throws InvalidFullNameException {
        if (fullNameIsOk(fullname)) {
            this.fullname = new FullName();
            if (fullname != null && fullname.length() > 0) {
                var words = fullname.split("\\s+");
                this.fullname.firstName = words[words.length - 1];
                this.fullname.lastName = words[0];
                this.fullname.midName = "";
                for (int i = 1; i < words.length - 1; i++) {
                    this.fullname.midName += words[i] + " ";
                }
            }
        } else {
            String msg = "Tên bị lỗi cú pháp";
            throw new InvalidFullNameException(msg, fullname);
        }
    }

    /**
     * kiểm tra xem fullName có thỏa mãn không
     * @param fullname
     * @return
     */
    private boolean fullNameIsOk(String fullname) {
        Pattern pattern = Pattern.compile("^[a-zA-Z- ]{1,40}$");
        Matcher matcher = pattern.matcher(fullname);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }


    public final String getAddress() {
        return address;
    }

    public final void setAddress(String address) {
        this.address = address;
    }

    public final Date getDayOfBirth() {
        return dayOfBirth;
    }

    public final void setDayOfBirth(Date dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public final String getEmail() {
        return email;
    }

    public final void setEmail(String email) throws InvalidEmailException {
        if (emailIsOk(email)) {
            this.email = email;
        } else {
            String msg = "Email không hợp lệ";
            throw new InvalidEmailException(msg, email);
        }
    }

    private boolean emailIsOk(String email) {
        Pattern pattern = Pattern.compile("^[a-zA-Z](\\w+([._])*)(@gmail.com)");
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }

    public final String getPhoneNumber() {
        return phoneNumber;
    }

    public final void setPhoneNumber(String phoneNumber) throws InvalidPhoneNumberException {
        if (phoneNumberIsOk(phoneNumber)) {
            this.phoneNumber = phoneNumber;
        } else {
            String msg = "Số điện thoại không hợp lệ";
            throw new InvalidPhoneNumberException(msg, phoneNumber);
        }
    }

    private boolean phoneNumberIsOk(String phoneNumber) {
        //9 số đầu 08,09 hoặc 10 số đầu 03,04,07
        Pattern pattern = Pattern.compile("((08)|(09))\\d{7}|((03)|(04)|(07))\\d{8}");
        Matcher matcher = pattern.matcher(phoneNumber);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }

    class FullName {
        private String firstName;
        private String midName;
        private String lastName;

        public FullName() {
        }

        public FullName(String firstName, String midName, String lastName) {
            this.firstName = firstName;
            this.midName = midName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getMidName() {
            return midName;
        }

        public void setMidName(String midName) {
            this.midName = midName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    }

    public void eat(String food) {
        System.out.println(fullname + " đang ăn " + food);
    }

    public void sleep() {
        System.out.println(fullname + " đang ngủ");
    }

    protected abstract void work(String job);

    public void talk() {
        System.out.println(fullname + " đang nói chuyện");
    }

    public void relax() {
        System.out.println(fullname + " đang chơi game");
    }

    @Override
    public int compareTo(Person o) {
        return this.getIdCard().compareTo(o.getIdCard());
    }
}
