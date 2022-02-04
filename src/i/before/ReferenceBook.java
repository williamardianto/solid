package i.before;

import jdk.jshell.spi.ExecutionControl;

import java.time.LocalDateTime;

public class ReferenceBook implements LibraryItem {
    String author;
    LocalDateTime borrowDate;
    String borrower;
    int checkOutDurationInDays;
    String libraryId;
    int pages;
    String title;


    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public LocalDateTime getBorrowDate() {
        return borrowDate;
    }

    @Override
    public String getBorrower() {
        return borrower;
    }

    @Override
    public int getCheckOutDurationInDays() {
        return 0;
    }

    @Override
    public String getLibraryId() {
        return libraryId;
    }

    @Override
    public int getPages() {
        return pages;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void checkIn() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void checkOut(String borrower) {
        throw new UnsupportedOperationException();
    }

    @Override
    public LocalDateTime getDueDate() {
        throw new UnsupportedOperationException();
    }
}
