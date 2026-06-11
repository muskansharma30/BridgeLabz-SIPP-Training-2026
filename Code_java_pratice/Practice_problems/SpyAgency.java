//A spy agency encodes messages. Reverse a secret message, check if
//it is a palindrome, count vowels/consonants, and verify if two
//intercepts are anagrams. Extend: find the first non-repeating
//character in a surveillance log.

package Practice_problems;
import java.util.*;

public class SpyAgency {

    // Reverse String
    static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Palindrome Check
    static boolean isPalindrome(String str) {
        String rev = reverse(str);
        return str.equalsIgnoreCase(rev);
    }

    // Count Vowels and Consonants
    static void countVowelsConsonants(String str) {
        int vowels = 0, consonants = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
    }

    // Anagram Check
    static boolean isAnagram(String s1, String s2) {
        char[] a1 = s1.toLowerCase().replace(" ", "").toCharArray();
        char[] a2 = s2.toLowerCase().replace(" ", "").toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals(a1, a2);
    }

    // First Non-Repeating Character
    static char firstNonRepeating(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1)
                return ch;
        }

        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Secret Message: ");
        String message = sc.nextLine();

        // Reverse
        System.out.println("Reversed Message: " + reverse(message));

        // Palindrome
        System.out.println("Palindrome? " + isPalindrome(message));

        // Vowels & Consonants
        countVowelsConsonants(message);

        // Anagram Check
        System.out.print("Enter First Intercept: ");
        String s1 = sc.nextLine();

        System.out.print("Enter Second Intercept: ");
        String s2 = sc.nextLine();

        System.out.println("Anagram? " + isAnagram(s1, s2));

        // First Non-Repeating Character
        char result = firstNonRepeating(message);

        if (result != '\0')
            System.out.println("First Non-Repeating Character: " + result);
        else
            System.out.println("No Non-Repeating Character Found");

        sc.close();
    }
}
