import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {
    DiningRoom diningRoom;
    Guest guest;

    @Before
    public void before() {
        guest = new Guest("Eugene");
        diningRoom = new DiningRoom("PegLegs");
    }

    @Test
    public void hasName() {
        assertEquals("PegLegs", diningRoom.getName());
    }

    @Test
    public void canAddGuest() {
        diningRoom.addGuest(guest);
        assertEquals(1, diningRoom.guestCount());
    }
}
