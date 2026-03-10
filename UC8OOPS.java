import java.util.HashMap;
import java.util.Map;

public class OOPSBannerUC8 {

    // HashMap to store character patterns
    private static Map<Character, String[]> characterPatterns = new HashMap<>();

    public static void main(String[] args) {

        // Step 1: Initialize patterns
        initializePatterns();

        // Step 2: Render Banner Word
        renderBanner("OOPS");
    }

    // Method to store patterns in HashMap
    private static void initializePatterns() {

        characterPatterns.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        characterPatterns.put('P', new String[]{
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      "
        });

        characterPatterns.put('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        });
    }

    // Method to render banner using nested loops
    private static void renderBanner(String word) {

        word = word.toUpperCase();

        int patternHeight = 5; // Number of rows in each letter

        for (int row = 0; row < patternHeight; row++) {

            for (int i = 0; i < word.length(); i++) {

                char currentChar = word.charAt(i);

                String[] pattern = characterPatterns.get(currentChar);

                if (pattern != null) {
                    System.out.print(pattern[row] + "  ");
                } else {
                    System.out.print("       ");
                }
            }

            System.out.println();
        }
    }
}