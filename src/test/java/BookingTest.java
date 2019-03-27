import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest{

    Booking booking;
    Room bedRoom;

    @Before
    public void before(){
        bedRoom = new Room('B',1,'S');
        booking = new Booking(bedRoom,1);
    }

    @Test
    public void checkStats(){
        assertEquals(1,booking.returnNightsBooked());
        assertEquals(bedRoom,booking.returnRoomBooked());
    }

    @Test
    public void checkBillPriceSingleOneNight(){
        assertEquals(25,booking.returnTotalPrice());
    }

    @Test
    public void checkBillPriceDoubleTwoNights(){
        bedRoom = new Room('B',1,'D');
        booking = new Booking(bedRoom,2);
        assertEquals(100,booking.returnTotalPrice());
    }
}
