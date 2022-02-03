package s.after;

public class AccountGenerator {
    public static void create(Person person) {
        System.out.println(String.format("Your username is %s %s", person.getFirstName(), person.getLastName()));
    }
}
