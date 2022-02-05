package l.after;

public class BasicEmployee extends BaseEmployee implements Managed {
    public Employee manager;

    @Override
    public Employee getManager() {
        return manager;
    }

    @Override
    public void assignManager(Manager manager) {
        this.manager = manager;
    }
}
