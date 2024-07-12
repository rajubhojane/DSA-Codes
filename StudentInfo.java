import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

    
        String[] names = new String[n];
        int[] rollNumbers = new int[n];

        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            names[i] = scanner.nextLine();

            System.out.print("Enter the roll number of student " + (i + 1) + ": ");
            rollNumbers[i] = scanner.nextInt();
            scanner.nextLine(); 
        }

        
        System.out.println("\nStudent Information:");
        System.out.println("Student Name             Student Roll   ");

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ": Name = " + names[i] + ", Roll Number = " + rollNumbers[i]);
        }

        
        scanner.close();
    }
}
