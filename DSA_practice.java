// public class DSA_practice{public static void main(String Args[]){ } }

// import java.util.ArrayList;

// public class DSA_practice {

// public static void main(String args[]) {
// int sum = 0;
// // Sum of numbers between a given interval:
// int a = 5;
// int b = 10;
// for(int i = a;i<=b;i++)
// {
// sum = sum + a;
// a++;
// }
// System.out.println(sum);

// }

// }

// //greatest of three numbers
// public class DSA_practice
// {
// public static void main(String Args[]) {
// int a= 10;
// int b= 11;
// int c = 12;
// int temp = a > b ? a : b;
// int largest = temp > c ? temp : c;
// System.out.println(largest + " is the largest.");

// }
// }

// //Leap year or not
// public class DSA_practice
// {
// public static void main(String Args[]) {
// int year = 2024;
// if (year % 4 == 0) {
// System.out.println("Leap year");
// } else {
// System.out.println("Not a leap year");
// }

// }
// }

// prime number or not

// public class DSA_practice

// {
// public static void main(String Args[]) {
// int n = 7;
// for (int i = 2; i < n / 2; i++) { //only executing the loop halfway through
// "n " i.e till 3 in this case.. because 4 k table me 7 nhi ayega(4*2=8 which
// is greater than 7).

// if (n % i == 0) {
// System.out.println(n + " is not a prime number");
// }
// }
// }
// }

// //prime number within a given range
// public class DSA_practice {
// public static void main(String Args[]) {
// int a = 2;
// int b = 10;
// for (int i = a; i <= b; i++) {
// isPrime(i);
// }
// }

// static void isPrime(int n) {

// for (int i = 2; i < n / 2; i++) {
// if(n % i == 0 ){
// System.out.println(n + " is not a prime number");
// }
// }
// }

// }

// sum of digits of a number.

// public class DSA_practice
// {
// public static void main(String Args[]){
// int n = 123;
// System.out.println(getSum(n));
// }
// static int getSum(int n) {
// int sum = 0;
// if (n == 0) {
// return sum;
// }
// return (n % 10) + getSum(n / 10);
// }
// }

// //reverse of a number
// public class DSA_practice{

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

// OR using while loop reverse of a number

// public class DSA_practice{

// public static void main(String Args[])
// {

// int a=123456789;
// while(a!=0){
// int digit=a%10;
// System.out.print(digit);
// a=a/10;

// }
// }

// }

// //Palindrome check
// public class DSA_practice{
// public static void main(String Args[])
// {
// int a=12321;
// System.out.println(check(a));}

// static boolean check(int a){
// int rev=0;
// int temp=a;
// while(temp!=0){
// int digit=temp%10;
// rev= rev*10+digit;
// temp/=10;

// }
// if(rev==a)return true;

// return false;
// }
// }

// //armstrong number
// public class DSA_practice{

// public static void main(String Args[]){
// int a=371;
// check(a);
// }

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
// order++;
// a=a/10;
// }
// return order;
// }
// }

// armstrong number in given range

// public class DSA_practice {

// public static void main(String Args[]) {

// int lower = 1;
// int upper = 1000;
// for (int i = lower; i <= upper; i++) {
// armstrong(i);
// }
// }

// static void armstrong(int n) {
// int sum = 0;
// int temp = n;
// while (temp != 0) {
// int digit = temp % 10;
// sum = sum + (int) Math.pow(digit, order(n));
// temp = temp / 10;
// }
// if (n == sum) {
// System.out.print(sum+", ");}
// }

// static int order(int n) {
// int order = 0;
// while (n != 0) {
// int digit = n % 10;
// order++;
// n = n / 10;
// }
// return order;

// }
// }

//

// fibonacci series

// public class DSA_practice {
// public static void main(String Args[]) {
// int n = 25;
// fibonacci(n);
// }

// static void fibonacci(int n) {
// int a = 1;
// int b = 2;
// int next=0;

