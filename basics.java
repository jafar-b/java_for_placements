// import java.util.ArrayList;

// public class basics {

//     public static void main(String args[]) {
//     int sum = 0;
// // Sum of numbers between a given interval:
// int a = 5;
// int b = 10;
// for(int i = a;i<=b;i++)
// {
//     sum = sum + a;
//     a++; 
// }
// System.out.println(sum);

// }

//     }

// //greatest of three numbers
// public class basics  
//     {
//     public static void main(String Args[]) {
//         int a= 10;    
//         int b= 11;    
//         int c = 12;
//         int temp = a > b ? a : b;
//         int largest = temp > c ? temp : c;
//         System.out.println(largest + " is the largest.");

//     }    
// }

// //Leap year or not
// public class basics  
//     {
//         public static void main(String Args[]) {
//             int year = 2024;
//             if (year % 4 == 0) {
//                 System.out.println("Leap year");
//             } else {
//                 System.out.println("Not a leap year");
//             }

// }    
// }

//prime number or not

// public class basics

// {
//     public static void main(String Args[]) {
//         int n = 7;
//         for (int i = 2; i < n / 2; i++) { //only executing the loop halfway through "n " i.e till 3 in this case.. because 4 k table me 7 nhi ayega(4*2=8 which is greater than 7).

//             if (n % i == 0) {
//                 System.out.println(n + " is not a prime number");
//             }
//         }
//     }
// }

// //prime number within a given range
// public class basics {
//     public static void main(String Args[]) {
//         int a = 2;
//         int b = 10;
//         for (int i = a; i <= b; i++) {
//         isPrime(i);
//         }
//     }

//     static  void isPrime(int n) {

//             for (int i = 2; i < n / 2; i++) {
//             if(n % i == 0 ){
//                 System.out.println(n + " is not a prime number");
//             } 
//          }
// }

// }

//sum of digits of a number.

// public class basics  
// {
//     public static void main(String Args[]){
//         int n = 123;
//         System.out.println(getSum(n));
//     }
//     static int getSum(int n) {
//         int sum = 0;
//         if (n == 0) {
//             return sum;
//         }
//         return (n % 10) + getSum(n / 10);
//     }
// }

// //reverse of a number
// public class basics{

// public static void main(String Args[])
// {
// int a=12345;
// getRev(a);
// }

// static void getRev(int n){
// if(n==0)return ;
// int digit=n%10;
// System.out.print(digit);
// getRev(n/10);
// }
// }

//OR using while loop reverse of a number

// public class basics{

// public static void main(String Args[])
// {

//   int a=123456789;
// while(a!=0){
//   int digit=a%10;
//   System.out.print(digit);
//   a=a/10;

// }
// }

// }

// //Palindrome check
// public class basics{
// public static void main(String Args[])
// {
// int a=12321;
// System.out.println(check(a));}

// static boolean check(int a){
//   int rev=0;
//   int temp=a;
//   while(temp!=0){
//     int digit=temp%10;
//     rev= rev*10+digit;
//     temp/=10;

//   }
//   if(rev==a)return true;

// return false;
// }
// }

// //armstrong number
// public class basics{

//     public static void main(String Args[]){
//         int a=371;
//         check(a);
//     }

// static void check(int a){
// int sum=0;
// int temp=a;
// while(temp!=0){
// int digit=temp%10;
// sum=sum+((int)(Math.pow(digit,order(a))));
// temp=temp/10;
// }
// if(sum==a){System.out.println("Armstrong");}
// else{System.out.println("Not an armstrong as the sum is "+sum );}
// }
// static int order(int a){
// int order=0;
// while(a!=0){
//     order++;
//     a=a/10;
// }
//     return order;
// }
// }

//armstrong number in given range

// public class basics {

//     public static void main(String Args[]) {

//         int lower = 1;
//         int upper = 1000;
//             for (int i = lower; i <= upper; i++) {
//                 armstrong(i);   
//             }
//         }

//         static void armstrong(int n) {
//             int sum = 0;
//             int temp = n;
//             while (temp != 0) {
//                 int digit = temp % 10;
//                 sum = sum + (int) Math.pow(digit, order(n));
//                 temp = temp / 10;
//             }
//             if (n == sum) {
//                 System.out.print(sum+", ");}
//     }

//     static int order(int n) {
//         int order = 0;
//         while (n != 0) {
//             int digit = n % 10;
//             order++;
//             n = n / 10;
//         }
//         return order;

//     }
// }

//

//fibonacci series

// public class basics {
//     public static void main(String Args[]) {
//         int n = 25;
//         fibonacci(n);
//     }

//     static void fibonacci(int n) {
//         int a = 1;
//         int b = 2;
//         int next=0;

//         for (int i = 2; i <= n; i++) {

//             next = a + b;

//             System.out.print(next + " ");

//                 a = b;
//                 b = next;

//         }

//     }

// }



//prime factors of a number


