package librarymanagement;

/*
 * Library management contains 8 menu options/functions
 * that will allow users to check book inventory, cd inventory, and members.
 * It will also allow users to add books, CDs, and members to the system.
 * Though option 7 still need more work, it more or less simulate whether a member has fees due
 * and if they do, then user can force payment if possible.
 * Option 7 works by randomly generating dates, which determines the fee amount. Note: this area is not functioning well for some reason.
 */

/**
 *
 * @author samph
 */
public class Start {

    /**
     * allows Library Management class to execute its code
     *
     * @param args
     */
    public static void main(String[] args) {
        LibraryManagement zero = new LibraryManagement();
    }
}
