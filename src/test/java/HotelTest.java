import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private ConferenceRoom conferenceRoom1;
    private ConferenceRoom conferenceRoom2;
    private Guest guest;
    private Booking booking;

    @Before
    public void before(){
        hotel = new Hotel("CodeClan Towers");
        bedroom1 = new Bedroom(23, 2, 'D', 150.00);
        bedroom2 = new Bedroom(30, 1, 'S', 75.50);
        conferenceRoom1 = new ConferenceRoom("Tundra", 2);
        conferenceRoom2 = new ConferenceRoom("Fishbowl", 1);
        guest = new Guest("Matt");
        booking = new Booking(guest ,3, bedroom1);

        hotel.addBedroom(bedroom1);
        hotel.addBedroom(bedroom2);
        hotel.addConferenceRoom(conferenceRoom1);
        hotel.addConferenceRoom(conferenceRoom2);

    }

    @Test
    public void hasName(){
        assertEquals("CodeClan Towers", hotel.getName());
    }

    @Test
    public void hasBedrooms(){
        assertEquals(2, hotel.bedroomCount());
    }

    @Test
    public void hasConferenceRooms(){
        assertEquals(2, hotel.conferenceRoomCount());
    }

    @Test
    public void canCheckInToBedroom(){
        hotel.addGuestToBedroom(bedroom1, guest);
        assertEquals(1, bedroom1.guestCount());
    }

    @Test
    public void canCheckOutFromBedroom(){
        hotel.addGuestToBedroom(bedroom1, guest);
        hotel.removeGuestFromBedroom(bedroom1);
        assertEquals(0, bedroom1.guestCount());
    }
    @Test
    public void canBookRoom() {
        Booking newBooking = (hotel.bookRoom(bedroom1, guest, 3));
        assertEquals(bedroom1, newBooking.getBedroom());
        assertEquals("Matt", newBooking.getGuestName());
        assertEquals(3, newBooking.getNightsBooked());
//
//        assertThat(booking, hotel.bookRoom(bedroom1, guest, 3));
    }
}
