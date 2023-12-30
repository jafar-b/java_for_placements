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



