package d.after;

public class Chore implements Task {
    public String choreName;
    public Person owner;
    public double hoursWorked;
    public boolean isComplete;
    MessageSender emailSender;
    Log logger;

    public Chore(MessageSender emailSender, Log logger) {
        this.emailSender = emailSender;
        this.logger = logger;
    }

    @Override
    public String getChoreName() {
        return choreName;
    }

    @Override
    public void setChoreName(String choreName) {
        this.choreName = choreName;
    }

    @Override
    public Person getOwner() {
        return owner;
    }

    @Override
    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public double getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public void setHoursWorked(double hour) {
        this.hoursWorked = hour;
    }

    @Override
    public boolean getIsComplete() {
        return isComplete;
    }

    @Override
    public void setIsComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }

    @Override
    public void performedWork(double hours) {
        hoursWorked += hours;
        Log log = this.logger;
        log.log(String.format("Performed work on %s", choreName));
    }

    @Override
    public void completeChore() {
        isComplete = true;

        Logger log = new Logger();
        log.log(String.format("Completed %s", choreName));

        MessageSender emailSender = this.emailSender;
        emailSender.sendMessage(owner, String.format("The chore %s is complere", choreName));
    }
}
