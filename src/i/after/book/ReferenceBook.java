package i.after.book;

import i.after.book.Book;

public class ReferenceBook implements Book {
    String author;
    String libraryId;
    int pages;
    String title;


    @Override
    public String getAuthor() {
        return author;
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
}
