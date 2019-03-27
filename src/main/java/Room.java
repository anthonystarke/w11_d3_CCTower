import java.util.ArrayList;
import java.util.HashMap;

public class Room {

    private HashMap<Character, String> roomType = new HashMap<>();
    private HashMap<Character, String> bedroomType = new HashMap<>();
    private String type;
    private int capacity;
    ArrayList<Guest> guestCollection;
    private String bedroomTypeString;

    private int nightlyRate;


    public Room(char newRoomType,int newCapacity){

        this.roomType.put('C', "ConferenceRoom");
        this.roomType.put('B',"BedRoom");

        this.capacity = newCapacity;
        this.guestCollection = new ArrayList<>();

        this.type = this.roomType.get(newRoomType);
    }

    public Room(char newRoomType,int newCapacity, char bedroomType) {

        this.roomType.put('C', "ConferenceRoom");
        this.roomType.put('B',"BedRoom");

        this.bedroomType.put('S', "Single");
        this.bedroomType.put('D', "Double");

        this.capacity = newCapacity;
        this.guestCollection = new ArrayList<>();

        this.type = this.roomType.get(newRoomType);

        this.bedroomTypeString = this.bedroomType.get(bedroomType);
    }

    public int returnRate()
    {
        if (this.type.equals("ConferenceRoom"))
        {
            return 50;
        } else if (this.type.equals("BedRoom")) {

            if(this.bedroomTypeString.equals("Single")){
                return 25;
            } else {
                return 50;
            }
        }
        return 30;
    }

    public String returnRoomType(){
        return this.type;
    }

    public int guestCount() {
        return this.guestCollection.size();
    }

    public String getBedType() {
        return this.bedroomTypeString;
    }

    public void addGuestToRoom(Guest newGuest) {
        this.guestCollection.add(newGuest);
    }

    public Guest removeGuest(Guest guest){
        return this.guestCollection.remove(this.guestCollection.indexOf(guest));
    }

}
