import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        // If lengths are different, they cannot be anagrams
        if (a.length() != b.length()) {
            return false;
        }

        // Convert both strings to lowercase to make the comparison case-insensitive
        a = a.toLowerCase();
        b = b.toLowerCase();

        // Create an array to count the frequency of each character
        int[] charCount = new int[26]; // Assuming the strings contain only English letters

        // Count characters in the first string
        for (char c : a.toCharArray()) {
            charCount[c - 'a']++;
        }

        // Subtract the count for characters in the second string
        for (char c : b.toCharArray()) {
            charCount[c - 'a']--;
        }

        // Check if all counts are zero
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String b = scanner.nextLine();

        scanner.close();

        boolean result = isAnagram(a, b);
        System.out.println(result ? "Anagrams" : "Not Anagrams");
    }
}