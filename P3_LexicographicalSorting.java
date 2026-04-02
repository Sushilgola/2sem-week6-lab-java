
/**
 * Problem 3: Lexicographical Sorting
 * You are working on a module for a text analysis tool that reads three 
 * strings and sorts them lexicographically.
 */

import java.util.Scanner;

public class P3_LexicographicalSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of strings
        System.out.print("How many strings do you want to enter? ");
        int n = sc.nextInt();
        sc.nextLine();

        // Declare array of strings to store the strings
        String[] arrStrings = new String[n];

        // Input each string in the array
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            arrStrings[i] = sc.nextLine();
        }

        // Use bubble sort to sort the strings
        for (int i = 0; i < arrStrings.length - 1; i++) {
            for (int j = 0; j < arrStrings.length - i - 1; j++) {
                if (isGreater(arrStrings[j], arrStrings[j + 1])) {
                    String temp = arrStrings[j];
                    arrStrings[j] = arrStrings[j + 1];
                    arrStrings[j + 1] = temp;
                }
            }
        }

        // Print the output
        System.out.print("Sorted strings: ");
        for (int i = 0; i < arrStrings.length; i++) {
            System.out.print(arrStrings[i]);
            if (i < arrStrings.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        // sc.close();
    }

    // Method to compare two string lexicographically
    // If str1 comes after str2, return true
    // Else return false
    public static boolean isGreater(String str1, String str2) {
        int length = (str1.length() < str2.length()) ? str1.length() : str2.length();

        for (int i = 0; i < length; i++) {
            if (str1.charAt(i) > str2.charAt(i)) {
                return true;
            } else if (str1.charAt(i) < str2.charAt(i)) {
                return false;
            }
        }

        return str1.length() > str2.length();
    }
}