// for (int i = 2; i <= n; i++) {

// next = a + b;

// System.out.print(next + " ");

// a = b;
// b = next;

// }

// }

// }

// Greatest Common Divisor
// public class DSA_practice{
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

// Lowest Common Multiple
// public class DSA_practice{
// public static void main(String Args[]){
// int a =6;
// int b=12;
// lcm(a, b);
// }
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
// public class DSA_practice{

// public static void main(String Args[]){
// String str="1110";
// System.out.println("in Binary: "+str); int n=Integer.parseInt(str, 2);
// System.out.println("in Decimal: "+n);

// }
// }

// OR

// public class DSA_practice{

// public static void main(String Args[]){

// int n =101100001;
// convert(n);

// }

// static void convert(int a){

// int decimal=0;
// int n=0;
// int temp=a;
// while(a>0){
// int digit=a%10;
// decimal=decimal+digit *(int) Math.pow(2, n);
// a=a/10;
// n++;
// }
// System.out.println(decimal);
// }
// }

// octal to decimal

// public class DSA_practice{
// public static void main(String Args[]){
// int a=1101;
// convert(a);
// }

// static void convert(int octal){
// int decimal=0;
// int n=0;
// while(octal>0){
// int digit=n%10;
// decimal=decimal + digit*(int)Math.pow(8, n);
// n++;
// octal=octal%10;

// }
// System.out.println(decimal);

// }
// }

// hexadecimal to decimal conversion

// public class DSA_practice{
// public static void main(String Args[]){
// String n="C9";

// int x=Integer.parseInt(n,16);
// System.out.println(x);

// }
// }

// //decimal to binary conversion
// public class DSA_practice{
// public static void main(String Args[]){
// int n=17;
// convert(n);
// }

// static void convert(int n){
// int arr[]=new int[10];
// int i=0;
// while(n>0){
// int rem=n%2;
// arr[i++]=rem;
// n/=2;
// }

// for(int j=arr.length-1;j>=0;j--){
// System.out.print(arr[j]+", ");
// }
// }
// }

// /decimal to octal conversion

// public class DSA_practice{
// public static void main(String Args[]){
// int a=214;
// convert(a);

// }

// static void convert(int decimal){

// int arr[]=new int[20];
// int i=0;
// while (decimal>0) {
// int rem=decimal%8;
// arr[i++]=rem;
// decimal=decimal/8;
// }
// for(int j=arr.length-1;j>=0;j--){

// System.out.print(arr[j]+" ");
// }

// }
// }

// //decimal to hexadecimal

// public class DSA_practice{
// public static void main(String Args[]){
// int a=1457;
// convert(a);

// }

// static void convert(int decimal){
// int arr[]=new int [20];
// int i=0;

// while(decimal>0){
// int rem=decimal % 16;
// arr[i++]=rem;
// decimal=decimal/16;
// }
// for(int j=arr.length-1;j>=0;j--){
// switch (arr[j]) {
// case 10:
// System.out.print("A ");
// break;
// case 11:
// System.out.print("B ");
// break;
// case 12:
// System.out.print("C ");
// break;
// case 13:
// System.out.print("D ");
// break;
// case 14:
// System.out.print("E ");
// break;
// case 15:
// System.out.print("F ");
// break;

// default:
// System.out.print(arr[j]+" ");
// break;
// }
// }
// }
// }

// convert all zeros to one's in a given number

// public class DSA_practice{
// public static void main(String Args[]){
// int n=12001;
// System.out.println(replace(n));
// // 1234
// }

// static int replace(int n){
// if(n==0)return 0;
// int digit=n%10;
// if(digit==0){
// digit=1;
// }
// return replace((n/10))*10+digit;
// }
// }

// CAlculate the area of a circle

// public class DSA_practice{

// public static void main(String Args[]){

// int a=7;
// calc(a);
// }

