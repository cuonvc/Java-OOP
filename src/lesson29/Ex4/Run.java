package lesson29.Ex4;

import lesson29.Ex4.Comparator.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        ArrayList<Smartphone> smartphones = new ArrayList<>();
        do {
            System.out.println("1. Thêm mới một thiết bị vào danh sách");
            System.out.println("2. Sắp xếp danh sách theo tên hãng từ a-z");
            System.out.println("3. sắp xếp danh sách theo tên thiết bị từ a-z");
            System.out.println("4. Sắp xếp danh sách theo tên hãng từ z-a");
            System.out.println("5. Sắp xếp theo giá bán giảm dần");
            System.out.println("6. Sắp xếp theo giá bán tăng dần");
            System.out.println("7. Sắp xếp danh sách từ cũ đến mới");
            System.out.println("8. Sắp xếp danh sách từ mới đến cũ");
            System.out.println("0. Thoát chương trình");
            showNoti("Vui lòng chọn");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 0:
                    showNoti("Đã thoát chương trình");
                    break;
                case 1:
                    var newDevice = createSmartphone(input);
                    smartphones.add(newDevice);
                    showNoti("Thêm thành công một thiết bị");
                    break;
                case 2:
                    if (smartphones.size() > 0) {
                        showNoti("Danh sách thiết bị theo hãng từ a-z");
                        Collections.sort(smartphones, new SortByBrand());
                        showDevice(smartphones);
                    } else {
                        showNoti("Danh sách trống");
                    }
                    break;
                case 3:
                    if (smartphones.size() > 0) {
                        showNoti("Danh sách thiết bị theo tên từ a-z");
                        Collections.sort(smartphones, new SortByName());
                        showDevice(smartphones);
                    } else {
                        showNoti("Danh sách trống");
                    }
                    break;
                case 4:
                    if (smartphones.size() > 0) {
                        showNoti("Danh sách thiết bị theo tên hãng từ z-a");
                        Collections.sort(smartphones, new SortByBrandDown());
                        showDevice(smartphones);
                    } else {
                        showNoti("Danh sách trống");
                    }
                    break;
                case 5:
                    if (smartphones.size() > 0) {
                        showNoti("Danh sách thiết bị có giá giảm dần");
                        Collections.sort(smartphones, new SortByPriceDown());
                        showDevice(smartphones);
                    } else {
                        showNoti("Danh sách trống");
                    }
                    break;
                case 6:
                    if (smartphones.size() > 0) {
                        showNoti("Danh sách thiết bị có giá tăng dần");
                        Collections.sort(smartphones, new SortByPrice());
                        showDevice(smartphones);
                    } else {
                        showNoti("Danh sách trống");
                    }
                    break;
                case 7:
                    if (smartphones.size() > 0) {
                        showNoti("Danh sách thiết bị từ cũ đến mới");
                        Collections.sort(smartphones, new SortByYear());
                        showDevice(smartphones);
                    } else {
                        showNoti("Danh sách trống");
                    }
                    break;
                case 8:
                    if (smartphones.size() > 0) {
                        showNoti("Danh sách thiết bị từ mới đến cũ");
                        Collections.sort(smartphones, new SortByYearDown());
                        showDevice(smartphones);
                    } else {
                        showNoti("Danh sách trống");
                    }
                    break;
                default:
                    showNoti("Sai cú pháp, vui lòng nhập lại");
                    break;
            }
        }while (choice != 0);
    }

    /**
     * hiển thị danh sách các thiết bị
     * @param smartphones
     */
    private static void showDevice(ArrayList<Smartphone> smartphones) {
        System.out.printf("%-16s %-16s %-17s %-14s %-17s %-19s\n",
                "Mã thiết bị", "Thương hiệu", "Tên thiết bị", "Giá bán",
                "Năm sản xuất", "Kích thước");
        for (var smp : smartphones) {
            System.out.printf("%-16s %-16s %-17s %-14.2f %-17d %-19.1s\n",
                    smp.getId(), smp.getBrand(), smp.getDeviceName(),
                    smp.getPrice(), smp.getManufactureYear(),
                    (smp.getSize() + "inch"));
        }
    }

    /**
     * tạo mới một đối tượng smartphone
     * @param input
     * @return
     */
    private static Smartphone createSmartphone(Scanner input) {
        System.out.println("Tên hãng: ");
        var brand = input.nextLine();
        System.out.println("Tên thiết bị: ");
        var device = input.nextLine();
        System.out.println("Giá bán: ");
        var price = Float.parseFloat(input.nextLine());
        System.out.println("Năm sản xuất: ");
        var year = Integer.parseInt(input.nextLine());
        System.out.println("Kích thước màn hình: ");
        var size = Float.parseFloat(input.nextLine());

        Smartphone smartphone = new Smartphone(
                null, brand, device, price, year, size);
        return smartphone;
    }

    private static void showNoti(String str) {
        System.out.println(">>>>>>>>>> " + str + " <<<<<<<<<<");
    }
}
