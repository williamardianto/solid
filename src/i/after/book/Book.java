package i.after.book;

import i.after.LibraryItem;

public interface Book extends LibraryItem {
    String getAuthor();

    int getPages();
}
