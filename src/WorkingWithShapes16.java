public class WorkingWithShapes16 {
    public class Square {
        private double sideLength;

        public Square(double side) {
            this.sideLength = side;
        }

        public double calculateArea() {
            return sideLength * sideLength;
        }

        public double calculatePerimeter() {
            return 4 * sideLength;
        }
    }

    public class Circle {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double calculateArea() {
            return Math.PI * radius * radius;
        }

        public double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }
    }

    public static void main(String[] args) {
        WorkingWithShapes16 shapeWork = new WorkingWithShapes16();
        Square square = shapeWork.new Square(5);
        Circle circle = shapeWork.new Circle(3);

        System.out.println("Square Area: " + square.calculateArea());
        System.out.println("Square Perimeter: " + square.calculatePerimeter());

        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
    }
}
