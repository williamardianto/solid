package d.before;

public class Emailer {
    public void sendEmail(Person person, String message) {
        System.out.println(String.format("Simulating sending an email to %s", person.email));
    }
}
