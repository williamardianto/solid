package o.after.account;

import o.after.Employee;
import o.after.applicant.Applicant;

public interface AccountCreator {
    Employee create(Applicant applicant);
}
