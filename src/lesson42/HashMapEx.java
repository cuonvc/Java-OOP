package lesson42;
/**
 * HashMap là loại ctdl lưu trữ dữ liệu kiểu cặp Key - Value
 */

import java.util.HashMap;

public class HashMapEx {
    public static void main(String[] args) {

        HashMap<String, Animal> animalHashMap = new HashMap<>();
        HashMap<Integer, String> hashMap = new HashMap<>();


//        animalHashMap.clear();  //xóa các phần tử trong danh sách
//        animalHashMap.clone(); //sao chép lại các đối tượng của hashMap
//        animalHashMap.put(key, value); //thêm mới một phần tử
//        animalHashMap.putAll(); //input được lấy từ một cái Map nào đấy
//        animalHashMap.remove(key);  //xóa phần tử theo key
//        animalHashMap.remove(key, value);  //xóa phần tử theo key và value;
//        animalHashMap.replace(key, value);  //thay thế theo key và value
//        animalHashMap.replace(key, oldValue, newValue); //thay thế Value và giữ nguyên key
//        animalHashMap.size();  //lấy ra số phần tử của map
//        animalHashMap.keySet();  //trả về một tập key đang có trong Map
//        animalHashMap.values();  //trả về một Collection danh sách những giá trị tương ứng
//        animalHashMap.containsKey(key);  //kiểm tra xem key đang kiểm tra có tồn tại trong map hay không
//        animalHashMap.containsValue(value);  //tương tự key
//        animalHashMap.getOrDefault(key cần gọi, keyDefault);  //nếu phần tử cần gọi mà ko tồn tại thì keyDefault sẽ được hiển thị ra để tránh bị null
//        //...v..v.. còn rất nhiều thứ, đọc document của từng thứ để hiểu rõ


        Animal a1 = new Animal("color1", 7);
        Animal a2 = new Animal("color2", 5.2f);
        Animal a3 = new Animal("color3", 2);
        Animal a4 = new Animal("color4", 5);
        Animal a5 = new Animal("color4", 1);
        //lưu ý: trong HashMap hay treeMap, nếu key trùng nhau thì nó chỉ tính là 1,
        // còn Value trùng nhau thì nó vẫn tính tăng lên bình thường
        //ví dụ như bên dưới khi gọi đến size của Map thì chỉ có 4 vì a4 và a5 đang trùng nhau key
        //nhưng nếu đổi lại key khác nhau và value trùng nhau thì size lại là 5
        animalHashMap.put(a1.getColor(), a1);
        animalHashMap.put(a2.getColor(), a2);
        animalHashMap.put(a3.getColor(), a3);
        animalHashMap.put(a4.getColor(), a4);
        animalHashMap.put(a5.getColor(), a5);


        System.out.println(animalHashMap.size());
    }
}
