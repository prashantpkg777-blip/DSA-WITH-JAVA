package Basics;

import java.math.BigInteger;
import java.util.Scanner;

public class TakingInput {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first no:");
        int firstNum = sc.nextInt();

        System.out.println("Enter second no:");
        int secondNum = sc.nextInt();

        int add = firstNum + secondNum;
        System.out.println("Total: "+ add);

        BigInteger bg = sc.nextBigInteger();
        System.out.println("Big Integer: "+ bg);

        boolean flag = sc.nextBoolean();
        System.out.println(flag);

        sc.close();
    }
}
