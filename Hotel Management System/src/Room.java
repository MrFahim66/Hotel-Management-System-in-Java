public class Room {
    protected String roomtype, roomFacility;
    protected double roomPrice;

    public Room() {
    }

    public Room(String roomtype, String roomFacility, double roomPrice) {
        this.roomtype = roomtype;
        this.roomFacility = roomFacility;
        this.roomPrice = roomPrice;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public String getRoomFacility() {
        return roomFacility;
    }

    public void setRoomFacility(String roomFacility) {
        this.roomFacility = roomFacility;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public void displayRoom() {
        System.out.println("\nRoom Type   : " + this.getRoomtype());
        System.out.println("Room Facility : " + this.getRoomFacility());
        System.out.println("Room Price    : " + this.getRoomPrice());
    }
}
