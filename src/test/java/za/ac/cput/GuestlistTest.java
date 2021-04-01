package za.ac.cput;

/*
    GuestlistTest.java
    Author: Grant Metcalf
    Student Number: 217222943
    Date: 1 April 2021
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

class GuestlistTest {

    private Guestlist guestlist1;
    private Guestlist guestlist3;

    @BeforeEach
    void setUp() {
        guestlist1 = new Guestlist();
        guestlist3 = guestlist1;
    }

    @Test // 1 - Testing Object Equality
    void testEquality() {
        assertEquals(guestlist1, guestlist3);
    }

    @Test // 2 - Testing Object Identity
    void testIdentity() {
        assertSame(guestlist1, guestlist3);
    }

    @Test // 3 - Failing a test
    void testFailure() {
        fail("failing a test on purpose");
    }

    @Test // 4 - Testing timeouts
    @Timeout(1)
    void testTimeout() {
        new Guestlist();
    }

    @Test // 5 - Disabling a test
    @Disabled
    void testDisable() {
        new Guestlist();
    }
}