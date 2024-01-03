public class Skyscraper8 {
    private final int floorsCount;
    private final String developer;

    public Skyscraper8() {
        this.floorsCount = 5;
        this.developer = "JavaRushDevelopment";
    }

    public Skyscraper8(int floorsCount, String developer) {
        this.floorsCount = floorsCount;
        this.developer = developer;
    }

    public static void main(String[] args) {
        Skyscraper8 skyscraper = new Skyscraper8();
        Skyscraper8 skyscraperUnknown = new Skyscraper8(50, "Unknown");
    }
}
