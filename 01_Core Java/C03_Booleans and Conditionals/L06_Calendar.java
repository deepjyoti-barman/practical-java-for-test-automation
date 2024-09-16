public class L06_Calendar {
    public static void main(String[] args) {

        String day = "Saturday";
        System.out.println("Hey, are you free on " + day + "? \n");

        System.out.println("Hmm, let me check my calendar.");
        
        switch (day) {
            case "Monday": System.out.println("Sorry, I have to stay at work late."); break;
            case "Tuesday": System.out.println("It looks like I have meetings all day."); break;
            case "Wednesday": System.out.println("I have a dentist appointment. Some other time!"); break;
            case "Thursday": System.out.println("Sorry, thursday is date night!"); break;
            case "Friday": case "Saturday": case "Sunday": System.out.println("I'm free!!"); break;
            default: System.out.println("that's not a day.");
        }
    }
}