import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class WordGuess {
  public static void main(String[] args) {
    final String SECRET_WORD = createSecretWord().toLowerCase();

    Scanner scanner = new Scanner(System.in);
    System.out.println("Java WordGuess");
    System.out.print("Key in one character or your guess word: ");
    String input = scanner.next();

    boolean[] checkChar = new boolean[SECRET_WORD.length()];
    int numCharCorrect = 0;
    int numTrials = 1;

    while (!input.equals(SECRET_WORD)) {
      if (input.length() == 1) {
        for (int idx = 0; idx < SECRET_WORD.length(); idx++) {
          if (SECRET_WORD.charAt(idx) == input.charAt(0) && !checkChar[idx]) {
            numCharCorrect++;
            checkChar[idx] = true;
          }
        }
      }

      System.out.print("Trial " + numTrials + ": ");
      for (int idx = 0; idx < SECRET_WORD.length(); idx++) {
        if (checkChar[idx]) {
          System.out.print(SECRET_WORD.charAt(idx));
        } else {
          System.out.print("_");
        }
      }
      System.out.println();

      if (numCharCorrect == SECRET_WORD.length()) break;

      System.out.print("Key in one character or your guess word: ");
      input = scanner.next();
      numTrials++;
    }
    scanner.close();

    System.out.println("Congratulation!");
    System.out.println("You got in " + numTrials + " trials");
  }

  public static String createSecretWord() {
    File file = new File("./word.txt");
    try {
      Scanner scanner = new Scanner(file);
      // create list word from file
      String[] wordArray = scanner.nextLine().split(" ");

      // choose random word
      String word = wordArray[(int) (Math.random() * wordArray.length)];

      // delete special character
      word = word.replaceAll("([^a-zA-Z_0-9]+$)|(^[^a-zA-Z_0-9]+)", "");
      scanner.close();
      return word;
    }catch (IOException e) {
      e.printStackTrace();
      return "";
    }
  }
}
