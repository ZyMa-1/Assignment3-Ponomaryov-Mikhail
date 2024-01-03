import java.time.Year;

public class CarConcern9 {
    private final String manufacturer = "Lamborghini";
    private final String model;
    private final int year;
    private final String color;

    public CarConcern9(String model, int year, String color) {
        this.model = model;
        this.year = (year > 0) ? year : Year.now().getValue();
        this.color = (color != null && !color.isEmpty()) ? color : "Orange";
    }

    public CarConcern9(String model, int year) {
        this(model, year, "Orange");
    }

    public CarConcern9(String model) {
        this(model, 4321, "Orange");
    }
}
