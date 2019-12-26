package Exercise_4;

public class RoomNumber {

    private int floorNumber;
    private int roomNumber;
    private Person person;

    public RoomNumber(int floorNumber, int roomNumber, Person person) {
        this.floorNumber = floorNumber;
        this.roomNumber = roomNumber;
        this.person = person;
    }

    public RoomNumber(int floorNumber, int roomNumber) {
        this.floorNumber = floorNumber;
        this.roomNumber = roomNumber;
    }

    public String fullRoomNumber() {
        return Integer.toString(floorNumber) + "." + Integer.toString(roomNumber);
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Pokój numer: " + floorNumber + "." + roomNumber +
                ", Gość :" + person;
    }
}
