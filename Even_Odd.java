import java.util.Scanner;

class Even_Odd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number :");
        int f=sc.nextInt();
        // even odd
        String val=(f%2==0)?"even":"odd";
        System.out.println(val);
// pass fail
        String marks=(f<35)?"Fail":"Pass";
        System.out.println(marks);
// greater 
        int b,c;
        b=10;c=5;
        String num=(b>=c)?"A is Greater":"B Is Greater";
        System.out.println(num);


    }
}

// class Even_Odd
// {
//     public static void main(String args[])
//     {
//         int a = 5;
//         String val = (a % 2 == 0) ? "even" : "odd";
//         System.out.println(val);
//     }
// }



