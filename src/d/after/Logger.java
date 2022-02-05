package d.after;

public class Logger implements Log {
    @Override
    public void log(String message) {
        System.out.println(String.format("write to console: %s", message));
    }
}