// static void calc(int n){

// double area=3.14*(n*n);
// System.out.println("Area of circle with radius "+n+" is "+area+"");
// }
// }

// prime numbers from 1 to 100
// public class DSA_practice{

// public static void main(String Args[]){

// System.out.println("Hello");
// int n=100;
// check(n);

// for(int i=1;i<n;i++){
// boolean a=check(i);
// if(a==true){
// System.out.print(i+" ");
// }
// }
// }

// static boolean check(int n){

// if(n<2){
// return true;
// }
// for(int i=2;i<=n/2;i++){

// if(n%i==0){
// return false;
// }
// }
// return true;

// }
// }

// calculate the number of digits in an integer

// public class DSA_practice{

// public static void main(String Args[]){

// int a=1234;
// count(a);

// }

// static void count(int n){
// int count=0;
// while(n>0){

// int digit=n%10;
// count++;
// n=n/10;
// }

// System.out.println("digits= "+count);
// }
// }

// digits to words of a given number
// import java.util.ArrayList;
// public class DSA_practice{
// public static void main(String Argsp[]){
// int number=9999;
// whatis(number);
// }

// static void whatis(int n){

// int digit=0;
// String units[]=new String
// []{"Zero,","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
// String tens[]=new String
// []{"Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
// String Hundreds[]=new String[]{"One Hundred","Two Hundred","Three
// Hundred","Four Hundred","Five Hundred","Six Hundred","Seven Hundred","Eight
// Hundred","Nine Hundred"};
// String Thousands[]=new String[]{"One Thousand,","Two Thousand","Three
// Thousand","Four Thousand","Five Thousand","Six
// Thousand","SevenThousand","Eight Thousand","Nine Thousand"};
// ArrayList <String>words=new ArrayList<String>();

// // if(n>0){}

// digit=n%10;
// words.add(units[digit]);
// n=n/10;
// if(n>0){
// digit=n%10;
// words.add(tens[digit-1]);
// n=n/10;
// }
// if(n>0){
// digit=n%10;
// words.add(Hundreds[digit-1]);
// n=n/10;

// }
// if(n>0){
// digit=n%10;
// words.add(Thousands[digit-1]);
// n=n/10;
// }

// for (int i = words.size()-1;i>=0; i--) {
// System.out.print(words.get(i)+" ");
// }

// }
// }

// Codes for Recursion

// finding power of a number

// public class DSA_practice{
// public static void main(String Args[]){
// int a=5;
// int order=3;
// System.out.println(find(a, order));
// }
// static int find(int n ,int order){ //(5,3)
// if(order==0){
// return 1;
// }
// return n*find(n, order-1); //(5*find(5,2))==25
// //(5*find(5,1))==5 --------25*5=125
// //(5*find(5,0))==1 --------25*5*1=125
// }
// }

// largest element in an array

// public class DSA_practice{

// public static void main(String Args[]){

// int arr[]=new int[]{13,16,20,90,120,1120};
// find(arr);
// }

// static void find(int[] arr){
// int max=0;

// for(int i=0;i<arr.length;i++){
// if(arr[i]>max) max=arr[i];

// }
// System.out.println("Largest element= "+max);
// }
// }

// reverse a number
// public class DSA_practice{
// public static void main(String Args[]){
// int a=1234; //4321
// reverse(a);

// }

// static int reverse(int n){

// if(n==0){
// return 0;
// }

// int digit=n%10;
// System.out.print(digit);
// return reverse(n/10);

// }

// }

// calculate length of string using recursion
/*
 * public class DSA_practice
 *{
 * 
 * 
 * public static void main(String Args[]){
 * 
 * String str="hello";
 * System.out.println(calc(str));
 * calcc(str);
 * }
 * //recursion
 * static int calc(String str){
 * if(str.equals("")) return 0;
 * return calc(str.substring(1))+1;
 * }
 * 
 * 
 * //loop
 * static void calcc(String str){
 * int count=0;
 * for(int i=0;i<str.length();i++){
 * count++;
 * }
 * System.out.println(count);
 * 
 * 
 * 
 * }
 * 
 * }
 */

