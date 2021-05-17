package lesson27.Ex4;

public class Run {
    public static void main(String[] args) {
        Throught timeKeeper = new Throught();
        timeKeeper.fingerprintScan();
        timeKeeper.faceScan();
        timeKeeper.identified();
        timeKeeper.closeTime();
        timeKeeper.openTime();
        timeKeeper.reset();
        timeKeeper.shutdown();
        timeKeeper.sleep();
        timeKeeper.notifyResult();
    }
}
