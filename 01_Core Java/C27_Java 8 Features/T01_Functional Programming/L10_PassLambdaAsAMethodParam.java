interface Animal {
    void run();
}

class Cat implements Animal {
    @Override
    public void run() {
        System.out.println("Running at 15 Km/h");
    }
}

class Dog implements Animal {
    @Override
    public void run() {
        System.out.println("Running at 30 Km/h");
    }
}

public class L10_PassLambdaAsAMethodParam {

    public static void perform(Animal animal) {
        animal.run();
    }

    public static void main(String[] args) {
        // Passing object as a method parameter
        Animal animal1 = new Dog();
        perform(animal1);
        perform(new Cat());

        // Passing lambda/behavior as a method parameter
        perform(() -> System.out.println("A tiger running at 100 Km/h"));
    }
}
