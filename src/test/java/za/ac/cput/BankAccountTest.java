package za.ac.cput;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static java.time.Duration.ofMillis;
import static java.time.Duration.ofMinutes;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    private BankAccount accountA = new BankAccount();
    private BankAccount accountB = new BankAccount();


    @BeforeEach
    void setUp() {
        accountA = new BankAccount();
        accountB = new BankAccount();
    }

    @Test
    void testIdentity() {
        assertSame(accountA, accountA);
    }

    @Test
    void testEquality() {
        assertEquals(accountA.getName(), accountB.getName());
    }

    @Test
    @Disabled("this test will fail.")
    void testFail() {
        try {
            //do something that should throw error but doesnt
            System.out.print(1.0 / 0.0);
            //throw an error
            fail("Exception not thrown");

        } catch (Exception e) {
            System.out.print("ArithmeticException: Division by Zero = infinity");
        }
    }

    @Test
    @Timeout(15)
    void testTimeout() throws InterruptedException {

        TimeUnit.SECONDS.sleep(5);
    }
}
