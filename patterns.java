// public class patterns{public static void main(String Args[]){int n=5;for(int i=0;i<n; i++){System.out.print("|");}}};

// //pattern matching 

// public class patterns {

// ****
// ****
// ****
// ****

//     public static void main(String Args[]) {
//         int n = 5;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < 5; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//    ****
//    *  *
//    *  *
//    ****
// public class patterns {
//     public static void main(String Args[]) {
//         int n = 4;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < 4; j++) {
//                 if (i == 0 || i==n-1||j==0||j==n-1) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");

//                 }

//             }
//             System.out.println();
//         }

//     }

// }

// ****
//  ****
//   ****
//    ****
// public class patterns {
//     public static void main(String Args[]) {
//         int n = 4;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j <= i; j++) {

//                 System.out.print(" ");
//             }
//             for (int j = 0; j < n; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }

// }

// ******
// *    *
// *    *
// ******

// public class patterns {
//     public static void main(String Args[]) {
//         int n = 4;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < 6; j++) {
//                 if (i == 0 || i == n - 1 || j == 0 || j == 6 - 1) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }

//     }

// }

// ******
//  ******
//   ******
//    ******

// public class patterns {
//     public static void main(String Args[]) {
//         int n = 4;
//         for (int i = 0; i < n; i++) {
//             for (int j2 = 0; j2 < i; j2++) {
//                 System.out.print(" ");
//             }
//             for (int j = 0; j < 6; j++) {
//                 System.out.print("*");
//             }
//  System.out.println();
//         }

//     }

// }

//    ****
//   ****
//  ****
// ****
// public class patterns {
//     public static void main(String Args[]) {
//         int n = 5;
//         for (int i = 0; i < n; i++) {
//             for (int j = n-1; j > i; j--) {
//                 System.out.print(" ");
//             }
//             for (int j2 = 0; j2 < n; j2++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }

// }

// *
// **
// ***
// ****

// public class patterns {
//     public static void main(String Args[]) {
//         int n = 5;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j <= i; j++) {
//                 System.out.print("*");
//             }
// System.out.println();
//         }

//     }

// }

//       *
//      ***
//     *****
//    *******

// public class patterns {
//     public static void main(String Args[]) {
//         int n = 5;
//         for (int i = 0; i < n; i++) {
//             for (int j = n - i; j > 1; j--) {
//                 System.out.print(" ");
//             }
//             for (int j = 0; j <=i; j++) {
//                 System.out.print(" *");
//             }
//        System.out.println();
//         }

//     }
// }

//    *******
//     *****
//      ***
//       *

// public class patterns {
//     public static void main(String Args[]) {
//         int n = 5;
//         for (int i = 0; i < n; i++) {
//             System.out.print("|");

//             for (int j = 0; j <= i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = n - 1; j > i; j--) {
//                 System.out.print("* ");
//             }
// System.out.println();          
// }
//     }
// };

// |     *
// |    * *
// |   * * *
// |  * * * *
// | * * * * *
// |  * * * * 
// |   * * * 
// |    * * 
// |     * 

// public class patterns {
//     public static void main(String Args[]) {
//         int n = 5;

//         // printing upper triangle:
//         for (int i = 0; i < n; i++) {
//             System.out.print("|");
//             for (int j = n - 1; j > i; j--) {
//                 System.out.print(" ");
//             }
//             for (int j = 0; j <= i; j++) {
//                 System.out.print(" *");
//             }
//                         System.out.println();
//         }

//         //printing lower triangle
//         for (int j = 1; j < n; j++) {
//             System.out.print("|");
//             for (int i = 0; i <= j; i++) {
//                 System.out.print(" ");
//             }
//             for (int i = 0; i < n - j; i++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// };

// |*
// |**
// |***
// |****
// |*****
// |****
// |***
// |**
// |*

// public class patterns {
//     public static void main(String Args[]) {
//         int n = 5;
//         // printing upper half
//         for (int i = 0; i < n; i++) {
//             System.out.print("|");
//             for (int j = 0; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();

//         }

//         // printing lower half
//         for (int i = 0; i < n; i++) {
//             System.out.print("|");
//             for (int j = n - 1; j > i; j--) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// };

// |    *
// |   **
// |  ***
// | ****
// |*****
// | ****
// |  ***
// |   **
// |    *

