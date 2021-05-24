package lesson36.Ex4;

import com.sun.jdi.ArrayReference;
import lesson36.Ex4.Comparator.SortByBrand;
import lesson36.Ex4.Comparator.SortByPrice;
import lesson36.Ex4.Comparator.SortByPriceDown;
import lesson36.Ex4.Comparator.SortByYear;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Run {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        String fileName = "SMP.txt";
        ArrayList<Smartphone> smartphones = new ArrayList<>(readFromFile(fileName));
        int choice = 0;
        do {
            System.out.println("1. Thêm một thiết bị vào danh sách");
            System.out.println("2. Sắp xếp theo tên hãng từ a-z");
            System.out.println("3. Sắp xếp theo giá giảm dần");
            System.out.println("4. Sắp xếp theo giá tăng dần");
            System.out.println("5. Sắp xếp từ cũ đến mới");
            System.out.println("6. Sắp xếp từ mới đến cũ");
            System.out.println("7. Hiển thị danh sách thành bảng, cột");
            System.out.println("8. Ghi dữ liệu vào file");
            System.out.println("0. thoát chương trình");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 0:
                    showNoti("Đã thoát chương trình");
                    break;
                case 1:
                    Smartphone newSmartPhone = null;
                    try {
                        newSmartPhone = createSmartphone(input);
                        smartphones.add(newSmartPhone);
                        showNoti("Thêm thành công một smartphone");
                    } catch (InvalidBrandException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Đã xảy ra ngoại lệ InvalidBrandException");
                    }
                    break;
                case 2:
                    if (smartphones.size() > 0) {
                        showNoti("Sắp xếp theo hãng từ a-z");
                        Collections.sort(smartphones, new SortByBrand());
                        showInfoSmartphone(smartphones);
                    } else {
                        showNoti("Danh sách trống");
                    }
                    break;
                case 3:
                    if (smartphones.size() > 0) {
                        showNoti("Sắp xếp theo giá giảm dần");
                        Collections.sort(smartphones, new SortByPriceDown());
                        showInfoSmartphone(smartphones);
                    } else {
                        showNoti("Danh sách trống");
                    }
                    break;
                case 4:
                    if (smartphones.size() > 0) {
                        showNoti("Sắp xếp theo giá tăng dần");
                        Collections.sort(smartphones, new SortByPrice());
                        showInfoSmartphone(smartphones);
                    } else {
                        showNoti("Danh sách trống");
                    }
                    break;
                case 5:
                    if (smartphones.size() > 0) {
                        showNoti("Sắp xếp từ cũ đến mới");
                        Collections.sort(smartphones, new SortByYear());
                        showInfoSmartphone(smartphones);
                    } else {
                        showNoti("Danh sách trống");
                    }
                    break;
                case 6:
                    if (smartphones.size() > 0) {
                        showNoti("Sắp xếp từ mới đến cũ");
                        Collections.sort(smartphones, new SortByPriceDown());
                        showInfoSmartphone(smartphones);
                    } else {
                        showNoti("Danh sách trống");
                    }
                    break;
                case 7:
                    if (smartphones.size() > 0) {
                        showNoti("Danh sách smartphone");
                        showInfoSmartphone(smartphones);
                    } else {
                        showNoti("Danh sách trống");
                    }
                    break;
                case 8:
                    if (smartphones.size() > 0) {
                        var isSuccess = writeToFile(smartphones, fileName);
                        if (isSuccess) {
                            showNoti("Ghi file thành công");
                        } else {
                            showNoti("Ghi file thất bại");
                        }
                    } else {
                        showNoti("Danh sách trống");
                    }
                    break;
                default:
                    showNoti("Sai cú pháp, vui lòng chọn lại");
                    break;
            }
        } while (choice != 0);
    }

    /**
     * ghi dữ liệu vào file
     * @param smartphones
     * @param fileName
     * @return
     */
    private static boolean writeToFile(ArrayList<Smartphone> smartphones, String fileName) {
        try {
            PrintWriter printWriter = new PrintWriter(fileName);
            for (var smp : smartphones) {
                printWriter.printf("%s - %s - %s - %s - %s - %s\n",
                        smp.getId(), smp.getBrand(), smp.getName(),
                        smp.getPrice(), smp.getManufactureYear(),
                        smp.getSize());
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * đọc dữ liệu từ file
     * @param fileName
     * @return
     */
    private static ArrayList<Smartphone> readFromFile(String fileName) {
        ArrayList<Smartphone> smps = new ArrayList<>();
        var file = new File(fileName);
        try {
            file.createNewFile();  //tạo file
            var input = new Scanner(file);  //đọc file
            while (input.hasNextLine()) {
                var line = input.nextLine();
                String[] data = line.split(" - ");
                Smartphone smartphone = createSMPfromData(data);
                if (smartphone != null) {
                    smps.add(smartphone);
                }
            }
            input.close();
             } catch (IOException e) {
            e.printStackTrace();
        }
        return smps;
    }

    private static Smartphone createSMPfromData(String[] data) {
        var id = data[0];
        var brand = data[1];
        var name = data[2];
        var price = Float.parseFloat(data[3]);
        var year = Integer.parseInt(data[4]);
        var size = Float.parseFloat(data[5]);
        try {
            Smartphone smartphone = new Smartphone(id, brand, name, price, year, size);
            return smartphone;
        } catch (InvalidBrandException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    /**
     * hiển thị thông tin smartphone
     * @param smartphones
     */
    private static void showInfoSmartphone(ArrayList<Smartphone> smartphones) {
        System.out.printf("%-16s %-16s %-17s %-14s %-17s %-19s\n",
                "Mã thiết bị", "Thương hiệu", "Tên máy",
                "Giá bán", "Năm sản xuất", "Kích thước màn hình");
        for (var smp : smartphones) {
            System.out.printf("%-16s %-16s %-17s %-14.1f %-17d %-19.1f\n",
                    smp.getId(), smp.getBrand(), smp.getName(),
                    smp.getPrice(), smp.getManufactureYear(),
                    smp.getSize());
        }
    }

    /**
     * tạo mới đối tượng smartphone
     * @param input
     * @return
     */
    private static Smartphone createSmartphone(Scanner input) throws InvalidBrandException {
        System.out.println("Mã thiết bị: ");
        var id = input.nextLine();
        System.out.println("Thương hiệu: ");
        var brand = input.nextLine();
        System.out.println("Tên máy: ");
        var name = input.nextLine();
        System.out.println("Giá bán: ");
        var price = Float.parseFloat(input.nextLine());
        System.out.println("Năm sản xuất: ");
        var year = Integer.parseInt(input.nextLine());
        System.out.println("Kích thước màn hình: ");
        var size = Float.parseFloat(input.nextLine());

        Smartphone smartphone = new Smartphone(id, brand, name, price, year, size);

        return smartphone;
    }


    private static void showNoti(String str) {
        System.out.println(">>>>>>>>>> " + str + " <<<<<<<<<<");
    }
}
