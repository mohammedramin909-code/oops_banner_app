public class UC3 {

    public static void main(String[] args) {

        // Each println builds one row of the banner
        // Letters: O  O  P  S

        System.out.println(String.join(" ",
                "  *  ",  // O
                "  *  ",  // O
                " * ",  // P
                " * "   // S
        ));

        System.out.println(String.join(" ",
                " *   * ", 
                " *   * ", 
                " *   * ", 
                " **      "
        ));

        System.out.println(String.join(" ",
                " *   * ",
                " *   * ",
                " *  ",
                " *  "
        ));

        System.out.println(String.join(" ",
                " *   * ",
                " *   * ",
                " **      ",
                "      ** "
        ));

        System.out.println(String.join(" ",
                " *   * ",
                " *   * ",
                " **      ",
                "      ** "
        ));

        System.out.println(String.join(" ",
                "  *  ",
                "  *  ",
                " **     ",
                " **    "
        ));

        System.out.println(String.join(" ",
                "        ",
                "        ",
                "        ",
                " *  "
        ));
    }
}