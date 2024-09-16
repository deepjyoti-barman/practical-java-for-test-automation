import java.util.Scanner;

public class L07_Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortgage? (yes or no)");
        // Task 1 - Pick up the user's decision.
        String decision = scan.nextLine();

        // Task 2 - Print this if the decision is "yes"
        if (decision.equalsIgnoreCase("yes")) {
            System.out.println("\nGreat! In one line" +
            "\nHow much money do you have in your savings?" +
            "\nAnd, how much do you owe in credit card debt?");
            // Task 3 - Pick up each value 
            double savings = scan.nextDouble();
            double debt = scan.nextDouble();

            System.out.println("\nHow many years have you worked for?");
            // Task 4 - Pick up number of years
            int yearsOfService = scan.nextInt();
            scan.nextLine();

            System.out.println("\nWhat is your name?");
            // Task 5 - Pick up the user's name
            String name = scan.nextLine();
                
            // Task 6 - Approve the mortgage if they meet the requirements (see article)
            //       - Otherwise, don't give them a mortgage.     
            
            boolean isLoanApproved = false;
            if (savings >= 10000 && debt < 5000 && yearsOfService > 2) {
                isLoanApproved = true;
            }

            System.out.println(isLoanApproved ? 
                "\nCongratulations " + name + " You have been approved!" 
                    : "\nSorry, you are not eligible for a mortgage.");
        } else {
            // Task 2 - Print this if the decision was not "yes"
            System.out.println("\nOK. Have a nice day!");
        }
        
        scan.close();
    }
}