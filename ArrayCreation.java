import java.util.*;
public class ArrayCreation 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int marks[]=new int[100];
        int phy=sc.nextInt();
        int chem=sc.nextInt();
        int math=sc.nextInt();
    System.out.println("Output :");
        marks[0]=phy;
        marks[1]=chem;
        marks[2]=math;

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        


    }
}
