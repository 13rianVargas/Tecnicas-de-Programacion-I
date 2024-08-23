import java.util.Scanner;

public class ContadorPalabras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String[] words = input.split("\\s+");
        int maxCount = 0;
        String mostFrequentWord = "";

        for (String word1 : words) {
            int count = 0;
            for (String word2 : words) {
                if (word1.equals(word2)) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mostFrequentWord = word1;
            }
        }
        System.out.println(mostFrequentWord + ": " + maxCount);
    }
}