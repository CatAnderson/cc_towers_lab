import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private ConferenceRoom conferenceRoom1;
    private ConferenceRoom conferenceRoom2;
    private Guest guest;

    @Before
    public void before(){
        hotel = new Hotel("CodeClan Towers");
        bedroom1 = new Bedroom(23, 2, 'D');
        bedroom2 = new Bedroom(30, 1, 'S');
        conferenceRoom1 = new ConferenceRoom("Tundra", 2);
        conferenceRoom2 = new ConferenceRoom("Fishbowl", 1);
        guest = new Guest("Matt");

    }

    @Test
    public void hasName(){
        assertEquals("CodeClan Towers", hotel.getName());
    }

    @Test
    public void hasBedrooms(){
        hotel.addBedroom(bedroom1);
        hotel.addBedroom(bedroom2);
        assertEquals(2, hotel.bedroomCount());
    }

    @Test
    public void hasConferenceRooms(){
        hotel.addConferenceRoom(conferenceRoom1);
        hotel.addConferenceRoom(conferenceRoom2);
        assertEquals(2, hotel.conferenceRoomCount());
    }

}
