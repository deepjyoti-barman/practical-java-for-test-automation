public class L02_StringAndChar {
    public static void main(String[] args) {
        // make a name variable
        String name = "Deepjyoti";

        // make an age variable
        int age = 29;

        // make a country variable
        String country = "India";

        // make a sport variable
        String sport = "Badminton";

        // make an hours variable
        int hours = 2;

        // make a game variable
        String game = "Clash of Clans";

        // make a subject variable
        String subject = "Physics";

        // make a grade variable
        char grade = 'A';
     
        System.out.println("My name is " + name + ". I'm " + age + " years old, and I'm from " + country);
        System.out.println("My favourite sport is " + sport + ". I play for " + hours + " hours a day");
        System.out.println("When I'm tired, I like to play " + game + ".");
        System.out.println("In school, my favourite subject was " + subject + ", I scored an " + grade);
    }
}

/*
NOTE:
- char consumes less memory
- char is faster than String, as it is a primitive data-type, same goes for int vs long and float vs double
- Use int to store whole numbers
- Use long to store very large whole numbers
- Use double to store and work with decimals
*/