// public class patterns {
//     public static void main(String Args[]) {
//         int n = 5;
//         //printing upper half
//         for (int i = 0; i < n; i++) {
//             System.out.print("|");
//             for (int j = n - 1; j > i; j--) {
//                 System.out.print(" ");
//             }
//             for (int j = 0; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         //printing lower half
// for (int i = 0; i < n; i++) {
//     System.out.print("|");
//     for (int j = 0; j <= i; j++) {
//         System.out.print(" ");
//     }
//     for (int j = n - i; j > 1; j--) {
//         System.out.print("*");
//     }
//     System.out.println();
// }
//     }
// };

//number patterns: 
// 1111
// 2222
// 3333
// 4444
// public class patterns {
//     public static void main(String Args[]) {
//         int n = 4;
//         for (int i = 1; i <= n; i++) {

//             for (int j = 0; j < n; j++) {
//                 System.out.print(i);
//             }
// System.out.println();

//         }
//     }
// };

// 1
// 23
// 456
// 78910
// public class patterns {
//     public static void main(String Args[]) {
//         int n = 4;
//         int count=1;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j <= i; j++) {
//                 System.out.print(count);
//                 count++;
//             }
// System.out.println();
//         }
//     }
// };

// 10987
// 654
// 32
// 1

// public class patterns {
//     public static void main(String Args[]) {
//         int n = 4;
//         int count = 10;
//         for (int i = 0; i < n; i++) {
//             for (int j = n - 1; j >=i; j--) {
//                 System.out.print(count);
//                 count--;
//             }
//             System.out.println();
//         }
//     }
// };

// 6666
// 555
// 44
// 3

// public class patterns {
//     public static void main(String Args[]) {
//         int n = 4;
//         int count = 6;
//         for (int i = n; i >= 1; i--) {
//          for (int j = 0; j <=i; j++) {
//              System.out.print(count);
//             }
//             count--;
//          System.out.println();
//         }
//     }
// };

// 3
// 44
// 555
// 6666
// public class patterns {
//     public static void main(String Args[]) {
//         int n = 4;
//         int count = 3;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j <= i; j++) {
//                 System.out.print(count);
//             }
//             count++;
//             System.out.println();
//         }
//     }
// };

// 3
// 4 5
// 6 7 8
// 9 10 11 12

// public class patterns {
//     public static void main(String Args[]) {
//         int n = 4;
//         int count=3;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j <= i; j++) {
//                 System.out.print(count+" ");
//                 count++;
//             }
//             System.out.println();
//         }
//     }
// };

// 3
// 44
// 555
// 6666
// 555
// 44
// 3

// public class patterns {
//     public static void main(String Args[]) {
//         int un = 4;
//         int count = 3;
//         // printing upperhalf
//         for (int i = 0; i < un; i++) {
//             for (int j = 0; j <= i; j++) {
//                 System.out.print(count);
//             }
//             count++;
//             System.out.println();
//         }

//         //printing ower half
//         count--;
//         int ln = 3;
//         for (int i = 0; i < ln; i++) {
//             count--;
//             for (int j = ln; j > i; j--) {
//                 System.out.print(count);
//             }
//             System.out.println();
//         } 

//     }
// };

// 2
// 33
// 444
// 5555
// 5555
// 444
// 33
// 2

// public class patterns {
//     public static void main(String Args[]) {
//         // printing upper half
//         int n = 4;
//         int count = 2;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j <= i; j++) {
//                 System.out.print(count);
//             }
//             count++;
//             System.out.println();
//         }
//         count--;
//         for (int i = 0; i < n; i++) {
//             for (int j = n - i; j > 0; j--) {
//                 System.out.print(count);

//             }
//             count--;
//             System.out.println();
//         }
//     }
// };

// 1*2*3*4
// 5*6*7*8
// 9*10*11*12
// 13*14*15*16*

// public class patterns {
//     public static void main(String Args[]) {
//         int n = 4;
//         int count = 1;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 System.out.print(count++ + "*");
//             }
//     System.out.println();
//  }
//     }
// };

//      *
//     ** 
//    *** 
//  ***** 
// ******

// public class patterns {
//     public static void main(String Args[]) {
//         int n = 5;
//         for (int i = 0; i < n; i++) {
//             System.out.print("|");
//             for (int j = n-1; j >=i; j--) {
//                 System.out.print(" ");
//             }
//             for (int j = 0; j <=i; j++) {
//                System.out.print("*"); 
//             }
//             System.out.println();
//         }
//     }
// };

public class patterns {
    public static void main(String Args[]) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            System.out.print("|");

        }
    }
};
