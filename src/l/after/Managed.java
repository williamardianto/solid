package l.after;

public interface Managed extends Employee {
    Employee getManager();

    void assignManager(Manager manager);
}
