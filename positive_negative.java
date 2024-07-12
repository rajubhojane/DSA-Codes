import java.util.Scanner;

public class positive_negative {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number :");
        int a=sc.nextInt();
        if(a<0)
        {
            System.out.println("Enterd Num Is Negative");
        }else{
            System.out.println("Entered Num is Positive");
        }

    }
    
}
