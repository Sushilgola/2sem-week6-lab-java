/**
 * Problem 1: Text Reversal
 * You are working on a text processing module for a language learning application.
 * The module should read a sentence from the user and print it out with each word
 * reversed, but with the words and punctuation in the original order.
 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class P1_TextReversal {
    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Declare an ArrayList to store each word
        List<String> words = new ArrayList<>();

        // Loop throug the sentence and store each word in the ArrayList
        StringBuilder individualWord = new StringBuilder();

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) != ' ') {
                individualWord.append(sentence.charAt(i));
            } else {
                words.add(individualWord.toString());
                individualWord = new StringBuilder();
            }
        }

        // Add the last stored word to the ArrayList
        words.add(individualWord.toString());

        // Now call the reverse string function to reverse each
        // word in the ArrayList and print
        System.out.print("Reversed: ");
        for (int i = 0; i < words.size(); i++) {
            System.out.print(reverseString(words.get(i)));
            if (i < words.size() - 1) {
                System.out.print(" ");
            }
        }

        System.out.println();

        // sc.close();
    }

    // Method to reverse a string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }
}
