public class Skyscraper7 {
    public static final String SKYSCRAPER_WAS_BUILD = " The skyscraper has been built.";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = " The skyscraper has been built. Number of floors -";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = " The skyscraper has been built. Developer -";

    public Skyscraper7() {
        System.out.println(SKYSCRAPER_WAS_BUILD);
    }

    public Skyscraper7(int floorsCount) {
        System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + " " + floorsCount);
    }

    public Skyscraper7(String developer) {
        System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER + " " + developer);
    }

    public static void main(String[] args) {
        Skyscraper7 skyscraper = new Skyscraper7();
        Skyscraper7 skyscraperTower = new Skyscraper7(50);
        Skyscraper7 skyscraperSkyline = new Skyscraper7("JavaRushDevelopment");
    }
}
