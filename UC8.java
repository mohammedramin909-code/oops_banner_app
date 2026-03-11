import java.util.HashMap;
import java.util.Map;

public class UC8 {

    public static void main(String[] args) {

        System.out.println("OOPS Banner App - UC8: Use Map for Character Patterns\n");

        // Step 1: Create a Map to store character patterns
        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', getOPattern());
        patternMap.put('P', getPPattern());
        patternMap.put('S', getSPattern());

        // Step 2: Word to display
        String word = "OOPS";

        // Step 3: Render banner using nested loops
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] pattern = patternMap.get(ch);
                line.append(pattern[i]);
            }

            System.out.println(line.toString());
        }
    }

    // O Pattern
    public static String[] getOPattern() {
        return new String[]{
                " *****  ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                " *****  "
        };
    }

    // P Pattern
    public static String[] getPPattern() {
        return new String[]{
                " *****  ",
                "*     * ",
                "*     * ",
                " *****  ",
                "*       ",
                "*       ",
                "*       "
        };
    }

    // S Pattern
    public static String[] getSPattern() {
        return new String[]{
                " *****  ",
                "*       ",
                "*       ",
                " *****  ",
                "      * ",
                "      * ",
                " *****  "
        };
    }
}