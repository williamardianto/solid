package d.after;

public class Factory {
    public static Person createWorker() {
        return new Worker();
    }

    public static Task createChore() {
        return new Chore(new Emailer(), new Logger());
    }

    public static Log createLogger() {
        return new Logger();
    }

    public static MessageSender createEmailSender() {
        return new Emailer();
    }
}
