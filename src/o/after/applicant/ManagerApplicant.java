package o.after.applicant;

import o.after.account.AccountCreator;
import o.after.account.ManagerAccountCreator;
import o.after.account.StaffAccountCreator;

public class ManagerApplicant implements Applicant {
    String firstName;
    String lastName;
    AccountCreator accountCreator;

    public ManagerApplicant(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountCreator = new ManagerAccountCreator();
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public AccountCreator getAccountProcessor() {
        return accountCreator;
    }
}
