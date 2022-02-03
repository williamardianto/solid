package o.before;

public class Applicant {
    String firstName;
    String lastName;
    EmployeeType typeOfEmployee;

    public Applicant(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.typeOfEmployee = EmployeeType.staff;
    }

    public Applicant(String firstName, String lastName, EmployeeType typeOfEmployee) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.typeOfEmployee = typeOfEmployee;
    }
}
