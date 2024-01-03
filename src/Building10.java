public class Building10 {
    private String type;

    public void initialize(String newType) {
        this.type = newType;
    }

    public static void main(String[] args) {
        Building10 building = new Building10();
        building.initialize("Барбершоп");
    }
}
