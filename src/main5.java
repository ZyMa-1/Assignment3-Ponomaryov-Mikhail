public class main5 {
    public static String city = "Токио";
    public static double population = 34.5;

    public static void main(String[] args) {
        printCityPopulation("Джакарта", 25.3);
        printCityPopulation("Сеул", 25.2);
        printCityPopulation("Дели", 23.1);
        printCityPopulation("Нью-Йорк", 21.6);
    }

    public static void printCityPopulation(String cityName, double cityPopulation) {
        System.out.println("The population of the city of " + cityName + " is " + cityPopulation + " million people.");
        System.out.println("While the most populous city of " + city + " has a population of " + population + " million people.");
        System.out.println();
    }
}
