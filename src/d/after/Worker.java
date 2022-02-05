package d.after;

public class Worker implements Person {
    public String firstName;
    public String lastName;
    public String phone;
    public String email;

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getPhone() {
        return phone;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String setFirstName(String firstName) {
        return this.firstName = firstName;
    }

    @Override
    public String setLastName(String lastName) {
        return this.lastName = lastName;
    }

    @Override
    public String setPhone(String phone) {
        return this.phone = phone;
    }

    @Override
    public String setEmail(String email) {
        return this.email = email;
    }


}
