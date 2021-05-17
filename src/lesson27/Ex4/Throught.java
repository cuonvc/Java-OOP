package lesson27.Ex4;

public class Throught implements TimeKeeper {
    @Override
    public void fingerprintScan() {
        System.out.println("quét vân tay");
    }

    @Override
    public void faceScan() {
        System.out.println("Quét khuôn mặt");
    }

    @Override
    public void identified() {
        System.out.println("Đã nhận diện");
    }

    @Override
    public void closeTime() {
        System.out.println("Chốt giờ vào");
    }

    @Override
    public void openTime() {
        System.out.println("Chốt giờ ra");
    }

    @Override
    public void reset() {
        System.out.println("KHởi động lại thiết bị");
    }

    @Override
    public void shutdown() {
        System.out.println("Tắt thiết bị");
    }

    @Override
    public void sleep() {
        System.out.println("Đưa về chế độ ngủ");
    }

    @Override
    public void notifyResult() {
        System.out.println("Hiển thị kết quả");
    }
}
