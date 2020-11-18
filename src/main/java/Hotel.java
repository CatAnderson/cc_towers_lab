import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<Bedroom> unavailableRooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private HashMap<String, DiningRoom> diningRooms;

    public Hotel(String name){
        this.name = name;
        this.bedrooms = new ArrayList<>();
        this.unavailableRooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.diningRooms = new HashMap<>();

    }

    public void addDiningRoom(DiningRoom diningRoom) {
        this.diningRooms.put(diningRoom.getName(), diningRoom);
    }

    public String getName() {
        return this.name;
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public int bedroomCount() {
        return this.bedrooms.size();
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }

    public int conferenceRoomCount(){
        return this.conferenceRooms.size();
    }

    public void addGuestToBedroom(Bedroom bedroom, Guest guest) {
        bedroom.addGuest(guest);
        this.bedrooms.remove(bedroom);
        this.unavailableRooms.add(bedroom);
    }

    public void removeGuestFromBedroom(Bedroom bedroom) {
        bedroom.removeGuest();
        this.unavailableRooms.remove(bedroom);
        this.bedrooms.add(bedroom);
    }

    public Booking bookRoom(Bedroom bedroom, Guest guest, int nightsBooked) {
        addGuestToBedroom(bedroom, guest);
        Booking booking = new Booking(guest,nightsBooked, bedroom);
        return booking;
    }

    public int getDiningRoomCount() {
        return this.diningRooms.size();
    }
}
