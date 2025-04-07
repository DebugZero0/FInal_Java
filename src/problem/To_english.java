//wap to take input and give output in English words 
package problem;

import java.util.Scanner;

public class To_english {

    // Array for numbers less than 20
    private static final String[] belowTwenty = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", 
                                                  "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", 
                                                  "Eighteen", "Nineteen"};

    // Array for tens multiples
    private static final String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    // Array for the large number names
    private static final String[] thousands = {"", "Thousand", "Million", "Billion"};

    // Method to convert the number into words
    private static String convert(int number) {
        if (number == 0) return "Zero";
        
        int i = 0;
        String words = ""; 

        while (number > 0) {
            if (number % 1000 != 0) {
                words = helper(number % 1000) + thousands[i] + " " + words;
            }
            number /= 1000;
            i++;
        }

        return words.trim();
    }

    // Helper method to handle numbers less than 1000
    private static String helper(int number) {
        if (number == 0) {
            return ""; 
        } else if (number < 20) {
            return belowTwenty[number] + " ";
        } else if (number < 100) {
            return tens[number / 10] + " " + helper(number % 10);
        } else {
            return belowTwenty[number / 100] + " Hundred " + helper(number % 100);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Number in words: " + convert(number));
    }
}



