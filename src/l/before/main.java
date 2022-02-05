package l.before;

public class main {
    public static void main(String[] args) {
        Manager accountingVP = new Manager();

        accountingVP.firstName = "William";
        accountingVP.lastName = "Ardianto";
        accountingVP.calculatePerHourRate(4);

        Employee employee = new Employee();

        employee.firstName = "Wilson";
        employee.lastName = "Lim";
        employee.assignManager(accountingVP);
        employee.calculatePerHourRate(2);

        System.out.println(String.format("%s salary is %s/hour", employee.firstName, employee.salary));
    }
}
