package i.after;

import java.time.LocalDateTime;

public interface Borrowable {
    LocalDateTime getBorrowDate();

    String getBorrower();

    int getCheckOutDurationInDays();

    void checkIn();

    void checkOut(String borrower);

    LocalDateTime getDueDate();
}
