package Lecture_5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    Book book1;
    Book book2;

    @Before
    public void newBook(){
    book1 = new Book("Testing.com", "Roman Savin", 316);
    book2 = new Book("Software testing. Basic course", "Svyatoslav Kulikov", 314);
    }

    @Test
    public void setTitle() {
    }

    @Test
    public void setAuthor() {
    }

    @Test
    public void setNumberOfPages() {
    }

    @Test
    public void getTitle() {
    }

    @Test
    public void getAuthor() {
    }

    @Test
    public void getNumberOfPages() {
    }

    @Test
    public void testToStringBook1() {
        String expected = "Book{" +
                "title='Testing.com', " +
                "author='Roman Savin', " +
                "numberOfPages=316}";
        String actual = book1.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testToStringBook2() {
        String expected = "Book{" +
                "title='Software testing. Basic course', " +
                "author='Svyatoslav Kulikov', " +
                "numberOfPages=314}";
        String actual = book2.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testEquals() {

    }

    @Test
    public void testHashCodeBook1() {

        Book expected = new Book("Testing.com", "Roman Savin", 316);
        Book actual = new Book("Testing.com", "Roman Savin", 316);
        assertEquals(expected, actual);
    }
    @Test
    public void testHashCodeBook2() {
        book2.setTitle("Software testing. Basic course");
        book2.setAuthor("Svyatoslav Kulikov");
        book2.setNumberOfPages(314);
        Book expected = new Book("Software testing. Basic course", "Svyatoslav Kulikov", 314);
        Book actual = new Book("Software testing. Basic course", "Svyatoslav Kulikov", 314);
        assertEquals(expected, actual);
    }
}