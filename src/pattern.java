public class pattern {
    static void main() {
//        int n = 5;
//
//        for (int row =1; row<=n; row++) {
//            for (int col = 1; col <= n; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        int n=6;
//
//        for (int row = 1; row <= n; row++){
//            for (int col = 1; col <= 5; col++){
//                System.out.print("* ");
//            }
//            System.out.println();

//        int n = 5;
//
//        for (int row = 1; row <= n; row++){
//            for (int col = 1; col <= row; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        int n =8;
//         for (int row = 1; row <= n; row++){
//             // for space
//             for (int col =1; col<= n - row; col++){
//                 System.out.print("  ");
//             }
//             // for star
//             for (int col = 1; col<= n; col++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }

//        int n = 10;
//        for (int row =1; row <= n; row++){
//            for (int col=1; col <= n-row+1; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

         int n = 5;
         for (int row = 1; row <= n; row++){
             // space
             for (int col = 1; col <= n - row; col++){
                 System.out.print("  ");
             }
             //star
             for (int col = 1; col <= 2*row - 1; col++){
                 System.out.print("* ");
             }
             // move to next line
             System.out.println();
         }
    }
}
