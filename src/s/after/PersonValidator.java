package s.after;

public class PersonValidator {
    public static boolean validate(Person person) {
        if (person.getFirstName() == null || person.getFirstName().isEmpty()) {
            StandardMessages.validationErrorMessage("first name");
            return false;
        }

        if (person.getLastName() == null || person.getLastName().isEmpty()) {
            StandardMessages.validationErrorMessage("last name");
            StandardMessages.endMessage();
            return false;
        }
        return true;
    }
}
