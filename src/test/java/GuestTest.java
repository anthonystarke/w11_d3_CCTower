import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest1;

    @Before
    public void before(){
        guest1 = new Guest("John");
    }

    @Test
    public void canGetGuestName(){
        assertEquals("John",guest1.getName());
    }

}
