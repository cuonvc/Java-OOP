package lesson29.Ex2;

import lesson29.Ex2.Comparator.SortByPrice;
import lesson29.Ex2.Comparator.SortByPriceDown;
import lesson29.Ex2.Comparator.SortByWeight;
import lesson29.Ex2.Comparator.SortByYearDown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        ArrayList<Transport> transports = new ArrayList<>();
        do {
            System.out.println("1. Thêm mới một phương tiện");
            System.out.println("2. Hiển thị danh sách các phương tiện");
            System.out.println("3. Sắp xếp theo năm sản xuất từ mới đến cũ");
            System.out.println("4. Sắp xếp theo giá thành từ thấp đến cao");
            System.out.println("5. Sắp xếp theo giá thành từ cao đến thấp");
            System.out.println("6. Sắp xếp theo trọng lượng tăng dần");
            System.out.println("0. Thoát chương trình");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 0:
                    showNoti("Đã thoát chương trình");
                    break;
                case 1:
                    var newTransport = createTransport(input);
                    transports.add(newTransport);
                    showNoti("Thêm thành công một phương tiện");
                    break;
                case 2:
                    if (transports.size() > 0) {
                        showNoti("Danh sách các phương tiện");
                        showTransport(transports);
                    } else {
                        showNoti("Danh sách trống");
                    }
                    break;
                case 3:
                    if (transports.size() > 0) {
                        showNoti("Danh sách các phương tiện từ mới đến cũ");
                        Collections.sort(transports, new SortByYearDown());
                        showTransport(transports);
                    } else {
                        showNoti("Danh sách trống");
                    }
                    break;
                case 4:
                    if (transports.size() > 0) {
                        showNoti("Danh sách phương tiện có giá từ thấp đến cao");
                        Collections.sort(transports, new SortByPrice());
                        showTransport(transports);
                    } else {
                        showNoti("Danh sách trống");
                    }
                    break;
                case 5:
                    if (transports.size() > 0) {
                        showNoti("Danh sách phương tiện có giá từ cao đến thấp");
                        Collections.sort(transports, new SortByPriceDown());
                        showTransport(transports);
                    } else {
                        showNoti("Danh sách trống");
                    }
                    break;
                case 6:
                    if (transports.size() > 0) {
                        showNoti("Danh sách phương tiện có trọng lượng tăng dần");
                        Collections.sort(transports, new SortByWeight());
                        showTransport(transports);
                    } else {
                        showNoti("Danh sách trống");
                    }
                    break;
                default:
                    showNoti("Sai cú pháp, vui lòng nhập lại");
                    break;
            }
        } while (choice != 0);
    }

    /**
     * Hienr thị danh sách phương tiện thành hàng và  cột
     * @param transports
     */
    private static void showTransport(ArrayList<Transport> transports) {
        System.out.printf("%-16s %-17s %-16s %-17s %-11s\n", "Thương hiệu",
                "Năm sản xuất", "Sản xuất tại", "Giá thành", "Trọng lượng");
        for (var trs : transports) {
            System.out.printf("%-16s %-17d %-16s %-17.2f %-11.2f\n",
                    trs.getBrand(), trs.getManufactureYear(),
                    trs.getMadeIn(), trs.getPrice(), trs.getWeight());
        }
    }

    /**
     * thêm mới một phương tiện
     * @param input
     * @return
     */
    private static Transport createTransport(Scanner input) {
        System.out.println("Nhập loại phương tiện: \n1. Ô tô\n2. Xe máy\n3. Xe đạp điện\n");
        var option = Integer.parseInt(input.nextLine());
        System.out.println("Thương hiệu: ");
        var brand = input.nextLine();
        System.out.println("Năm sản xuất: ");
        var year = Integer.parseInt(input.nextLine());
        System.out.println("Sản xuất tại: ");
        var madeIn = input.nextLine();
        System.out.println("Giá thành: ");
        var price = Double.parseDouble(input.nextLine());
        System.out.println("Trọng lượng: ");
        var weight = Float.parseFloat(input.nextLine());
        switch (option) {
            case 1:
                return new Automobile(brand,year,madeIn,price, weight);
            case 2:
                return new Motobike(brand, year,madeIn, price,weight);
            case 3:
                return new Electronicbike(brand, year, madeIn, price, weight);
            default:
                showNoti("Sai cú pháp, vui lòng nhập lại");
                break;
        }
        return null;
    }

    /**
     * hiển thị thông báo sau mỗi hành động
     * @param s nội dung thông báo
     */
    private static void showNoti(String s) {
        System.out.println(">>>>>>>>>> " + s + " <<<<<<<<<<");
    }
}
