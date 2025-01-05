package ClassWorkJanuary2;

public class Initializer {
    static int initialValue;
    static {
        initialValue = 1000;
        System.out.println("Static block executed. Initial value set to: " + initialValue);
    }

    public Initializer() {
        System.out.println("Initializer instance created.");
    }

    public static void main(String[] args) {
        System.out.println("Value of initialValue before creating an instance: " + Initializer.initialValue);

        Initializer initializerInstance = new Initializer();

        System.out.println("Value of initialValue after creating an instance: " + Initializer.initialValue);
    }
}
