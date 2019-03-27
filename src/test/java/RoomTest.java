import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room conferenceRoom;
    Room singleBedRoom;
    Room doubleBedRoom;
    Guest guest1;
    Guest guest2;

    @Before
    public void before(){

        conferenceRoom = new Room('C',2);
        singleBedRoom = new Room('B',2, 'S');
        doubleBedRoom = new Room('B', 2, 'D');

        guest1 = new Guest("Peter");
        guest2 = new Guest("John");
    }

    @Test
    public void canCheckRoomType(){
        assertEquals("ConferenceRoom", conferenceRoom.returnRoomType());
        assertEquals("BedRoom", singleBedRoom.returnRoomType());
    }

    @Test
    public void canCheckGuestCount() {
        assertEquals(0, singleBedRoom.guestCount());
    }

    @Test
    public void bedroomCanBeSingleOrDouble() {
        assertEquals("Single", singleBedRoom.getBedType());
        assertEquals("Double", doubleBedRoom.getBedType());
    }

    @Test
    public void canAddGuest() {
        singleBedRoom.addGuestToRoom(guest1);
        assertEquals(1, singleBedRoom.guestCount());
    }

    @Test
    public void canRemoveGuest() {
        singleBedRoom.addGuestToRoom(guest1);
        singleBedRoom.removeGuest(guest1);
        assertEquals(0, singleBedRoom.guestCount());
    }
}
