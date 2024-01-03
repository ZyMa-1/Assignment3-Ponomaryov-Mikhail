public class CreatingATriangleClass13 {
    public class Triangle {
        private double a;
        private double b;
        private double c;

        public Triangle(double s1, double s2, double s3) {
            this.a = s1;
            this.b = s2;
            this.c = s3;
        }

        public double calculatePerimeter() {
            return a + b + c;
        }

        public double calculateArea() {
            double s = calculatePerimeter() / 2;
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }
    }

    public static void main(String[] args) {
        CreatingATriangleClass13 create = new CreatingATriangleClass13();
        Triangle triangle = create.new Triangle(3, 4, 5);

        System.out.println("Perimeter: " + triangle.calculatePerimeter());
        System.out.println("Area: " + triangle.calculateArea());
    }
}
