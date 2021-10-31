package tests;

import com.company.Dog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DogTest {

    @Test
     void getName1() {
        Dog d1 = new Dog("Prince");
        Dog d2 = new Dog("Whiskey");
        assertSame(d1.getName(), d2.getName());
    }

    @org.junit.jupiter.api.Test
     void getName2() {
        Dog d1 = new Dog("Harry");
        Dog d2 = new Dog("Harry");
       assertSame(d1.getName(), d2.getName());
    }


    @org.junit.jupiter.api.Test
    void getAge1() {
        Dog d1 = new Dog(2);
        Dog d2 = new Dog(2);
        assertEquals(d1.getAge(), d2.getAge());
    }


    @org.junit.jupiter.api.Test
    void getAge2() {
        Dog d1 = new Dog(3);
        Dog d2 = new Dog(1);
        assertEquals(d1.getAge(), d2.getAge());
    }
}
