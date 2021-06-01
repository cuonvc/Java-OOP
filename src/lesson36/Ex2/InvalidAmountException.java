package lesson36.Ex2;

public class InvalidAmountException extends Exception {
    private long amount;

    public InvalidAmountException(long amount) {
        this.amount = amount;
    }

    public InvalidAmountException(String message, long amount) {
        super(message);
        this.amount = amount;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }
}
