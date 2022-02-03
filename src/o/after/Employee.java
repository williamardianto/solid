package o.after;

public class Employee {
    String firstName;
    String lastName;
    String email;
    boolean isManager;
    boolean isExecutive;

    public Employee(String firstName, String lastName, String email, boolean isManager, boolean isExecutive) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.isManager = isManager;
        this.isExecutive = isExecutive;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }

    public boolean isExecutive() {
        return isExecutive;
    }

    public void setExecutive(boolean executive) {
        isExecutive = executive;
    }
}
