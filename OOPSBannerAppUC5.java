public class OOPSBannerAppUC5 {

    public static void main(String[] args) {

        // Step 1: Declare + initialize array in one statement
        String[] lines = {

                String.join(" ", "  ***  ", "  ***  ", " ***** ", " ***** "),
                String.join(" ", " *   * ", " *   * ", " *   * ", " *     "),
                String.join(" ", "*     *", "*     *", " *   * ", " *     "),
                String.join(" ", "*     *", "*     *", " ***** ", " ***** "),
                String.join(" ", "*     *", "*     *", " *     ", "     * "),
                String.join(" ", " *   * ", " *   * ", " *     ", "     * "),
                String.join(" ", "  ***  ", "  ***  ", " *     ", " ***** ")

        };

        // Step 2: Print using for-each loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}