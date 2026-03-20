/**
 * Name: Charles Henry M. Tinoy Jr.
 * Course, Year and Section: BSIT - 1 - Non-blocked
 */
public class FormLetterWriter {
    private enum Courtesy { MR, MS, DR, PROF, ENGR }

    /**
     * Takes the lastname then display the output
     * @param lastName (String)
     */
    private static void displaySalutation(String lastName) {
        System.out.println(String.format(
                "Dear Mr./Ms. %s,\nThank you for your recent order.\n",
                lastName
        ));
    }

    /**
     * Takes lastName and Courtesy then display the output
     * @param lastName
     * @param courtesy
     */
    private static void displaySalutation(String lastName, Courtesy courtesy) {
        String title = "Mr.";

        switch (courtesy) {
            case Courtesy.MR -> title = "Mr.";
            case Courtesy.MS -> title = "Ms.";
            case Courtesy.DR -> title = "Dr.";
            case Courtesy.PROF -> title = "Prof.";
            case Courtesy.ENGR -> title = "Engr.";
        }

        System.out.println(String.format(
                "Dear %s %s,\nThank you for your recent order.\n",
                title, lastName
        ));
    }

    /**
     * Takes firstName and lastName then display the output
     * @param firstName
     * @param lastName
     */
    private static void displaySalutation(String firstName, String lastName) {
        System.out.println(String.format(
                "Dear %s %s,\nThank you for your recent order.\n",
                firstName, lastName
        ));
    }

    public static void main(String[] args) {
        displaySalutation("Tinoy");
        displaySalutation("Alegado", Courtesy.DR);
        displaySalutation("Charles Henry", "Tinoy");
    }
}
