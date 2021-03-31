package za.ac.cput;

/*
 * BookwormTest.java
 * Author: Avuyile Mgxotshwa
 * Student: 219132488
 * Date: 30 March 2021
 */

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class BookwormTest {
    public Bookworm bookworm1, bookworm2;

    @BeforeEach
    void setUp() {
        bookworm1 = new Bookworm();
        bookworm2 = new Bookworm();
    }

    //1. Object Equality Test
    @Test
    void testEquality(){
        assertEquals(bookworm1, bookworm2);
    }

    //2. Object Identity Test
    @Test
    void testIdentity(){
        assertSame(bookworm1, bookworm2);
    }

    //3. Failing Test
    @Test
    void testFailing(){
        fail("This test is going to fail");
    }

    //4. Timeouts
    @Test
    @Timeout(6)
    void testTimeout(){
        new Bookworm();
    }

    //5. Disabling Test
    @Test
    @Disabled
    void testDisabled(){
        fail("This test is not going to fail");
    }

}