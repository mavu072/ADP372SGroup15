/*
Author: Mogamad Nabeel Meyers
Student Number: 218328702
Detail: Testing for class Cat.
Sidenote - I wasn't sure if it would be adequite to have the test fail or if i should i have
a passing test that means it fail. thus i added both instances. Sorry for confusion
 */
package za.ac.cput;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    //EqualityTest
    @Test
    void testCat(){

        Cat cat1 = new Cat("Red", 3);
        Cat cat2 = new Cat("Red", 3);
        assertEquals(cat1,cat2);
    }

    //IdentityTest
    @Test
    void testGetAge() {

        Cat cat = new Cat("Red", 3);
        assertSame(cat.getAge(),3);
    }

    //FailingTest
    @Test
    void testFailingEqualCat(){

        Cat cat1 = new Cat("Red", 3);
        Cat cat2 = new Cat("Blue", 4);
        assertEquals(cat1,cat2);
    }
    @Test
    void testPassingFailEqualCat(){

        Cat cat1 = new Cat("Red", 3);
        Cat cat2 = new Cat("Blue", 4);
        assertNotEquals(cat1,cat2);
    }

    //Timeouts
    @Test
    void testTimeoutCat(){
        assertTimeout(Duration.ofSeconds(1),()->{
            Cat cat1 = new Cat("Red", 3);
            Cat cat2 = new Cat("Blue", 4);
        });
    }

    //DisablingTest
    @Disabled("Disabled for Disable test!")
    @Test
    void testDisabledCat(){

        Cat cat1 = new Cat("Red", 3);
        Cat cat2 = new Cat("Red", 3);
        assertEquals(cat1,cat2);
    }
}