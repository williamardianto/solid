package s.after;

public class main {
    public static void main(String[] args) {
        StandardMessages.welcomeMessage();

        Person person = PersonDataCapture.capture();

        boolean isPersonValid = PersonValidator.validate(person);

        if (!isPersonValid) {
            StandardMessages.endMessage();
        }

        AccountGenerator.create(person);

        StandardMessages.endMessage();
    }
}