// //last non zero digit of a factorial number:

// public class DSA_practice{

// public static void main(String Args[]){
// int a=5;
// calc(a);
// // System.out.println(calc(a));
// }

// static int factorial(int n){

// if(n==0)return 1;
// return n*factorial(n-1);
// }

// static void calc(int n){
// int fact=factorial(n);
// System.out.println(fact);

// while (fact>0) {
// int digit=fact%10;
// if (digit!=0) {
// System.out.println(digit);
// break;
// }
// fact=fact/10;

// }
// }
// }

// largest element in an array using recursion:
// public class DSA_practice {
// public static void main(String Args[]) {

// int arr[] = new int[] { 1, 2, 3, 4, 45, 5, 6, 7, 8, 9 };
// // check(arr,0);
// System.out.println(check(arr, arr.length));
// }

// static int check(int arr[],int n) {
// if (n == 0) {
// return arr[1];
// }
// return Math.max(arr[n - 1], check(arr, n - 1));
// }
// }

// smallest element in an array :

// public class DSA_practice {
// public static void main(String Args[]) {
// int a[] = new int[] {35, 2, 3, 4, 5, 65, 7 };

// System.out.println(check(a,a.length));
// }

// static int check(int a[],int n) {

// if (n==0) {
// return a[0];
// }

// return Math.min(a[n-1],check(a,n-1));
// }

// }

// smallest and largest element in an array:

// public class DSA_practice {
// public static void main(String Args[]) {
// int arr[] = new int[] { 2, 3, 4, 5, 6, 7 };
// check(arr);
// }

// static void check(int arr[]) {

// int max = 0;
// int min = arr[0];
// for (int i = 0; i < arr.length; i++) {
// if (arr[i] > max)
// max = arr[i];
// // min = max;
// if (min > arr[i]) min = arr[i];
// }
// System.out.println(max + " " + min);
// }
// }

// //second smallest element in an array:

// public class DSA_practice {
// public static void main(String Args[]) {
// int arr[] = new int[] { 1, 2, 3, 4, 5, 5, 6, 7, 8 };
// check(arr);

// }

// static void check(int arr[]) {
// int second = arr[0];
// int smallest = arr[0];
// for (int i = 0; i < arr.length; i++) {
// if (smallest > arr[i])
// smallest = arr[i];

// }
// System.out.println("smallest: " + smallest);

// for (int i = 0; i < arr.length; i++) {
// if (arr[i] != smallest && arr[i]< second ) {
// System.out.println(arr[i]);
// }
// }
// System.out.println("second: " + second);
// }
// } //todo

// //frequency of elements in an array
// public class DSA_practice {
// public static void main(String Args[]) {

// int[] arr = { 1, 2, 2, 3, 3,3,4,4,5,5,5};
// freqcount(arr);

// }

// static void freqcount(int[] arr) {
// for (int i = 0; i < arr.length; i++) {

// int count = 1;
// while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
// count++;
// i++;
// }
// System.out.println(arr[i]+" occured "+count+" times in the array.");
// }
// }
// }

// //sorting elements of an array by frequency
// public class DSA_practice {
// public static void main(String Args[]) {
// int arr[] = {1,2,3,161,172, 1221 ,123};
// palindrome(arr);

// }

// static boolean pal(int a) {
// int temp = a;
// int reverse = 0;
// while (temp > 0) {
// int digit = temp % 10;
// reverse = reverse *10+(digit);
// temp = temp / 10;
// }
// if (reverse == a) {
// return true;
// }
// return false;
// }

// static void palindrome(int []arr){
// int max = 0;

// for (int i = 0; i < arr.length; i++) {

