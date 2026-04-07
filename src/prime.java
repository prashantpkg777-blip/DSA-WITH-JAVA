// print all prime number from 1 to 100

public class prime {
    static void main() {
        for (int i = 2; i <= 100; i++){
            boolean isPrime = true;

            for (int j =2; j < i; j++) {
                if (i % j ==0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
