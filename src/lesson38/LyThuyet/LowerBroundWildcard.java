package lesson38.LyThuyet;

import java.util.ArrayList;

/**
 * Ví dụ về giới hạn dưới
 */
public class LowerBroundWildcard {
    public static void addNewObject(ArrayList<? super Children> list) {  //vi dụ về giới hạn dưới
        //khi ta đặt Children là giới hạn dưới tức là
        // theo như tính kế thừa thì chỉ có 2 thằng lớn hơn đó
        // là Grandfather và Father là được truyền vào cái list còn thằng
        // Grandchildren sẽ ko được quyền sử dụng vì nó hẹp hơn thằng bị chặn là Children
        list.add(new Children("Cường"));
        list.add(new Children("Hoàng"));
        list.add(new Children("Huy"));
        list.add(new Children("Đức"));
        //...

    }


    public static void main(String[] args) {
        ArrayList<Grandfather> grandfathers = new ArrayList<>();
        ArrayList<Father> fathers = new ArrayList<>();
        ArrayList<Children> childrens = new ArrayList<>();
        ArrayList<Grandchildren> grandchildrens = new ArrayList<>();


        addNewObject(grandfathers);
        addNewObject(fathers);
        addNewObject(childrens);
//        addNewObject(grandchildrens);  //đến cái này thì bị lỗi

    }
}


class Grandfather {

}

class Father extends Grandfather {

}

class Children extends Father {
    private String fullName;

    public Children(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}

class Grandchildren extends Children {

    //mấy cái phía dưới này ko cần để ý
    //chỉ cần để ý cái liên kết extends thôi
    public Grandchildren(String fullName) {
        super(fullName);
    }
}