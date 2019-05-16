public class Movie {
    static final int CHILDRENS = 2;
    static final int REGULAR = 0;
    static final int NEW_RELEASE = 1;

    private String title;
    private int priceCode;

    Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int code) {
        priceCode = code;
    }

    String getTitle() {
        return title;
    }

}
