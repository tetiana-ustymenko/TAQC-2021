package tests;

import com.company.Book;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void compareBookPrice1() {
    Book b1 = new Book(360.25);
    Book b2 = new Book(590.75);
    assertTrue(b1.compareBookPrice(b2));
    }

    @org.junit.jupiter.api.Test
    void compareBookPrice2() {
        Book b1 = new Book(240.00);
        Book b2 = new Book(240.00);
        assertFalse(b1.compareBookPrice(b2));
    }

    @org.junit.jupiter.api.Test
    void compareBookYear1() {
    Book b1 = new Book(1999);
    Book b2 = new Book(2020);
        assertTrue(b1.compareBookYear(b2));
    }

    @org.junit.jupiter.api.Test
    void compareBookYear2() {
        Book b1 = new Book(2005);
        Book b2 = new Book(2005);
        assertFalse(b1.compareBookYear(b2));
    }

}