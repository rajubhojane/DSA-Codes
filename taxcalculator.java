import java.util.*;

public class taxcalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount :");
        int a = sc.nextInt();
        
        if(a < 50000) {
            System.out.println("Zero % Tax :");
            System.out.println("Total Amount Is : " + a);
        } else if(a >= 50000 && a < 1000000) {
            System.out.println("Calculate 20% Tax");
            double tax = a * 0.20;
            System.out.println("Tax Amount: " + tax);
            System.out.println("Total Amount Is : " + (a + tax));
        } else {
            System.out.println("Calculate 30% Tax");
            double tax = a * 0.30;
            System.out.println("Tax Amount: " + tax);
            System.out.println("Total Amount Is : " + (a + tax));
        }
        
        sc.close();
    }
}
