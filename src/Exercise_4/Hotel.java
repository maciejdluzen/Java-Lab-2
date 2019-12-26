package Exercise_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hotel {

    private static final int NUMBER_OF_ROOMS = 100;

    private int roomsPerFloor;
    private int numberOfFloors;

    public Hotel(int roomsPerFloor, int numberOfFloors) {
        this.roomsPerFloor = roomsPerFloor;
        this.numberOfFloors = numberOfFloors;
    }

    public int getRoomsPerFloor() {
        return roomsPerFloor;
    }

    public void setRoomsPerFloor(int roomsPerFloor) {
        this.roomsPerFloor = roomsPerFloor;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    // Metoda tworząca wszystkie pokoje w hotelu (na razie bez ludzi)
    public List<RoomNumber> prepareAllHotelRooms(Hotel hotel) {
        List<RoomNumber> rooms = new ArrayList<>();
        for(int j = 1; j <= hotel.getNumberOfFloors(); j++) {
            for(int k = 1; k <= hotel.getRoomsPerFloor(); k++) {
                rooms.add(new RoomNumber(j, k));
                if (j * k > NUMBER_OF_ROOMS) {
                    System.out.println("Iloraz liczby pięter oraz pokoi na pietrze, przekracza maksymalną założoną liczbę pokoi");
                    break;
                }
            }
        }
        return rooms;
    }

    // Metoda sprawdzająca, czy chociaż jeden pokój jest wolny.
    public boolean isAnyRoomAvailable(List<RoomNumber> rooms) {
        for(RoomNumber room : rooms) {
            if(room.getPerson() == null) {
                return true;
            }
        }
        return false;
    }

    // Metoda przydzielająca gościa do pierwszego wolnego pokoju.
    public String rentRoom(List<RoomNumber> rooms, Person person) {
        String roomNumber = "0.0";
        for(RoomNumber room : rooms) {
            if(room.getPerson() == null) {
                room.setPerson(person);
                roomNumber = room.fullRoomNumber();
                break;
            }
        }
        return roomNumber;
    }

    // Metoda sprawdzająca, czy osoba o podanym nazwisku wynajmuje jakiś pokój
    public boolean doesAPersonRentARoom(List<RoomNumber> rooms, String lastName) {
        for(RoomNumber room : rooms) {
            try {
                if(room.getPerson().getLastName().equals(lastName)) {
                    return true;
                }
            } catch (NullPointerException e) {
                continue;
            }
        }
        return false;
    }

    // Metoda zwalniająca pokój, zajmowany przez osobę o podanym nazwisku
    public void vacateRoom(List<RoomNumber> rooms, String lastName) {
        for(RoomNumber room : rooms) {
            try {
                if (room.getPerson().getLastName().equals(lastName)) {
                    room.setPerson(null);
                }
            } catch (NullPointerException e) {
                continue;
            }
        }
    }
}
