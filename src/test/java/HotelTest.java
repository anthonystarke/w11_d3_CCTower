import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class HotelTest {

    Hotel hotel;
    Room singleBedroom;
    Room doubleBedroom;
    Room conferenceroom;

    Guest guest1;
    Guest guest2;

    @Before
    public void before () {
        hotel = new Hotel();
        singleBedroom = new Room('B',1, 'S');
        doubleBedroom = new Room('B',2, 'D');
        conferenceroom = new Room('C',4);

        guest1 = new Guest("Peter");
        guest2 = new Guest("John");

    }

    @Test
    public void getRoomCount () {
        assertEquals(0, hotel.getRoomCount());
    }

    @Test
    public void canAddRoom () {
        hotel.addRoom(singleBedroom);
        assertEquals(1, hotel.getRoomCount());
    }

    @Test
    public void canCheckInGuest() {
        hotel.addRoom(singleBedroom);
        hotel.checkInGuest(singleBedroom, guest1);
        assertEquals(1, singleBedroom.guestCount());
    }

    @Test
    public void canCheckOutGuest() {
        hotel.addRoom(singleBedroom);
        hotel.checkInGuest(singleBedroom, guest1);
        hotel.checkOutGuest(singleBedroom,guest1);
        assertEquals(0, singleBedroom.guestCount());
    }

    @Test
    public void canGetEmptyroomsCount() {
        hotel.addRoom(singleBedroom);
        hotel.checkInGuest(singleBedroom, guest1);
        hotel.addRoom(doubleBedroom);

        assertEquals(1, hotel.emptyRoomsCount());
    }

    @Test
    public void canGetEmptyrooms() {
        hotel.addRoom(singleBedroom);
        hotel.checkInGuest(singleBedroom, guest1);
        hotel.addRoom(doubleBedroom);

        assertEquals(1, hotel.findEmptyRooms().size());
    }


}
