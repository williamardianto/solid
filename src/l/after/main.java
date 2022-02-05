package l.after;

public class main {
    public static void main(String[] args) {
        BasicManager accountingVP = new BasicManager();

        accountingVP.setFirstName("William");
        accountingVP.setLastName("Ardianto");
        accountingVP.calculatePerHourRate(4);

        BasicEmployee employee = new BasicEmployee();

        employee.setFirstName("Wilson");
        employee.setLastName("Lim");
        employee.assignManager(accountingVP);
        employee.calculatePerHourRate(2);

        System.out.println(String.format("%s salary is %s/hour", employee.getFirstName(), employee.getSalary()));
    }
}