// if (pal(arr[i]) == true) {
// // System.out.println(arr[i]);
// max = arr[i];
// }

// }
// System.out.println(max);
// }

// }

// counting all the distinct values in an array

// import java.util.HashMap;

// public class DSA_practice {

// public static void main(String Args[]) {
// int arr[] = { 1, 2,2,3,4,7,7 };
// countdis(arr);

// }

// static void countdis(int arr[]) {
// int n = arr.length;
// int count = 0;

// HashMap<Integer, Integer> map = new HashMap<>();
// for (int i = 0; i < arr.length; i++) {
// if (map.containsKey(arr[i])) {
// map.put(arr[i], map.get(arr[i] + 1));
// } else {
// map.put(arr[i], 1);
// }

// }
// System.out.println(map.size());

// }
// }

// finding repeating elements in an array
// METHOD 1: using for loops
// public class DSA_practice {
// public static void main(String Args[]) {
// int arr[] = { 1, 2, 2, 3, 3, 4, 5, 6 };
// countre(arr);

// }

// static void countre(int[] arr) {

// int count = 0;
// for (int i = 0; i < arr.length; i++) {
// for (int j = i+1; j < arr.length; j++) {
// if (arr[i] == arr[j]) {
// System.out.println(arr[i]);
// }
// }
// }

// }

// }
// METHOD 2: using HashMap

// import java.util.HashMap;

// public class DSA_practice {
// public static void main(String Args[]) {

// int arr[] = { 1, 2, 2, 3, 4, 4, 5, 6 };
// countre(arr);
// }

// static void countre(int[] arr) {
// int count = 0;
// HashMap<Integer,Integer> map = new HashMap<>();
// for (int i = 0; i < arr.length; i++) {

// if (map.containsKey(arr[i])) {
// map.put(arr[i], map.get(arr[i]) + 1);
// } else {
// map.put(arr[i], 1);
// }
// if (map.get(arr[i]) > 1) {
// System.out.print(arr[i]+" ");
// }

// }

// }

// }

// minimum scalar of two vectors
// public class DSA_practice{
// public static void main(String Args[]){
// int arr[]={1,2,3,4,6};
// int arr2[]={5,4,3,2,1};
// sort(arr, arr2);

// }

// //sorting function
// static void sort(int arr[],int[] arr2){
// for(int i=0;i<arr.length;i++){
// //sorting in ascending
// for (int j = i+1; j < arr.length; j++) {
// if(arr[i]>arr[j]){
// int temp=arr[i];
// arr[i]=arr[j];
// arr[j]=temp;
// }
// }
// }

// //sorting in descending

// for (int i = 0; i < arr2.length; i++) {
// for (int j = 0; j < arr2.length; j++) {
// if(arr2[i]>arr2[j]){
// int temp=arr2[i];
// arr2[i]=arr2[j];
// arr2[j]=temp;
// }
// }
// }

// int sum=0;
// for (int i = 0; i < arr.length; i++) {
// sum+=arr[i]*arr2[i];
// }
// System.out.println(sum);

// }
// }

// number of even-odd elements in an array

// public class DSA_practice{
// public static void main(String Args[]){
// int[] arr={1,2,3,4,5,6,7,8,9,10,11};
// find(arr);

// }
// static void find(int arr[]){
// int even=0;
// int odd=0;
// for (int i = 0; i < arr.length; i++) {
// if(arr[i]%2==0){
// even=even+1;}
// else{
// odd++;
// }
// }
// System.out.println("Even= "+even);
// System.out.println("Odd= "+odd);

// }
// }

// STRING OPERATIONS
// Removing vowels from a string

// public class DSA_practice{
// public static void main(String Args[]){
// String str="zafar";
// remove(str);
// }

// static void remove(String str){
// char vowels[]={'a','e','i','o','u'};
// for(int i=0;i<str.length();i++){
// for (int j = 0; j < vowels.length; j++) {

