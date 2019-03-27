import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> rooms;

    public Hotel () {
        this.rooms = new ArrayList<>();
    }

    public int getRoomCount() {
        return this.rooms.size();
    }

    public void addRoom(Room newRoom) {
        this.rooms.add(newRoom);
    }

    public void checkInGuest(Room room, Guest guest) {
        if (room.guestCount() == 0) {
            this.rooms.get(this.rooms.indexOf(room)).addGuestToRoom(guest);
        }
    }

    public Guest checkOutGuest(Room room, Guest guest) {
        return this.rooms.get(this.rooms.indexOf(room)).removeGuest(guest);
    }

    public Booking bookRoom(Guest guest, Room room,int numNights){
        Booking newBooking = new Booking(room,numNights);
        return newBooking;
    }

    public int emptyRoomsCount() {
        int totalEmptyRooms = 0;
        for (int i = 0; i < this.rooms.size(); i++) {
            if (this.rooms.get(i).guestCount() == 0)
            {
                totalEmptyRooms ++;
            }
        }
        return totalEmptyRooms;
    }

    public ArrayList<Room> findEmptyRooms() {
        ArrayList<Room> emptyRooms = new ArrayList<>();
        for (Room room:this.rooms) {
            if (room.guestCount() == 0) {
                emptyRooms.add(room);
            }
        }


//        for (int i = 0; i < this.rooms.size(); i++) {
//            if (this.rooms.get(i).guestCount() == 0)
//            {
//                totalEmptyRooms ++;
//            }
//        }
        return emptyRooms;
    }


}
