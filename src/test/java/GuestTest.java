import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {
    private Guest guest;

    @Before
    public void before() {
        guest = new Guest("Cat");
    }

    @Test
    public void hasName() {
        assertEquals("Cat", guest.getName());
    }
    
    @Test
    public void canSetName() {
        assertEquals("Doug", guest.setName("Doug"));
    }
}
