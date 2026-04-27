package Basics;

import java.util.Scanner;

public class bestFour {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];

        System.out.println("Enter 5 Subject marks: ");
        for (int i =0; i<5; i++) {
            marks[i] = sc.nextInt();
        }

        int min = marks[0];
        int sum = marks[0];

        for (int i =1; i<5; i++){
            sum += marks[i];
            if (marks[i] < min){
                min = marks[i];
            }
        }

        sum = sum - min;

        double percent = (sum/400.00)*100;

        System.out.println("Droped marks:"+min);
        System.out.println("Percentage of best of 4 subjects: "+ percent +"%");

        sc.close();
    }
}
