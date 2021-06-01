package lesson42;

import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {

        TreeMap<String, Animal> animalTreeMap = new TreeMap<>();

        Animal a1 = new Animal("color1", 7);
        Animal a2 = new Animal("color2", 5.2f);
        Animal a3 = new Animal("color3", 2);
        Animal a4 = new Animal("color4", 5);
        Animal a5 = new Animal("color5", 1);



        //đối với hashMap thì các phần tử truyền vào theo thứ tự như nào thì mặc định key hiển thị như thế
        //nhưng đối với treeMap thì truyền vào kiểu gì thì key in ra vẫn theo thứ tự 12345...
        animalTreeMap.put(a1.getColor(), a1);
        animalTreeMap.put(a3.getColor(), a3);
        animalTreeMap.put(a2.getColor(), a2);
        animalTreeMap.put(a5.getColor(), a5);
        animalTreeMap.put(a4.getColor(), a4);

        System.out.println("" + animalTreeMap.keySet());
        System.out.println("" + animalTreeMap.values());
    }
}
