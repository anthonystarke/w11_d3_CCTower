public class Booking {

    Room bedroom;
    int nightsBooked;

    public Booking (Room room, int nightsBooked) {
        this.bedroom = room;
        this.nightsBooked = nightsBooked;
    }


    public int returnNightsBooked(){
        return this.nightsBooked;
    }

    public Room returnRoomBooked(){
        return bedroom;
    }

    public int returnTotalPrice(){
        return bedroom.returnRate() * this.nightsBooked;
    }

}
