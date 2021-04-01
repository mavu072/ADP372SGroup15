package za.ac.cput;

/*
 *NumbersTest.java
 * Felecia Zweni - 218330189
 * Date: 31 March 2021
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    public Numbers numbers1, numbers2;
    @BeforeEach
    void setUp() {
        numbers1 = new Numbers();
        numbers2 = new Numbers();
    }
    //1. Object Identity Test
    @Test
    void testIdentity(){
        assertSame(numbers1, numbers1);
    }

    //2. Object Quality Test
    @Test
    void testEquality(){
        assertEquals(numbers1, numbers2);
    }
    //3. Failing Test
    @Test
    void testFailing(){
        fail("This test is going to fail");
    }

    //4. Timeouts
    @Test
    void testTimeout(){
        new Numbers();
    }

    //5. Disabling Test
    @Test
    @Disabled
    void testDisabled(){
        fail("This is not going to fail");
    }
}