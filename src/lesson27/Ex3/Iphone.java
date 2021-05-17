package lesson27.Ex3;

public class Iphone extends Smartphone {
    private String operatingSystem;  //hệ điều hành
    private String manufactureAddress;  //nơi sản xuất
    private int timeWarranty;  //thời gian bảo hành (năm)
    private String imei;  //mã imei
    private String regionCode;  //ví dụ J/A, VN/A, LL/A, ...

    public Iphone() {
    }

    public Iphone(String operatingSystem, String manufactureAddress, int timeWarranty, String imei, String regionCode) {
        this.operatingSystem = operatingSystem;
        this.manufactureAddress = manufactureAddress;
        this.timeWarranty = timeWarranty;
        this.imei = imei;
        this.regionCode = regionCode;
    }

    public Iphone(String seri, String brand, String name, float weight, float batteryCapacity, float inch,
                  String operatingSystem, String manufactureAddress, int timeWarranty, String imei, String regionCode) {
        super(seri, brand, name, weight, batteryCapacity, inch);
        this.operatingSystem = operatingSystem;
        this.manufactureAddress = manufactureAddress;
        this.timeWarranty = timeWarranty;
        this.imei = imei;
        this.regionCode = regionCode;
    }


    public final String getOperatingSystem() {
        return operatingSystem;
    }

    public final void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public final String getManufactureAddress() {
        return manufactureAddress;
    }

    public final void setManufactureAddress(String manufactureAddress) {
        this.manufactureAddress = manufactureAddress;
    }

    public final int getTimeWarranty() {
        return timeWarranty;
    }

    public final void setTimeWarranty(int timeWarranty) {
        this.timeWarranty = timeWarranty;
    }

    public final String getImei() {
        return imei;
    }

    public final void setImei(String imei) {
        this.imei = imei;
    }

    public final String getRegionCode() {
        return regionCode;
    }

    public final void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }



    @Override
    public void reset() {
        System.out.println("Khởi động lại Iphone");
    }

    @Override
    public void turnOn() {
        System.out.println("Mở iphone lên");
    }

    @Override
    public void turnOff() {
        System.out.println("Tắt iphone đi");
    }

    @Override
    public void turnOffScreen() {
        System.out.println("Tắt màn hình iphone");
    }

    @Override
    public void volumUp() {
        System.out.println("Tăng âm lượng lên");
    }

    @Override
    public void volumDown() {
        System.out.println("Giảm âm lượng xuống");
    }

    @Override
    public void lightUp() {
        System.out.println("Tăng độ sáng màn hình lên");
    }

    @Override
    public void lightDown() {
        System.out.println("Giảm độ sáng màn hình");
    }

    @Override
    public void connect(String something) {
        System.out.println("Kêt nối iphone với " + something);
    }

    @Override
    public void unlockWithPassword(String password) {
        System.out.println("Nhập " + password + " để mở khóa iphone");
    }
}
