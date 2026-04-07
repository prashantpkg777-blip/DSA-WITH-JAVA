public class sevenMultiple {
    static void main() {
        // Print all integers in range from 50 to 100, that are perfectly divisible by 7

        for (int i = 50; i <= 100; i++){
            if (i % 7 == 0) {
                System.out.print(i+" ");
            }
        }
    }
}
