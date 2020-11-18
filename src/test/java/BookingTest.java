import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Hotel hotel;
    private Booking booking;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Guest guest1;
    private Guest guest2;

    @Before
    public void before() {
        hotel = new Hotel("CodeClan Towers");
        bedroom1 = new Bedroom(23, 2, 'D', 150.00);
        bedroom2 = new Bedroom(30, 1, 'S', 75.50);

        guest1 = new Guest("Matt");
        guest2 = new Guest("Mat");

        hotel.addBedroom(bedroom1);
        hotel.addBedroom(bedroom2);

        booking = new Booking(guest1,3 , bedroom1);


    }

    @Test
    public void hasName() {
        assertEquals("Matt", booking.getGuestName());
    }

    @Test
    public void hasBedroom() {
        assertEquals(bedroom1, booking.getBedroom());
    }

    @Test
    public void getTotalBill(){
        assertEquals(450.00, booking.totalBill(),0);
    }

}
