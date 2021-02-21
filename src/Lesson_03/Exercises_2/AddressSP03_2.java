public class AddressSP29_2 {
//properties (các thuộc tính)
    private String number;
    private String lane;
    private String road;
    private String neighbors;
    private String commune;
    private String district;
    private String city;




//constructor

    //default constructor
    public AddressSP29_2() {
        number = "";
        lane = "";
        road = "";
        neighbors = "";
        commune = "";
        district = "";
        city = "";
    }

    //constructor 1 tham số
    public AddressSP29_2(String number) {
        this.number = number;
    }
    //constructor 2 tham số
    public AddressSP29_2(String number, String lane) {
        this(number);
        this.lane = lane;
    }
    //constructor 3 tham số
    public AddressSP29_2(String number, String lane, String road) {
        this(number, lane);
        this.road = road;
    }
    //constructor 4 tham số
    public AddressSP29_2(String number, String lane, String road, String neighbors) {
        this(number, lane, road);
        this.neighbors = neighbors;
    }
    //constrcutor 5 tham số
    public AddressSP29_2(String number, String lane, String road, String neighbors, String commune) {
        this(number, lane, road, neighbors);
        this.commune = commune;
    }
    //constructor 6 tham số
    public AddressSP29_2(String number, String lane, String road,
                         String neighbors, String commune, String district) {
        this(number, lane, road, neighbors, commune);
        this.district = district;
    }
    //constructor 7 tham số
    public AddressSP29_2(String number, String lane, String road,
                         String neighbors, String commune, String district, String city) {
        this(number, lane, road, neighbors, commune, district);
        this.city = city;
    }




//gọi ra các setter và getter

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(String neighbors) {
        this.neighbors = neighbors;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }




//sâu chuỗi địa chỉ lại với nhau
    public String fullAddress() {
        String address = "";
        if (!number.isEmpty()) {
            address += "Số nhà " + number;
        }
        if (!lane.isEmpty()) {
            address += ", ngõ " + lane;
        }
        if (!road.isEmpty()) {
            address += ", đường " + road;
        }
        if (!neighbors.isEmpty()) {
            address += ", xóm " + neighbors;
        }
        if (!commune.isEmpty()) {
            address += ", xã " + commune;
        }
        if (!district.isEmpty()) {
            address += ", huyện " + district;
        }
        if (!city.isEmpty()) {
            address += ", tỉnh " + city + ".";
        }
        return address;
    }
}
