package o.after.account;

import o.after.Employee;
import o.after.account.AccountCreator;
import o.after.applicant.Applicant;

public class StaffAccountCreator implements AccountCreator {
    @Override
    public Employee create(Applicant applicant) {

        return new Employee(applicant.getFirstName(), applicant.getLastName(),
                String.format("%s.%s@example.com", applicant.getFirstName(), applicant.getLastName()),
                false, false);
    }
}
