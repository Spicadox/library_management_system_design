package librarymanagement;

/*
 * Library management contains 8 menu options/functions
 * that will allow users to check book inventory, cd inventory, and members.
 * It will also allow users to add books, CDs, and members to the system.
 * Though option 7 still need more work, it more or less simulate whether a member has fees due
 * and if they do, then user can force payment if possible.
 * Option 7 works by randomly generating dates, which determines the fee amount. Note: this area is not functioning well for some reason.
 */
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author samph
 */
public class LibraryManagement {

    private ArrayList<Books> books = new ArrayList<Books>();
    private ArrayList<CDs> CDs = new ArrayList<CDs>();
    private ArrayList<Member> members = new ArrayList<Member>();

    /**
     * Class where everything executes and come together
     */
    public LibraryManagement() {
        // create all the books,cds, and members
        initialize();

        // lets user type
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the library management system!" + " Please choose one of the options below: ");
            System.out.println("1: Check Book Inventory");
            System.out.println("2: Check CDs Inventory");
            System.out.println("3: Check Members");
            System.out.println("4: Add Books");
            System.out.println("5: Add CDs");
            System.out.println("6: Add Members");

            // this will check whether member has paid fee in time if person is a premium member and gives option to force payment unless payment method is cash
            System.out.println("7: Search Member Information");

            System.out.println("8: Exit");

            boolean hasNumber = false;
            int i = 0;
            while (hasNumber == false) {
                if (sc.hasNext()) {
                    try {
                        i = sc.nextInt();
                        hasNumber = true;
                        sc.nextLine();
                    } catch (Exception e) {
                        System.out.println("You must enter a number from 1-4. Please try an again.");
                    }
                }
            }
            System.out.println("You entered: " + i);

            // 8 items to choose from in menu
            switch (i) {

                case 1:
                    checkBookInventory();

                    break;
                case 2:
                    checkCDsInventory();

                    break;

                case 3:
                    checkMembersList();

                    break;
                case 4:
                    System.out.println("1. Add Books");
                    System.out.println("2. Return to Menu");
                    hasNumber = false;
                    i = 0;
                    while (hasNumber == false) {
                        if (sc.hasNext()) {
                            try {
                                i = sc.nextInt();
                                hasNumber = true;
                                sc.nextLine();
                            } catch (Exception e) {
                                System.out.println("You must enter a number from 1-2. Please try an again.");
                            }
                        }
                    }
                    System.out.println("You entered: " + i);
                    switch (i) {
                        case 1:
                            try {
                                System.out.println("Please enter name of the book: ");
                                String newUserBook = sc.nextLine();

                                System.out.println("Please enter the price: ");
                                System.out.print("$");

                                String newUserPriceString = sc.nextLine();
                                double newUserPrice = Double.parseDouble(newUserPriceString);

                                System.out.println("Please enter the number of copies of the book: ");
                                String newUserStockString = sc.nextLine();
                                int newUserStock = Integer.parseInt(newUserStockString);

                                Books newBook = new Books(newUserBook, newUserPrice, newUserStock);
                                books.add(newBook);
                            } catch (NumberFormatException n) {
                                System.out.println("Error: Please use just numbers for price and number of copies.");
                            }
                            System.out.println("");
                            System.out.println("Changes have been made, would you like to return to menu or exit?");
                            System.out.println("1: Return to Main Menu");
                            System.out.println("2: Exit Program");
                            hasNumber = false;
                            i = 0;
                            while (hasNumber == false) {
                                if (sc.hasNext()) {
                                    try {
                                        i = sc.nextInt();
                                        hasNumber = true;
                                        sc.nextLine();
                                    } catch (Exception e) {
                                        System.out.println("You must enter a number from 1-2. Please try an again.");
                                    }
                                }
                            }
                            switch (i) {
                                case 1:
                                    break;
                                case 2:
                                    return;
                            }
                            break;

                        case 2:
                            break;
                    }
                    break;

                case 5:
                    System.out.println("1. Add CDs");
                    System.out.println("2. Return to Menu");
                    hasNumber = false;
                    i = 0;
                    while (hasNumber == false) {
                        if (sc.hasNext()) {
                            try {
                                i = sc.nextInt();
                                hasNumber = true;
                                sc.nextLine();
                            } catch (Exception e) {
                                System.out.println("You must enter a number from 1-2. Please try an again.");
                            }
                        }
                    }
                    System.out.println("You entered: " + i);
                    switch (i) {
                        case 1:
                            try {
                                System.out.println("Please enter name of the CD: ");
                                String newUserCD = sc.nextLine();

                                System.out.println("Please enter the price: ");
                                System.out.print("$");

                                String newUserPriceString = sc.nextLine();
                                double newUserPrice = Double.parseDouble(newUserPriceString);

                                System.out.println("Please enter the number of copies of the CD: ");
                                String newUserStockString = sc.nextLine();
                                int newUserStock = Integer.parseInt(newUserStockString);

                                CDs newCD = new CDs(newUserCD, newUserPrice, newUserStock);
                                CDs.add(newCD);
                            } catch (NumberFormatException n) {
                                System.out.println("Error: Please use just numbers for price and number of copies.");
                            }
                            System.out.println("");
                            System.out.println("Changes have been made, would you like to return to menu or exit?");
                            System.out.println("1: Return to Main Menu");
                            System.out.println("2: Exit Program");
                            hasNumber = false;
                            i = 0;
                            while (hasNumber == false) {
                                if (sc.hasNext()) {
                                    try {
                                        i = sc.nextInt();
                                        hasNumber = true;
                                        sc.nextLine();
                                    } catch (Exception e) {
                                        System.out.println("You must enter a number from 1-2. Please try an again.");
                                    }
                                }
                            }
                            switch (i) {
                                case 1:
                                    break;
                                case 2:
                                    return;
                            }
                            break;

                        case 2:
                            break;
                    }
                    break;

                case 6:
                    System.out.println("1. Add Members");
                    System.out.println("2. Return to Menu");
                    hasNumber = false;
                    i = 0;
                    while (hasNumber == false) {
                        if (sc.hasNext()) {
                            try {
                                i = sc.nextInt();
                                hasNumber = true;
                                sc.nextLine();
                            } catch (Exception e) {
                                System.out.println("You must enter a number from 1-2. Please try an again.");
                            }
                        }
                    }
                    System.out.println("You entered: " + i);
                    switch (i) {
                        case 1:
                            try {
                                System.out.println("Please enter name of the Member: ");
                                String newMemberName = sc.nextLine();

                                System.out.println("Please enter the membership type(premium or regular): ");
                                String newMemberType = sc.nextLine();

                                System.out.println("Please enter the payment type for the member: ");
                                String newPaymentType = sc.nextLine();

                                System.out.println("Please enter amount the member has spent");
                                System.out.print("$");

                                String newAmountSpentString = sc.nextLine();
                                double newAmountSpent = Double.parseDouble(newAmountSpentString);

                                Member member = new Member(newMemberName, newMemberType, newPaymentType, newAmountSpent);
                                members.add(member);
                            } catch (NumberFormatException n) {
                                System.out.println("Error: Please Retry");
                                break;
                            }
                            System.out.println("");
                            System.out.println("Changes have been made, would you like to return to menu or exit?");
                            System.out.println("1: Return to Main Menu");
                            System.out.println("2: Exit Program");
                            hasNumber = false;
                            i = 0;
                            while (hasNumber == false) {
                                if (sc.hasNext()) {
                                    try {
                                        i = sc.nextInt();
                                        hasNumber = true;
                                        sc.nextLine();
                                    } catch (Exception e) {
                                        System.out.println("You must enter a number from 1-2. Please try an again.");
                                    }
                                }
                            }
                    }
                default:
                    break;

                //Note still need to fix generated fees as getting dates are wonky
                case 7:
                    System.out.println("1: Check if a premium member paid fee on time.");
                    System.out.println("2: Change the amount of money a member has spent.");
                    System.out.println("3: Return to Main Menu");
                    System.out.println("4: Exit");

                    hasNumber = false;
                    i = 0;
                    while (hasNumber == false) {
                        if (sc.hasNext()) {
                            try {
                                i = sc.nextInt();
                                hasNumber = true;
                                sc.nextLine();
                            } catch (Exception e) {
                                System.out.println("You must enter a number from 1-5. Please try an again.");
                            }
                        }
                    }
                    // match input to a member's name and get all of that member's info only if name matches and member is a premium member
                    switch (i) {
                        case 1:
                            System.out.println("Please enter the member's  full name(case sensitive):");
                            String membersNameUser = sc.nextLine();
                            Member newMember = new Member(membersNameUser);
                            for (Member pMember : members) {
                                String membersName = pMember.getMemberName();
                                if (membersNameUser.equals(membersName) && "premium".equals(pMember.getMembershipType())) {
                                    PremiumMember premiumMember = new PremiumMember();
                                    System.out.println("Member's name: " + pMember.getMemberName() + " | Membership type: " + pMember.getMembershipType()
                                            + " | Payment type: " + pMember.getPaymentType() + " | Amount Spent: $" + pMember.getAmountSpent());

//                                    String cDate = premiumMember.getCurrentDate();
//                                    premiumMember.setCurrentDate(cDate);
//                                    String cDate2 = premiumMember.getCurrentDate();
//                                    
//                                    String dDate = premiumMember.getDueDate();
//                                    premiumMember.setDueDate(dDate);
//                                    String dDate2 = premiumMember.getDueDate();
//                                    
//                                    Boolean oTime = premiumMember.isOnTime();
//                                    premiumMember.setIsOnTime(oTime);
//                                    Boolean oTime2 = premiumMember.isOnTime();
                                    System.out.println("Current date: " + premiumMember.getCurrentDate());
                                    System.out.println("Fee due date:" + premiumMember.getDueDate());
                                    System.out.println("Fee paid on time: " + premiumMember.isOnTime());
                                    System.out.println("");

                                    if (premiumMember.isOnTime() == false) {
                                        premiumMember.setFineAmount(0);
                                        System.out.println("Fee was not paid on time. Please choose the options below:");
                                        System.out.println("1. Request and charge member.");
                                        System.out.println("2. Return to menu.");
                                        hasNumber = false;
                                        i = 0;
                                        while (hasNumber == false) {
                                            if (sc.hasNext()) {
                                                try {
                                                    i = sc.nextInt();
                                                    hasNumber = true;
                                                    sc.nextLine();
                                                } catch (Exception e) {
                                                    System.out.println("You must enter a number from 1-2. Please try an again.");
                                                }
                                            }
                                        }
                                    }

                                    // only execute to force payment and it won't if the member's payment method is cash
                                    switch (i) {
                                        case 1:
                                            if (pMember.getPaymentType() != "cash") {
                                                double fee = premiumMember.getFineAmount();
                                                System.out.println("Fee amount: $" + fee);
                                                System.out.println("Members total spending now: $" + (pMember.getAmountSpent() + fee));
                                                pMember.setAmountSpent(pMember.getAmountSpent() + fee);
                                            } else {
                                                System.out.println("Customer payment method is cash, therefore can't execute charge.");
                                                break;
                                            }

                                        case 2:
                                            break;
                                    }
                                }

//                                        else{
//                                            System.out.println("Error: Name not recognize. Returning to main menu. Please try again.");
//                                        }
                            }
                        default:
                            System.out.println("Remember to always check spelling.");
                            System.out.println("");
                            break;
                        // set or change the amount of money member spent    
                        case 2:
                            System.out.println("Please enter the member's full name(case sensitive):");
                            membersNameUser = sc.nextLine();
                            newMember = new Member(membersNameUser);
                            for (Member pMember : members) {
                                String membersName = pMember.getMemberName();
                                if (membersNameUser.equals(membersName)) {
                                    PremiumMember premiumMember = new PremiumMember();
                                    System.out.println("Member's name: " + pMember.getMemberName() + " | Membership type: " + pMember.getMembershipType()
                                            + " | Payment type: " + pMember.getPaymentType() + " | Amount Spent: $" + pMember.getAmountSpent());

                                    System.out.println("Please type the value to change amount: ");
                                    System.out.print("$");
                                    String amountToSpend = sc.nextLine();
                                    Double amountSpend = Double.parseDouble(amountToSpend);
                                    pMember.setAmountSpent(amountSpend);
                                    System.out.println("Done, current user info: ");
                                    System.out.println("Member's name: " + pMember.getMemberName() + " | Membership type: " + pMember.getMembershipType()
                                            + " | Payment type: " + pMember.getPaymentType() + " | Amount Spent: $" + pMember.getAmountSpent());
                                    System.out.println("");
                                }
                            }

                        case 3:
                            break;
                        case 4:
                            return;
                    }

                    break;
                case 8:
                    return;
            }

        }
    }

    /**
     * Add books to the books array
     *
     * @param books
     */
    public void addBooks(Books books) {
        this.books.add(books);
    }

    /**
     * Add CDs to the CD's array
     *
     * @param CDs
     */
    public void addCDs(CDs CDs) {
        this.CDs.add(CDs);
    }

    /**
     * Add members to the members array
     *
     * @param members
     */
    public void addMembers(Member members) {
        this.members.add(members);
    }

    /**
     * Add books, CDs, and members
     */
    public void initialize() {
        Books bookAdder1 = new Books("Eragon", 9.12, 1175);
        books.add(bookAdder1);
        Books bookAdder2 = new Books("Eldest", 9.12, 1123);
        books.add(bookAdder2);
        Books bookAdder3 = new Books("Brisingr", 9.12, 1162);
        books.add(bookAdder3);
        Books bookAdder4 = new Books("Inheritance", 12.00, 1135);
        books.add(bookAdder4);
        Books bookAdder5 = new Books("The Fork, the Witch, and the Worm", 20.00, 0);
        books.add(bookAdder5);
        Books bookAdder6 = new Books("How to get the Great Doctor to Heal your Grades Manual", 20.00, 0);
        books.add(bookAdder6);

        CDs cdsAdder1 = new CDs("The Phoenix", 11.08, 453);
        CDs.add(cdsAdder1);
        CDs cdsAdder2 = new CDs("Centuries", 15.07, 345);
        CDs.add(cdsAdder2);
        CDs cdsAdder3 = new CDs("Wasting Away", 16.57, 843);
        CDs.add(cdsAdder3);
        CDs cdsAdder4 = new CDs("S.C.A.V.A", 14.92, 464);
        CDs.add(cdsAdder4);
        CDs cdsAdder5 = new CDs("Careless Whisper", 26.21, 0);
        CDs.add(cdsAdder5);

        Member rMembers = new Member();

        Member memberAdder1 = new Member("John Doe", "premium", "debit", 18.24);
        members.add(memberAdder1);
        memberAdder1 = new Member("Jane Doe", "premium", "credit", 26.15);
        members.add(memberAdder1);
        memberAdder1 = new Member("Joseph Joestar", "premium", "cash", 15.07);
        members.add(memberAdder1);
        memberAdder1 = new Member("Laurence Ainsworth", "regular", "cash", 9.12);
        members.add(memberAdder1);
    }

    /**
     * method to print all the book's information in the array and occurs in
     * case 1
     */
    public void checkBookInventory() {
        for (Books book : books) {
            System.out.println("Book name: " + book.getName() + " | Cost: $" + book.getCost() + " | Number in stock: " + book.getNumInStock());
            System.out.println();
        }
    }

    /**
     * method to print all the CDs information in the array and occurs in case 2
     */
    public void checkCDsInventory() {
        for (CDs cds : CDs) {
            System.out.println("CD name: " + cds.getName() + " | Cost: $" + cds.getCost() + " | Number in stock: " + cds.getNumInStock());
            System.out.println();
        }
    }

    /**
     * method to print all the member's information in the array and occurs in
     * case 3
     */
    public void checkMembersList() {
        for (Member member : members) {
            System.out.println("Member's name: " + member.getMemberName() + " | Membership type: " + member.getMembershipType()
                    + " | Payment type: " + member.getPaymentType() + " | Amount Spent: $" + member.getAmountSpent());
            System.out.println();
        }
    }

}