// if(str.charAt(i)==vowels[j]){

// str=str.replace(str.charAt(i),' ');
// }
// }
// }
// System.out.println(str);
// }
// }

// public class DSA_practice{
// public static void main(String Args[]){
// String str="zafar";
// remove(str);
// }

// static void remove(String str){
// str=str.replaceAll("[aeiou]", "");
// System.out.println(str);
// }
// }

// counting strlen without using the function

// public class DSA_practice {
// public static void main(String Args[]) {

// String str = "helloworld";
// count(str);
// }

// static void count(String str) {
// int count = 0;
// for (char c : str.toCharArray()) {
// count++;
// }

// System.out.println(count);
// }

// }

// //checking if the character is palindrome or not

// public class DSA_practice {
// public static void main(String Args[]) {
// String str="aamaa";
// check(str);

// }

// static void check(String str) {

// String reverse = "";
// for (int i = str.length()-1; i >= 0; i--) {
// reverse = reverse + str.charAt(i);
// System.out.println(reverse);
// }
// if (reverse.equals(str)) {
// System.out.println("Palindrome");
// }

// }

// }

// remove spaces from string

// public class DSA_practice {
// public static void main(String Args[]) {

// String str = "Hello world";

// rem(str);
// }

// static void rem(String str) {

// str = str.replaceAll(" ", "");
// System.out.println(str);
// }

// }

// replacing substring inside a string

// public class DSA_practice {
// public static void main(String Args[]) {
// String str = "Hello world";
// replace(str);
// };

// static void replace(String str) {
// String toReplace="world";
// String replacement = "Java";
// str = str.replaceAll(toReplace, replacement);

// System.out.println(str);
// }

// }

// sorting all the negative elements to one side of array
// public class DSA_practice {
// public static void main(String Args[]) {
// int arr[] = { 1, 2, 3, 4, 5, -1, -2, -4 };
// run(arr);

// }

// static void run(int arr[]) {

// for (int i = 0; i < arr.length; i++) {
// for (int j = i + 1; j < arr.length; j++) {
// if (arr[i] > arr[j]) {
// int temp = arr[i];
// arr[i] = arr[j];
// arr[j] = temp;
// }
// }
// }

// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i]);

// }
// }

// }

// //Largest sum contiguous subarray
// public class DSA_practice {
// public static void main(String Args[]) {
// int arr[] = { 5,-4,-2,6,-1};
// find(arr);
// }

// static void find(int arr[]) {
// int maxsum = 0;
// int currsum = 0;

// for (int i = 0; i < arr.length; i++) {
// currsum = currsum + arr[i];
// if (currsum > maxsum) {
// maxsum = currsum;
// }
// if (currsum < 0) {
// currsum = 0;
// }

// }
// System.out.println(maxsum);

// }

// }

// //subarray with the given sum
// public class DSA_practice {
// public static void main(String Args[]) {

// int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23};
// int sum = 23;
// find(arr,sum);
// }

// static void find(int[] arr, int sum) {

// for (int i = 0; i < arr.length; i++) {
// int currsum = arr[i];
// if (currsum == sum) {
// System.out.println("Sum found at index: " + i);
// }
// if (currsum < sum) {
// for (int j = i + 1; j < arr.length; j++) {
// currsum = currsum + arr[j];
// if (currsum == sum) {
// System.out.println("Sum found between indexes: "+ i + " and "+j);
// }
// }
// }

// }
// }
// }

// Finding common elements from 3 arrays

// public class DSA_practice{
// public static void main(String Args[]) {

// int arr[] = { 1, 2, 3, 4,};
// int arr2[] = { 1, 2, 3, 5, 6, 7, 8, 9 };
// int arr3[] = { 1, 2,3, 12, 143, 14, 16, 17, 17, 18 };
// findcommon(arr, arr2,arr3);
// }

