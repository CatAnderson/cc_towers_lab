import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;
    Guest guest;

    @Before
    public void before(){
        conferenceRoom1 = new ConferenceRoom("Tundra", 2);
        conferenceRoom2 = new ConferenceRoom("Fishbowl", 1);
        guest = new Guest("Haribo");
    }

    @Test
    public void hasName() {
        assertEquals("Tundra", conferenceRoom1.getName());
    }

    @Test
    public void startsEmpty() {
        assertEquals(0, conferenceRoom1.guestCount());
    }

    @Test
    public void canAddGuest() {
        conferenceRoom1.addGuest(guest);
        assertEquals(1, conferenceRoom1.guestCount());
    }
    
    @Test
    public void canRemoveGuest(){
        conferenceRoom1.addGuest(guest);
        conferenceRoom1.removeGuest();
        assertEquals(0, conferenceRoom1.guestCount());
    }
}
