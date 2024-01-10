
// public class basics{


//     public static void main(String Args[]){


        
//     }
// }


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



//Greatest Common Divisor
// public class basics{
// public static void main(String Argsp[]){
// int a=36;
// int b=60;
// gcd(a,b);
// }
// static void gcd(int n1, int n2 ){
// int gcd=0;
// for(int i=2;i<=n1|| i<=n2;i++){
// if(n1%i==0 && n2%i==0){
// gcd=i;
// }
// }
// System.out.println(gcd);
// }
// }

//Lowest Common Multiple
// public class basics{
//     public static void main(String Args[]){
// int a =12;
// int b=14;
// lcm(a, b);
//    }
// static void lcm(int a,int b){
// int max=a>b? a:b;
// int lcm=0;
// for(int i=max;i<=a*b;i++){
// if(i%a==0 && i%b==0){
// lcm=i;
// break;
// }
// }
// System.out.println(lcm);
// }
// }



// //decimal to binary:
// public class basics{


//     public static void main(String Args[]){
//         String str="1110";
//         System.out.println("in Binary: "+str); int n=Integer.parseInt(str, 2); System.out.println("in Decimal: "+n);
        
//     }
// }

//OR


// public class basics{


//     public static void main(String Args[]){

// int n =101100001;
// convert(n);

//     }

// static void convert(int a){

// int decimal=0;
// int n=0;
// int temp=a;
// while(a>0){
//     int digit=a%10;
//     decimal=decimal+digit *(int) Math.pow(2, n);
//     a=a/10;
//     n++;
// }
// System.out.println(decimal);
// }
// }

//octal to decimal


// public class basics{
// public static void main(String Args[]){
// int a=1101;
// convert(a);
//     }


// static void convert(int octal){
//     int decimal=0;
//     int n=0;
//     while(octal>0){ 
//         int digit=n%10;
//         decimal=decimal + digit*(int)Math.pow(8, n);
//         n++;
//         octal=octal%10;

//     }
//     System.out.println(decimal);


// }
// }


//hexadecimal to decimal conversion

// public class basics{
// 	public static void main(String Args[]){
// 		String n="C9";

// 		int x=Integer.parseInt(n,16);
// 		System.out.println(x);
        
//     }
// }


// //decimal to binary conversion
// public class basics{
// public static void main(String Args[]){
// int n=17;
// convert(n);
//     }

// static void convert(int n){
// int arr[]=new int[10];
// int i=0;
// while(n>0){
// int rem=n%2;
// arr[i++]=rem;
// n/=2;
// }


// for(int j=arr.length-1;j>=0;j--){
// 	System.out.print(arr[j]+", ");
// }
// }
// }


// /decimal to octal conversion

// public class basics{
//     public static void main(String Args[]){
// int a=214;
// convert(a);
        
//     }

// 	static void convert(int decimal){

// 		int arr[]=new int[20];
// int i=0;
// while (decimal>0) {
// int rem=decimal%8;
// arr[i++]=rem;
// decimal=decimal/8;
// }
// for(int j=arr.length-1;j>=0;j--){

// 	System.out.print(arr[j]+" ");
// }

// 	}
// }


// //decimal to hexadecimal

// public class basics{
//     public static void main(String Args[]){
// int a=1457;
// convert(a);

        
//     }

// static void convert(int decimal){
// int arr[]=new int [20];
// int i=0;

// while(decimal>0){
// int rem=decimal % 16;
// arr[i++]=rem;
// decimal=decimal/16;
// }
// for(int j=arr.length-1;j>=0;j--){
// 	switch (arr[j]) {
// 		case 10:
// 		System.out.print("A ");			
// 			break;
// 		case 11:
// 		System.out.print("B ");			
// 			break;
// 		case 12:
// 		System.out.print("C ");			
// 			break;
// 		case 13:
// 		System.out.print("D ");			
// 			break;
// 		case 14:
// 		System.out.print("E ");			
// 			break;
// 		case 15:
// 		System.out.print("F ");			
// 			break;
		
// 		default:
// 		System.out.print(arr[j]+" ");
// 			break;
// 	}
// }
// 	}
// }


//

// public class basics{
// public static void main(String Args[]){
// int n=12001;
// System.out.println(replace(n));
// // 1234
// }


// static int replace(int n){
//     if(n==0)return 0;
//     int digit=n%10;
//     if(digit==0){
//         digit=1;
//     }
//     return replace((n/10))*10+digit;
// }
// }



//CAlculate the area of a circle

// public class basics{

//     public static void main(String Args[]){

// int a=7;
// calc(a);
//     }


//     static void calc(int n){

//  double area=3.14*(n*n);
// System.out.println("Area of circle with radius "+n+" is "+area+"");
//     }
// }


//prime numbers from 1 to 100
// public class basics{


//     public static void main(String Args[]){

//         System.out.println("Hello");
// int n=100;
// check(n);


// for(int i=1;i<n;i++){
//     boolean a=check(i);
//     if(a==true){
//         System.out.print(i+" ");
//     }
// }
//     }

//     static boolean check(int n){

// if(n<2){
//     return true;
// }
//         for(int i=2;i<=n/2;i++){

//             if(n%i==0){
// return false;
//             }
//         }
//         return true;
        
//     }
// }


//calculate the number of digits in an integer


// public class basics{


//     public static void main(String Args[]){

// int a=1234;
// count(a);
        
//     }

//     static void count(int n){
// int count=0;
// while(n>0){

//     int digit=n%10;
// count++;
// n=n/10;
// }

// System.out.println("digits= "+count);
//     }
// }


