public class AddressSP01_2 {
    //properties (các thuộc tính)
    public String apartmentNumber;
    public String neighbors;
    public String village;
    public String commune;
    public String district;
    public String province;


    //constructors (khởi tạo)
    public AddressSP01_2(String apartmentNumber, String neighbors, String village, String commune, String district,
                         String province) {
        this.apartmentNumber = apartmentNumber;
        this.neighbors = neighbors;
        this.village = village;
        this.commune = commune;
        this.district = district;
        this.province = province;
    }


    //methodS (phương thức trả về một chuỗi str địa chỉ)
    public String fullAddress() {
        String address = "";
        if (!apartmentNumber.isEmpty()) {
            address += "Số nhà " + apartmentNumber;
        }
        if (!neighbors.isEmpty()) {
            address += ", xóm " + neighbors;
        }
        if (!village.isEmpty()) {
            address += ", thôn " + village;
        }
        if (!commune.isEmpty()) {
            address += ", xã " + commune;
        }
        if (!district.isEmpty()) {
            address += ", huyện " + district;
        }
        if (!province.isEmpty()) {
            address += ", tỉnh " + province + ".";
        }
        return address;
    }

}
