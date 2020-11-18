import java.util.ArrayList;

public class Bedroom {
    private int roomNo;
    private int capacity;
    private ArrayList<Guest> guests;
    private char type;

    public Bedroom(int roomNo, int capacity, char type) {
        this.roomNo = roomNo;
        this.capacity = capacity;
        this.guests = new ArrayList<>();
        this.type = type;
    }

    public int getRoomNo() {
        return this.roomNo;
    }

    public int guestCount() {
        return this.guests.size();
    }

    public void addGuest(Guest guest) {
        if (this.capacity > guestCount()){
            this.guests.add(guest);
        }
    }
}
