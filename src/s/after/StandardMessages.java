package s.after;

public class StandardMessages {
    public static void welcomeMessage() {
        System.out.println("Welcome to my application");
    }

    public static void endMessage() {
        System.out.println("End of application");
    }

    public static void validationErrorMessage(String fieldName) {
        System.out.println(String.format("You did not give us a valid %s", fieldName));
    }
}
