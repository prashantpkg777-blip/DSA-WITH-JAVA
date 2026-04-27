package Basics;

public class loops {
    static void main() {
         // for loop
        for (int i=1; i<= 1000; i++){
            System.out.println("Prashant Gautam "+i);
        }

        for (int i=1; i<=3; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // while loop
        int i=1;

        while (i<=10) {
            System.out.println(i);
            i++;
        }

        // do-while loop
        int x =1;

        do {
            System.out.println(x);
            x++;
        } while (x<0);
    }
}
