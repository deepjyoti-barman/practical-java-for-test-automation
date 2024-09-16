import java.util.Scanner;

public class L09_Quiz {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Task 1: Store each answer in each different variable
        System.out.println("1. Which country held the 2016 Summer Olympics?");
        System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy\n");
        String answer1 = scan.nextLine();

        System.out.println("\n2. Which planet is the hottest?");
        System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars\n");
        String answer2 = scan.nextLine();

        System.out.println("\n3. What is the rarest blood type?");
        System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB-Negative\n");
        String answer3 = scan.nextLine();
        
        System.out.println("\n4. Which one of these characters is friends with Harry Potter?");
        System.out.println("\ta) Ron Weasley\n\tb) Hermione Granger\n\tc) Draco Malfoy\n");
        String answer4 = scan.nextLine();

        // Task 2: Check each answer - For each correct answer, add 5 points to the score. 
        int score = 0;
        
        if (answer1.equalsIgnoreCase("c")) {
            score += 5;
        }

        if (answer2.equalsIgnoreCase("a")) {
            score += 5;
        }

        if (answer3.equalsIgnoreCase("d")) {
            score += 5;
        }

        if (answer4.equalsIgnoreCase("a") || answer4.equalsIgnoreCase("b")) {
            score += 5;
        }
        
        System.out.println("\nYour final score is: " + score + "/20");

        // Task 3: print a message depending on the score
        if (score >= 15) {
            System.out.println("Wow, you know your stuff!");
        } else if (score >= 5) {
            System.out.println("Not bad!");
        } else {
            System.out.println("Better luck next time");
        }

        scan.close();
    }
}