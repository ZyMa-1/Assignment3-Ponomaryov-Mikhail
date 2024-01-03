public class main4 {
    public static void main(String[] args) {
        universalMethod(17);
        universalMethod("Check");
        universalMethod(1.41);
        universalMethod(true);
        universalMethod(5, 15);
        universalMethod("multiply", 3);
        universalMethod(1, 4, 7);
        universalMethod(false, "msg");
        universalMethod("arr: ", 1, 2, 3, 4, 5);
        universalMethod('A', 10, true);
    }

    public static void universalMethod(int value) {
        System.out.println("Method 1: " + value);
    }

    public static void universalMethod(String str) {
        System.out.println("Method 2: " + str);
    }

    public static void universalMethod(double value) {
        System.out.println("Method 3: " + value);
    }

    public static void universalMethod(boolean flag) {
        System.out.println("Method 4: " + flag);
    }

    public static void universalMethod(int a, int b) {
        System.out.println("Method 5: " + (a + b));
    }

    public static void universalMethod(String str, int times) {
        System.out.println("Method 6: " + str.repeat(times));
    }

    public static void universalMethod(int... values) {
        System.out.print("Method 7: ");
        for (int value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void universalMethod(boolean flag, String message) {
        System.out.println("Method 8: " + (flag ? message : "Not " + message));
    }

    public static void universalMethod(String prefix, int... numbers) {
        System.out.print("Method 9: " + prefix + " ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void universalMethod(char initial, int count, boolean condition) {
        System.out.print("Method 10: " + initial + " repeated " + count + " times - ");
        System.out.println(condition ? "Success!" : "Failure!");
    }
}
