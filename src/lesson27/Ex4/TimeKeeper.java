package lesson27.Ex4;

public interface TimeKeeper {
    void fingerprintScan();  //quét vân tay

    void faceScan();   //quét khuôn mặt

    void identified();   //nhận diện

    void closeTime();   //chốt giờ vào

    void openTime();   //chốt giờ ra

    void reset();  //khởi động lại

    void shutdown();   //tắt nguồn

    void sleep();   //về chế độ ngủ

    void notifyResult();   //thông báo kết quả



}
