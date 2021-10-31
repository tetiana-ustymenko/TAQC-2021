package tests;

import com.company.Dog;
import org.junit.jupiter.api.Test;
import com.company.HTTPErrors;

import static org.junit.jupiter.api.Assertions.*;

public class HTTPErrorsTest {

    @Test
    void errorName1() {
        HTTPErrors s1 = HTTPErrors.ERROR401;
        HTTPErrors s2 = HTTPErrors.ERROR431;
        assertNotSame(s1.errorName(),s2.errorName());
    }
    @Test
    void errorName2() {
        HTTPErrors s1 = HTTPErrors.ERROR419;
        HTTPErrors s2 = HTTPErrors.ERROR419;
        assertNotSame(s1.errorName(),s2.errorName());
    }}
    /*
    @Test
    void errorName3() {
        HTTPErrors s1 = HTTPErrors.ERROR408;
        HTTPErrors s2 = HTTPErrors.ERROR427;
        assertNotSame(s1.errorName(),s2.errorName())
    }
    @Test
    void errorName4() {
        Dog d1 = new Dog("Prince");
        Dog d2 = new Dog("Whiskey");
        assertSame(d1.getName(), d2.getName());
    }

    @Test
    void errorName() {
    }

    @Test
    void values() {
    }

    @Test
    void valueOf() {
    }
}*/