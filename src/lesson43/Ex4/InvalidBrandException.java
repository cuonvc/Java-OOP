package lesson43.Ex4;

public class InvalidBrandException extends Exception{
    private String invalidBrand;

    public InvalidBrandException(String invalidBrand) {
        this.invalidBrand = invalidBrand;
    }

    public InvalidBrandException(String message, String invalidBrand) {
        super(message);
        this.invalidBrand = invalidBrand;
    }

    public String getInvalidBrand() {
        return invalidBrand;
    }

    public void setInvalidBrand(String invalidBrand) {
        this.invalidBrand = invalidBrand;
    }
}
