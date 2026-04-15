public class methodHW {

    // 1) Print welcome message
    public static void printWelcomeMessage() {
        System.out.println("Welcome! Hope you are doing great.");
    }

    // 2) Add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // 3) Check even number
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // 4) Get maximum of two numbers
    public static int getMaximum(int a, int b) {
        return (a > b) ? a : b;
    }

    // 5) Calculate percentage
    public static double calculatePercentage(int obtained, int total) {
        return (obtained * 100.0) / total;
    }

    // 6) Overloaded display() methods
    public static void display(int num) {
        System.out.println("Integer value: " + num);
    }

    public static void display(String text) {
        System.out.println("String value: " + text);
    }

    // 7) Update value (pass by value demonstration)
    public static void updateValue(int x) {
        x = x + 10;
        System.out.println("Value inside method: " + x);
    }

    public static void main(String[] args) {

        // 1
        printWelcomeMessage();

        // 2
        int sum = add(5, 10);
        System.out.println("Sum: " + sum);

        // 3
        System.out.println("Is 8 even? " + isEven(8));

        // 4
        System.out.println("Maximum: " + getMaximum(20, 15));

        // 5
        System.out.println("Percentage: " + calculatePercentage(450, 500));

        // 6
        display(100);
        display("Hello Java");

        // 7
        int value = 50;
        System.out.println("Original value before method: " + value);
        updateValue(value);
        System.out.println("Original value after method: " + value);
    }
}

