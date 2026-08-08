import java.util.HashMap;
import java.util.Map;

/**
 * OOPS Banner App - Use Case 8
 *
 * @author Ishita Singh
 * @version 8.0
 */
public class OOPSBannerApp {

    public static void renderBanner(String word,
                                    Map<Character, String[]> patterns) {

        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] pattern = patterns.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]);
                    line.append("  ");
                }
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patterns = new HashMap<>();

        patterns.put('O', new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        });

        patterns.put('P', new String[]{
            "***** ",
            "*    *",
            "*    *",
            "***** ",
            "*     ",
            "*     ",
            "*     "
        });

        patterns.put('S', new String[]{
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        });

        renderBanner("OOPS", patterns);
    }
}