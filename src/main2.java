public class main2 {
    public static void main(String[] args) {
        String firstName = "Sultan";
        String lastName = "Suleyman";
        String favoriteDish = "Steak";

        printPersonInfo(firstName, lastName, favoriteDish);
    }

    public static void printPersonInfo(String name, String surname, String meal) {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Favorite Dish: " + meal);
    }
}
