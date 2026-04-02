import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n========== WEEK 6 PROGRAMS ==========");
            System.out.println("1. Problem 1: Text Reversal");
            System.out.println("2. Problem 2: Multiple Inheritance with Interfaces");
            System.out.println("3. Problem 3: Lexicographical Sorting");
            System.out.println("4. Problem 4: Shape Management");
            System.out.println("0. Exit Program");

            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("\nRunning Program 1...");
                    P1_TextReversal.main(null);
                    break;

                case 2:
                    System.out.println("\nRunning Program 2...");
                    P2_Interface.main(null);
                    break;

                case 3:
                    System.out.println("\nRunning Program 3...");
                    P3_LexicographicalSorting.main(null);
                    break;

                case 4:
                    System.out.println("\nRunning Program 4...");
                    P4_ShapeManagement.main(null);
                    break;

                case 0:
                    System.out.println("\nExiting...");
                    break;

                default:
                    System.out.println("\nInvalid choice entered");
            }
        } while (choice != 0);

        sc.close();
    }
}