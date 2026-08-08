/**
 * OOPS Banner App - Use Case 6
 *
 * @author Ishita Singh
 * @version 6.0
 */
public class OOPSBannerApp {

    static String[] getOPattern() {
        return new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    static String[] getPPattern() {
        return new String[]{
            "***** ",
            "*    *",
            "*    *",
            "***** ",
            "*     ",
            "*     ",
            "*     "
        };
    }

    static String[] getSPattern() {
        return new String[]{
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        };
    }

    public static void main(String[] args) {

        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        String[] banner = {
            String.join("  ", o[0], p[0], p[0], s[0]),
            String.join("  ", o[1], p[1], p[1], s[1]),
            String.join("  ", o[2], p[2], p[2], s[2]),
            String.join("  ", o[3], p[3], p[3], s[3]),
            String.join("  ", o[4], p[4], p[4], s[4]),
            String.join("  ", o[5], p[5], p[5], s[5]),
            String.join("  ", o[6], p[6], p[6], s[6])
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}