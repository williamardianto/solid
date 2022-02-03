package o.after.applicant;

import o.after.account.AccountCreator;
import o.after.account.ExecuriveAccountCreator;
import o.after.account.ManagerAccountCreator;

public class ExecutiveApplicant implements Applicant {
    String firstName;
    String lastName;
    AccountCreator accountCreator;

    public ExecutiveApplicant(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountCreator = new ExecuriveAccountCreator();
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
