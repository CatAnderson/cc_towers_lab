public class Booking {
    private Guest guest;
    private Bedroom bedroom;
    private int nightsBooked;

    public Booking(Guest guest, int nightsBooked, Bedroom bedroom){
        this.guest = guest;
        this.nightsBooked = nightsBooked;
        this.bedroom = bedroom;
    }

    public String getGuestName() {
        return this.guest.getName();
    }

    public Bedroom getBedroom() {
        return this.bedroom;
    }

    public int getNightsBooked() {
        return this.nightsBooked;
    }

    public double totalBill() {
        return this.nightsBooked * bedroom.getNightlyRate();
    }
}
