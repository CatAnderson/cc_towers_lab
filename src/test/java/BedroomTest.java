import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

private Bedroom bedroom1;
private Bedroom bedroom2;
private Guest guest;

@Before
public void before(){
    bedroom1 = new Bedroom(23, 2, 'D');
    bedroom2 = new Bedroom(30, 1, 'S');
    guest = new Guest("Matt");
}

@Test
public void hasRoomNo(){
    assertEquals(23, bedroom1.getRoomNo());
}

@Test
public void roomStartsEmpty(){
    assertEquals(0, bedroom1.guestCount());
}

@Test
public void canAddGuest(){
    bedroom1.addGuest(guest);
    bedroom1.addGuest(guest);
    bedroom1.addGuest(guest);
    assertEquals(2, bedroom1.guestCount());
}
}
