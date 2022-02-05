package l.after;

public interface Employee {
    String getFirstName();

    void setFirstName(String firstName);

    String getLastName();

    void setLastName(String lastName);

    double getSalary();

    void setSalary(double salary);

    void calculatePerHourRate(int rank);
}
