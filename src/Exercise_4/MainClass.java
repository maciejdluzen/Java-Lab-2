package Exercise_4;

import java.util.Arrays;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {

        Hotel hotel = new Hotel(10, 10);

        List<RoomNumber> rooms = hotel.prepareAllHotelRooms(hotel);

        Person person1 = new Person("Maciej", "Dłużeń");
        Person person2 = new Person("Jan", "Kowalski");

        System.out.println(rooms.size());

        System.out.println(rooms);

        System.out.println(hotel.rentRoom(rooms, person1));
        System.out.println(hotel.rentRoom(rooms, person2));

        hotel.vacateRoom(rooms, "Kowalski");

        System.out.println(rooms);

        System.out.println(hotel.doesAPersonRentARoom(rooms, "Kowalski"));

        System.out.println(hotel.isAnyRoomAvailable(rooms));
    }
}
