package d.after;

public class Emailer implements MessageSender {
    @Override
    public void sendMessage(Person person, String message) {
        System.out.println(String.format("Simulating sending an email to %s", person.getEmail()));
    }
}
