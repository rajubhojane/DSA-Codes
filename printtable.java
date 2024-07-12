import java.util.Scanner;

public class printtable {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        int a=sc.nextInt();
        System.out.println("Table Of Any Number : ");
        for(int i=1;i<=10;i++)
        {
            System.out.println(i+ " * " + a +" = " +i*a);
        }
    }
    
}
