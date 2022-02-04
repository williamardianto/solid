package i.after;

import i.after.book.FictionBook;

public class main {
    public static void main(String[] args) {
        FictionBook fictionBook = new FictionBook();
        fictionBook.setAuthor("William");
        fictionBook.setPages(103);

        System.out.println(fictionBook.getAuthor());
        System.out.println(fictionBook.getPages());
    }
}
