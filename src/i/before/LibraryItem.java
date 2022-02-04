package i.before;

import java.time.LocalDateTime;

public interface LibraryItem {
    String getAuthor();

    LocalDateTime getBorrowDate();

    String getBorrower();

    int getCheckOutDurationInDays();

    String getLibraryId();

    int getPages();

    String getTitle();

    void checkIn();

    void checkOut(String borrower);

    LocalDateTime getDueDate();
}
