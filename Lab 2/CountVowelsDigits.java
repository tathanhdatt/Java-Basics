import java.util.Scanner;

public class CountVowelsDigits {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String inStr = scanner.next().toLowerCase();
    scanner.close();

    int inStrLen = inStr.length();
    int numDigits = 0;
    int numVowels = 0;

    for (int charIdx = 0; charIdx < inStrLen; charIdx++) {
      if(inStr.charAt(charIdx) >= '0' && inStr.charAt(charIdx) <= '9') {
        numDigits++;
      }
      if (
              inStr.charAt(charIdx) == 'e' ||
              inStr.charAt(charIdx) == 'u' ||
              inStr.charAt(charIdx) == 'o' ||
              inStr.charAt(charIdx) == 'a' ||
              inStr.charAt(charIdx) == 'i'
      ) {
        numVowels++;
      }
    }
    double perOfVowels = (double)numVowels / inStrLen * 100.0;
    double perOfDigits = (double)numDigits / inStrLen * 100.0;

    System.out.printf("Number of vowels: %d (%.2f%%)\n", numVowels, perOfVowels);
    System.out.printf("Number of digits: %d (%.2f%%)", numDigits, perOfDigits);
  }
}
