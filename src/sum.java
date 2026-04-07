import java.util.Scanner;

public class sum {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number for sum from 1 : ");
        int num = sc.nextInt();

        int sum =0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("Sum of number 1 to "+ num +" is: "+sum);
    }
}
