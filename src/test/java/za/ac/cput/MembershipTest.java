package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class MembershipTest {
    private Membership membership1;
    private Membership membership2;
    private Membership membership3;

    @BeforeEach
    void setUp() {
        membership1 = new Membership();
        membership2 = new Membership();
        membership3 = new Membership();
        membership1 = membership3;
    }
    //Identity Test
    @Test
    void testIdentity(){
        assertSame(membership1,membership3);


    }
    @Test
    //Equality test
    void testEquality() {
        assertEquals(membership1, membership3);

    }
    @Test
    //Fail Test
    public void testGetName(){
        System.out.println("");
        Membership instance = new Membership();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult,result);
        fail("This will fail");

    }
    //Disabling test
    @Test
    @Disabled
    public void testSetName(){
        System.out.println("");
        String name = "";
        Membership instance = new Membership();
        instance.setName(name);
        fail("This is gonna fail");

    }
    @Test
    @Disabled
    public void testGetSurname(){
        System.out.println("");
        Membership instance = new Membership();
        String expResult = "";
        String result = instance.getSurname();
        assertEquals(expResult,result);
        fail("This is gonna fail");
    }
    @Test
    @Disabled
    public void testSetSurname(){
        System.out.println("");
        String surname = "";
        Membership instance = new Membership();
        instance.setName(surname);

    }
    @Test
    @Disabled
    public void testGetIdentity(){
        System.out.println("");
        Membership instance = new Membership();
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult,result);
    }
    @Test
    @Disabled
    public void testSetIdentity(){
        System.out.println("");
        String identity = "";
        Membership instance = new Membership();
        instance.setName(identity);
    }
}