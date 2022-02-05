package l.before;

public class Employee {
    public String firstName;
    public String lastName;
    public Employee manager;
    public double salary;

    public void assignManager(Employee manager){
        this.manager = manager;
    }

    public void calculatePerHourRate(int rank){
        double baseAmount = 12.50;
        salary = baseAmount + (rank * 2);
    }
}
