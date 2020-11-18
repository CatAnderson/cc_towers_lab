import java.util.ArrayList;

public class Bedroom {
    private int roomNo;
    private int capacity;
    private ArrayList<Guest> guests;
    private char type;
    private double nightlyRate;

    public Bedroom(int roomNo, int capacity, char type, double nightlyRate) {
        this.roomNo = roomNo;
        this.capacity = capacity;
        this.guests = new ArrayList<>();
        this.type = type;
        this.nightlyRate = nightlyRate;
    }

    public int getRoomNo() {
        return this.roomNo;
    }

    public int guestCount() {
        return this.guests.size();
    }

    public void addGuest(Guest guest) {
        if (this.capacity > guestCount()) {
            this.guests.add(guest);
//            && this.guests.size() == 0 )
        }
    }

    public void removeGuest() {
        this.guests.remove(0);
    }

    public int capacityCheck() {
        return this.capacity;
    }

    public char typeCheck() {
        return this.type;

    }
    public double getNightlyRate(){
        return this.nightlyRate;
    }
}
