package lesson02;

public class AddressSP02_2 {
    //properties
    public String number;
    public String lane;
    public String road;
    public String neighbors;
    public String commune;
    public String district;
    public String city;





    //constructor
    public AddressSP02_2() {
        number = "";
        lane = "";
        road = "";
        neighbors = "";
        commune = "";
        district = "";
        city = "";
    }

    public AddressSP02_2(String number) {
        this.number = number;
    }

    public AddressSP02_2(String number, String lane) {
        this(number);
        this.lane = lane;
    }

    public AddressSP02_2(String number, String lane, String road) {
        this(number, lane);
        this.road = road;
    }

    public AddressSP02_2(String number, String lane, String road, String neighbors) {
        this(number, lane, road);
        this.neighbors = neighbors;
    }

    public AddressSP02_2(String number, String lane, String road, String neighbors, String commune) {
        this(number, lane, road, neighbors);
        this.commune = commune;
    }

    public AddressSP02_2(String number, String lane, String road,
                         String neighbors, String commune, String district) {
        this(number, lane, road, neighbors, commune);
        this.district = district;
    }

    public AddressSP02_2(String number, String lane, String road,
                         String neighbors, String commune, String district, String city) {
        this(number, lane, road, neighbors, commune, district);
        this.city = city;
    }



    //phương thức trả về thông tin đầy đủ của địa chỉ
    public String fullAddress() {
        String address = "";
        if (!number.isEmpty()) {
            address += "số " + number;
        }
        if (!lane.isEmpty()) {
            address += ", ngõ " + lane;
        }
        if (!road.isEmpty()) {
            address += ", đường " + road;
        }
        if (!neighbors.isEmpty()) {
            address += ", thôn  " + neighbors;
        }
        if (!commune.isEmpty()) {
            address += ", xã " + commune;
        }
        if (!district.isEmpty()) {
            address += ", huyện " + district;
        }
        if (!city.isEmpty()) {
            address += ", tỉnh " + city;
        }
        return address;
    }
}