// static void findcommon(int arr[], int arr2[], int arr3[]) {
// for (int i = 0; i < arr.length; i++) {
// for (int j = 0; j < arr2.length; j++) {
// for (int j2 = 0; j2 < arr3.length; j2++) {
// if (arr[i] == arr2[j] && arr[i] == arr3[j2]) {
// System.out.print(arr[i]+", ");
// }
// }
// }

// }

// }

// }
// other method would be creating a temp_array to store common element from arr
// && arr2 and the temp_array will again be checked with arr3 for common
// elements and the result will be displayed.
// this will involve 4 forloops (for 4 arrays and time and space complexity will
// be higher
// therefore we took the path of 3 forloops and no temp_array thereby reducing
// time and space complexity.

// program to find the longest consecutive subsequence
// import java.util.HashSet;
// import java.util.Set;

// public class DSA_practice {

// public static void main(String[] args) {
// int[] nums = { 100, 4, 200, 1, 3, 2 };
// System.out.println("Length of the longest consecutive subsequence is: " +
// find(nums));

// }

// static int find(int arr[])
// {
// int longestStreak = 0;

// Set<Integer> set = new HashSet<>();
// for (int i : arr) {
// set.add(i);
// }

// for (int num : set) {
// if (!set.contains(num - 1)) {
// int currStreak = 1;
// int currNum = num;

// while (set.contains(currNum + 1)) {
// currStreak += 1;
// currNum += 1;
// }
// ;
// longestStreak = Math.max(longestStreak, currStreak);
// }
// }
// return longestStreak;
// }
// }

//Median of two sorted arrays of equal size
// Input : arr1[5] = {1, 12, 15, 26, 38}
//              arr2[5] = {2, 13, 17, 30, 45}
// Output : 16
// Explanation : After merging the array will be {1, 2, 12, 13, 15, 17, 26, 30, 38, 45}, middle elements are 15 and 17
// so, median of the given array will be ((15+17)/2)=16.
// public class DSA_practice {
//     public static void main(String Args[]) {
//         int arr[] = { 60,50,40,30,20,10 };
//         int arr2[] = { 70, 80, 90,  110, 120,130 };

//         find(arr, arr2);
//     }

//     static void find(int[] arr, int[] arr2) {

