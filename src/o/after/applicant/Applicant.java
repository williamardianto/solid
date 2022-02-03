package o.after.applicant;

import o.after.account.AccountCreator;

public interface Applicant {
    String getFirstName();

    String getLastName();

    AccountCreator getAccountProcessor();
}
