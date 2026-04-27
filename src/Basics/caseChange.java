package Basics;

import java.util.Scanner;

public class caseChange {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Word:");
        String word = sc.nextLine();

        String lower = word.toLowerCase();

        System.out.println("In LowerCase:" + lower);

        String upper = word.toUpperCase();

        System.out.println("In UpperCase:" + upper);

        sc.close();
    }
}