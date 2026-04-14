public class pattern {
    static void main() {

//        // Rectangle
//        int n = 5;
//
//        for (int row =1; row<=n; row++) {
//            for (int col = 1; col <= n; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//


//        // One side triangle
//        int n = 5;
//
//        for (int row = 1; row <= n; row++){
//            for (int col = 1; col <= row; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        // Rhombus
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

//        // Inverted one side Triangle
//        int n = 10;
//        for (int row =1; row <= n; row++){
//            for (int col=1; col <= n-row+1; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        // Pyramid
//         int n = 5;
//         for (int row = 1; row <= n; row++){
//             // space
//             for (int col = 1; col <= n - row; col++){
//                 System.out.print("  ");
//             }
//             //star
//             for (int col = 1; col <= 2*row - 1; col++){
//                 System.out.print("* ");
//             }
//             // move to next line
//             System.out.println();
//         }

        // Inverted pyramid
//            int n =4;
//
//            for (int row = 1; row <= n; row++){
//                // space
//                for (int col = 1; col <= row; col++){
//                    System.out.print("  ");
//                }
//                // star
//                for (int col = 1; col <= 2*(n - row) + 1; col++){
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }

        // Hollow rectangle
//             int n=10;
//
//             for (int row =1; row <= n; row++){
//                 for (int col =1; col<= n; col++) {
//                     // first and last row
//                     if (row == 1 || row == n) {
//                         System.out.print("* ");
//                     }
//                     // middle row
//                     else {
//                         if (col == 1 || col == n) {
//                             System.out.print("* ");
//                         } else {
//                             System.out.print("  ");
//                         }
//                     }
//                 }
//                 System.out.println();
//             }

        // Hollow one side triangle
//                int n = 15;
//
//                for (int row =1; row <= n; row++){
//                    // first and last row
//                    if (row == 1 || row == n) {
//                        for (int col = 1; col <= row; col++){
//                            System.out.print("* ");
//                        }
//                    }
//                    else
//                    {
//                        System.out.print("* ");
//                        // middle space
//                        for (int col =1; col <= row-2; col++){
//                            System.out.print("  ");
//                        }
//                        System.out.print("* ");
//                    }
//                    System.out.println();
//                }

        // Hollow pyramid
//                int n = 7;
//
//                for (int row = 1; row <= n; row++){
//                    // part 1 -> side space
//                    for (int col =1; col <= n-row; col++){
//                        System.out.print("  ");
//                    }
//                    // part 2 -> hollow pyramid
//                    if ( row ==1 || row == n){
//                        for (int col =1; col <= 2*row -1; col++){
//                            System.out.print("* ");
//                        }
//                    }
//                    else {
//                        System.out.print("* ");
//                        // middle space
//                        for (int col = 1; col <= 2*row -3; col++){
//                            System.out.print("  ");
//                        }
//                        System.out.print("* ");
//                    }
//                    System.out.println();
//                }

        // Bipyramid
//        // part 1
//        int n = 5;
//         for (int row = 1; row <= n; row++){
//             // space
//             for (int col = 1; col <= n - row; col++){
//                 System.out.print("  ");
//             }
//             //star
//             for (int col = 1; col <= 2*row - 1; col++){
//                 System.out.print("* ");
//             }
//             // move to next line
//             System.out.println();
//         }
//            // part 2
//            for (int row = 1; row <= n; row++){
//                if (row ==1){
//                    continue;
//                }
//                // space
//                for (int col = 1; col <= row-1; col++){
//                    System.out.print("  ");
//                }
//                // star
//                for (int col = 1; col <= 2*(n - row) + 1; col++){
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }

            // Hollow Bipyramid ( Hollow Diamond )
//               int n = 4;
//                // part 1
//                for (int row = 1; row <= n; row++){
//                    // part 1a -> side space
//                    for (int col =1; col <= n-row; col++){
//                        System.out.print("  ");
//                    }
//                    // part 1b -> hollow pyramid
//                    if ( row ==1 ){
//                        for (int col =1; col <= 2*row -1; col++){
//                            System.out.print("* ");
//                        }
//                    }
//                    else {
//                        System.out.print("* ");
//                        // middle space
//                        for (int col = 1; col <= 2*row -3; col++){
//                            System.out.print("  ");
//                        }
//                        System.out.print("* ");
//                    }
//                    System.out.println();
//                }
//                // part 2
//                for (int row=1; row <= (n-1); row++){
//                    // part 2a
//                    for (int col =1; col <= row; col++){
//                        System.out.print("  ");
//                    }
//                    // part 2b
//                    if (row == n-1){
//                        System.out.print("* ");
//                    }
//                    else {
//                        System.out.print("* ");
//
//                        for (int col = 1; col<= 2*(n-row)-3; col++){
//                            System.out.print("  ");
//                        }
//
//                        System.out.print("* ");
//                    }
//                    System.out.println();
//                }

            // Numberic one sided triangle
//                int n = 5;
//
//                for (int row=1; row<= n; row++){
//                    for (int col= 1; col<= row;col++){
//                        System.out.print(col+" ");
//                    }
//                    System.out.println();
//                }

//                 int n = 5;
//                 int count =1;
//
//                for (int row=1; row<= n; row++){
//                    for (int col= 1; col<= row;col++){
//                        System.out.print(count+" ");
//                        count++;
//                    }
//                    System.out.println();
//                }

            // Alphabetic one sided triangle
            int n =5;

            for (int  row=1; row<= n; row++){
                for (int col=1; col <=row; col++){

                    char finalAns = (char)('A' + col -1);

                    System.out.print(finalAns+" ");
                }
                System.out.println();
            }



    }
}