//         int arr3[] = new int[arr.length+arr2.length];
//         //sorting arr:
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[i] > arr[j]) {
//                     int temp = arr[i];
//                     arr[i] = arr[j];
//                     arr[j] = temp;
//                 }
//             }
//         }
// //sorting second array:
//         for (int i = 0; i < arr2.length; i++) {
//             for (int j = i + 1; j < arr2.length; j++) {
//                 if (arr2[i] > arr2[j]) {
//                     int temp = arr2[i];
//                     arr2[i] = arr2[j];
//                     arr2[j] = temp;
//                 }
//             }
//         }
//         int pos = 0;
//         //merging two arrays:
//         for (int i : arr) {
//             arr3[pos] = i;
//             pos++;
//         }
//         for (int i : arr2) {
//             arr3[pos] = i;
//             pos++;
//         }
//         int median = (arr3.length/2);
//         if (arr3.length % 2 == 0) {
//             median = (arr3[arr3.length / 2 - 1] + arr3[arr3.length / 2]) / 2;

//         } else {
//             median = arr3[arr3.length / 2];
//         }

// System.out.println(median);
// System.out.println(arr3.length);
// for (int i = 0; i < arr3.length; i++) {
//     System.out.print(arr3[i]+", ");
// }

//     }
// }

//Matrices
//2D ARRAYS
// public class DSA_practice{

//     public static void main(String Args[]){ 
//         int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.print(arr[i][j]);
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
// } 

// }
//output:
// 1 2 3
// 4 5 6

//largest element in the matrix
// public class DSA_practice {
//     public static void main(String Args[]) {

//         int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };
//         int max = 0;
//         for (int i = 0; i < arr.length; i++) {
//             max = arr[0][0];
//             for (int j = 0; j < arr[i].length; j++) {
//                 if (arr[i][j] > max) {
//                     max = arr[i][j];
//                 }
//             }
//         }
//         System.out.println(max);
//     }

// }

//largest element in every row:
// import java.util.Arrays;

// public class DSA_practice {
//     public static void main(String Args[]) {
//         int[][] arr = { { 1, 2, 3 }, { 4, 5, 6,9 } };
//         int maxelements[]=new int[arr.length];

//         for (int i = 0; i < arr.length; i++) {
//             int max = 0;
//             for (int j = 0; j < arr[i].length; j++) {
//                 if (max < arr[i][j]) {
//                     max = arr[i][j];
//                 }

//             }
//             maxelements[i] = max;
//         }
//         System.out.println(Arrays.toString(maxelements));
//     }
// }

// public class DSA_practice {

//     public static void main(String Args[]) {
//         int arr[][] = { { 5, 4, 7 },
//                 { 1, 3, 8 },
//                 { 2, 9, 6 } };
//         sort(arr);
//     }

//     static void sort(int[][] arr) {

//         // temporary
//         int temp[] = new int[arr.length * arr[0].length];
//         // copying the elements from matrix into temp array:
//         int k = 0;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 temp[k++] = arr[i][j];
//             }
//         }

//         //sorting the temp array 
//         for (int i = 0; i < temp.length; i++) {
//             for (int j = i + 1; j < temp.length; j++) {
//                 if (temp[i] > temp[j]) {
//                     // temp=a
//                     // a = b;
//                     // b=temp;  
//                     int temp_var = temp[i];
//                     temp[i] = temp[j];
//                     temp[j] = temp_var;
//                 }
//             }
//         }
//         //placing the sorted elements in matrix
//         k = 0;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[0].length; j++) {
//                 arr[i][j] = temp[k++];
//             }
//         }
// //printing the matrix
//         for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//              System.out.print(arr[i][j]+", ");
//            }
//         }

// // for (int i = 0; i < temp.length; i++) {
// //     System.out.print(temp[i]+" ");
// // }
//     }

// }

//Finding row with maximum numbner of 1s
// public class DSA_practice {
//     public static void main(String Args[]) {
// int arr[][]={{1,1,1,2,1,1},
//              {1,1,1,1,2,7},
//              {5,3,6,2,9,8},
// };
// int max = 0;
// int max_row = 0;
// for (int i = 0; i < arr.length; i++) {
//     int count = 0;
//     for (int j = 0; j < arr[0].length; j++) {
//         if (arr[i][j] == 1) {
//             count = count + 1;
//             if (max < count) {
//                 max = count;
//                 max_row = i;
//             }
//         }
//     }

// }
// System.out.println("Max row= "+ (max_row+1));

//     }

// }

//common element in all rows of a given matrix

// import java.util.Map;
// import java.util.HashMap;

// public class DSA_practice {
//     public static void main(String Args[]) {
//         int arr[][] = { { 1, 2, 3 },
//                 { 2, 3, 6 },
//                 { 2, 3, 9 },
//         };
//         find(arr);
//     }

//     static void find(int arr[][]) {
//         Map<Integer,Integer> map = new HashMap<Integer,Integer>();

//         int count = 1;
//         int maxnum = 0;
//         for (int j = 0; j < arr[0].length; j++) {
//             map.put(arr[0][j], count);
//         }
//         for (int i = 1; i < arr.length; i++) {
//             for (int j = 0; j < arr[1].length; j++) {
//                 if (map.get(arr[i][j]) != null && map.get(arr[i][j]) == i) {
//                     map.put(arr[i][j], i + 1);
//                     if (i == arr.length - 1)
//                         System.out.print(arr[i][j] + " ");
//                 }

//                 }

//             }

//     }

// }

public class DSA_practice {
    public static void main(String Args[]) {

    }
 }
