import java.util.Scanner;

public class SwitchCase {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        // switch(a)
        // {
        //     case 1:
        //     System.out.println("Samosa");
        //     break;
        //     case 2:
        //     System.out.println("Mango");
        //     break;
        //     case 3:
        //     System.out.println("Apple");
        //     break;
        //     default:
        //     System.out.println("Select Option");

        // }

        switch (a) {
            case 1:
            System.out.println("Mon");
            break;
            case 2:
            System.out.println("Tues");
            break;
            case 3:
            System.out.println("Thus");
            break;
            case 4:
            System.out.println("Wedn");
            break;
            case 5:
            System.out.println("Fri");
            break;
            case 6:
            System.out.println("Sat");
            break;
            case 7:
            System.out.println("Sun");
            break;
            default:
            System.out.println("To Check Weeks Days Entered Between 1 To 7");
                break;
        }
    }
    
}
