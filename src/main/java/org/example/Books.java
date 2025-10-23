package org.example;

public class Books extends LibraryItem {
    protected int pageCount;

    public Books(String title, String author, int year, int pageCount) {
        super(title, year, author);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public String toString() {
        return "Book: " + title + " by " + author + " (" + year + "), Pages: " + pageCount;
    }
    public void readBook() {
        System.out.println("Reading book: " + title);
        system.out.println("finished");
    } }
