import java.util.*;
public class palindrome{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Wnter Any Num : ");
     int a=sc.nextInt();
     int b=a;
     int rev=0;
     while(a!=0)
     {
         rev=rev*10+a%10;
        a=a/10;

     }
     System.out.println(rev);

     if(rev==b)
     {
        System.out.println("It is Palindrome");
     }
     else
     {
        System.out.println("It is not Palindrome");
     }
    }
}