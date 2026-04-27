package Basics;

import java.util.Scanner;

public class conditionals {
    static void main() {
        int age = 20;

        // if statement
        if (age>18) {
            System.out.println("You are eligible for voting");
        }

        // if-else statement
        if (age>18){
            System.out.println("can vote");
        } else {
            System.out.println("cannot vote");
        }

        // if-else-if ladder
        int day = 7;
        if (day == 1) {
            System.out.println("Sunday");
        } else if (day == 2) {
            System.out.println("Monday");
        } else if (day == 3) {
            System.out.println("Tuesday");
        } else if (day == 4) {
            System.out.println("Wednesday");
        } else if (day == 5) {
            System.out.println("Thursday");
        } else if (day == 6) {
            System.out.println("Friday");
        } else {
            System.out.println("Saturday");
        }

        // Nested if-else
        int gender = 'F';
        int ages = 5;
        if (gender == 'M'){
            System.out.println("You are Male");
            if (ages> 18) {
                System.out.println("And your age is equal to or greater than 18");
            } else {
                System.out.println("And your age is less than 18");
            }
        } else {
            System.out.println("You are not Male");
            if (ages> 18) {
                System.out.println("And your age is equal to or greater than 18");
            } else {
                System.out.println("And your age is less than 18");
            }
        }

        // Switch Statement
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a no:");
        int days = sc.nextInt();

        switch (days) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            default:
                System.out.println("Sun");
        }
    }
}
