package lesson09;

import java.util.Scanner;

import static java.lang.System.*;  //loại bỏ System ở những chỗ có System ( bao gồm cả system.in và system.out bên dưới)
//hoặc
import static java.lang.System.in;  //loại bỏ System ở những chỗ có System.in
import static java.lang.System.out;  //loại bỏ System ở những chỗ có System.out

public class Compact {
    public static void main(String[] args) {
        var input = new Scanner(in);  //đã loại bỏ System
        out.println("Rút gọn System");  //đã loại bỏ System
    }
}
