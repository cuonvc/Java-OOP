package lesson27.Ex3;

public interface ElectronicDeviceAction {
    void reset();  //khởi động lại

    void turnOn();  //mở máy

    void turnOff();  //tắt máy

    void turnOffScreen();   //tắt màn hình

    void volumUp();   //tăng âm lượng

    void volumDown();  //giảm âm lượng

    void lightUp();  //tăng độ sáng

    void lightDown();  //giảm độ sáng

    void connect(String something);  //kết nối

}
