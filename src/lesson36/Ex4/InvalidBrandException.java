package lesson36.Ex4;

public class InvalidBrandException extends Exception {
    private String InvalidBrand;

    public InvalidBrandException(String invalidBrand) {
        InvalidBrand = invalidBrand;
    }

    public InvalidBrandException(String message, String invalidBrand) {
        super(message);
        InvalidBrand = invalidBrand;
    }

    public String getInvalidBrand() {
        return InvalidBrand;
    }

    public void setInvalidBrand(String invalidBrand) {
        InvalidBrand = invalidBrand;
    }
}
