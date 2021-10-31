package com.company;

import java.util.Comparator;

public class Book {
    private String bookName;
    private String authorName;
    private int bookYear;
    private String bookPlace;
    private String bookGenre;
    private int bookPages;
    private double bookPrice;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getBookYear() {
        return bookYear;
    }

    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public Book() {
    }

    public Book(String bookName, String authorName) {
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public Book(int bookYear) {
        this.bookYear = bookYear;
    }

    public Book(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


    public void input(String bookName, String authorName, int bookYear, String bookPlace, String bookGenre,
                      int bookPages, double bookPrice) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.bookYear = bookYear;
        this.bookPlace = bookPlace;
        this.bookGenre = bookGenre;
        this.bookPages = bookPages;
        this.bookPrice = bookPrice;
    }

    public void output() {
        System.out.println("Name of the book is " + this.bookName + ".");
        System.out.println("The author of this book is " + this.authorName + ".");
        System.out.println("This book was published in " + this.bookYear + ".");
        System.out.println("This book was published at " + this.bookPlace + ".");
        System.out.println("Genre of the book is " + this.bookGenre + ".");
        System.out.println("The book contains " + this.bookPages + " pages.");
        System.out.println("The book costs " + this.bookPrice + " UAH.");
    }

    //if (bookPrice = Math.min(bookPrice);

    //cheapest book
    public boolean compareBookPrice(Book other) {
        if (this.bookPrice < other.bookPrice) {
            return true;
        }
        return false;
    }

    public boolean compareBookYear(Book other) {
        if (this.bookYear > other.bookYear) {
            return true;
        }
        return false;
    }

}
        /*class SortedByPrice implements Comparator<Book> {
            public int compare(Book obj1, Book obj2) {

                return obj1.compareBookPrice(obj2);
            }
        }
        return 0;
    }
}

        //newest book
        /*
        public int compareBookYear (Book other) {
            if (this.bookYear > other.bookYear) {
                return 1;
            } else if (this.bookYear == other.bookYear) {
                return 0;
            } else if (this.bookYear > other.bookYear) {
                return -1;
            }


            class SortedByYear implements Comparator<Book> {
                public int compare(Book obj1, Book obj2) {
                    return obj1.compareBookYear(obj2);
                }
            }
*/
        /*
    public int compareByName() {
        String str1 = this.getBookName();
        String str2 = other.getBookName();
        return str1.compareTo(str2);
    }


    public void changeAuthorName(String authorName) {
        System.out.print("A name of the author " + this.authorName + " changed to ");
        this.authorName = authorName;
        System.out.println(this.authorName);
    }

}
*/
