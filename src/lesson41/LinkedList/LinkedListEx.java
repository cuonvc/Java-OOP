package lesson41.LinkedList;
/**
 * List nói chung lưu trữ phần tử theo thứ tự được thêm vào
 */

import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        Student s1 = new Student("s1", "Cường");
        Student s2 = new Student("s2", "Huy");
        Student s3 = new Student("s3", "An");
        Student s4 = new Student("s4", "Anh");



        LinkedList<Student> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(s1);
        studentLinkedList.add(s1);
        studentLinkedList.addLast(s2);
        studentLinkedList.add(2, s3);  //vị trí thêm phải đảm bảo nhỏ hơn hoặc bằng size
        studentLinkedList.addFirst(s4);
        //...


        studentLinkedList.remove(); //xóa phần tử đầu tiên
        studentLinkedList.remove(s1);  //xóa phần tử chỉ định
        studentLinkedList.remove(4);  //xóa phần tử tại vị trí chỉ định
        studentLinkedList.removeFirstOccurrence(s1); //nếu có nhiều phần tử giống nhau, nó sẽ xóa cái đầu tiên

        for (var e : studentLinkedList) {
            System.out.println(e);
        }

        System.out.println("Người đầu: " + studentLinkedList.getFirst());
        System.out.println("Người cuối: " + studentLinkedList.getLast());
        System.out.println("Người ở vị trí bất kì: " + studentLinkedList.get(3));



//sử dụng Iterator
        //iterator chỉ áp dụng cho duyệt từ đầu đến cuối
        //muốn duyệt kiểu khác thì áp dụng với listIterator
            var iter = studentLinkedList.iterator();
        //các phương thức của iterator
//            inter.hasNext();
//            inter.remove();
//            inter.next();
            while (iter.hasNext()) {
                System.out.println(iter.next());
            }

//sử dụng listIterator để duyệt theo ý mình
        //ở đây ví dụ duyệt từ cuối lên đầu
        var listIter = studentLinkedList.listIterator(studentLinkedList.size());
        //các phương thức của listIterator
//            listIter.hasPrevious();
//            listIter.add(s1);
//            listIter.remove();
//            listIter.hasNext();
//            listIter.next();
//            listIter.previousIndex();
         while (listIter.hasPrevious()) {
                System.out.println(listIter.hasPrevious());
            }

    }
}
