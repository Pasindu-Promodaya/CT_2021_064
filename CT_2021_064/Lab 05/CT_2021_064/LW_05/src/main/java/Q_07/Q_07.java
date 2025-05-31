package Q_07;
import java.util.Scanner;

public class Q_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the word to be replaced: ");
        String wordToReplace = scanner.nextLine();

        System.out.print("Enter the replacement word: ");
        String replacement = scanner.nextLine();

        String modifiedSentence = sentence.replaceAll("\\b" + wordToReplace + "\\b", replacement);
        System.out.println("Modified sentence: " + modifiedSentence);
    }
}
