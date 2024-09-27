import java.util.Scanner;

public class CommonAlphabetsCounter {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first string: ");
    String str1 = scanner.nextLine().toLowerCase();

    System.out.print("Enter the second string: ");
    String str2 = scanner.nextLine().toLowerCase();

    int[] freq1 = new int[26]; // Array to store frequency of each alphabet in the first string
    int[] freq2 = new int[26]; // Array to store frequency of each alphabet in the second string

    // Count frequency of each alphabet in the first string
    for (char ch : str1.toCharArray()) {
      if (Character.isAlphabetic(ch)) {
        freq1[ch - 'a']++;
      }
    }

    // Count frequency of each alphabet in the second string
    for (char ch : str2.toCharArray()) {
      if (Character.isAlphabetic(ch)) {
        freq2[ch - 'a']++;
      }
    }

    // Count common alphabets and print the result
    int commonCount = 0;
    for (int i = 0; i < 26; i++) {
      if (freq1[i] > 0 && freq2[i] > 0) {
         System.out.println((char) (i + 'a') + ": " + Math.min(freq1[i], freq2[i]) + " occurrences");
        commonCount++;
      }
    }

    if (commonCount == 0) {
      System.out.println("No common alphabets found.");
    } else System.out.println("Number of common alphabets: " + commonCount);

    scanner.close();
  }
}
