/**
 * OOPS Banner App - Use Case 7
 *
 * @author Ishita Singh
 * @version 7.0
 */
public class OOPSBannerApp {

    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap o = new CharacterPatternMap('O', new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        });

        CharacterPatternMap p = new CharacterPatternMap('P', new String[]{
            "***** ",
            "*    *",
            "*    *",
            "***** ",
            "*     ",
            "*     ",
            "*     "
        });

        CharacterPatternMap s = new CharacterPatternMap('S', new String[]{
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        });

        CharacterPatternMap[] characters = {o, p, p, s};

        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (CharacterPatternMap character : characters) {
                line.append(character.getPattern()[row]);
                line.append("  ");
            }

            System.out.println(line);
        }
    }
}