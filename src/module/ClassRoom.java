package module;

public class ClassRoom {
    private String idClassRoom;
    private String nameClassRoom;
    private int numberOfSeats;

    public ClassRoom(String idClassRoom, String nameClassRoom, int numberOfSeats) {
        this.idClassRoom = idClassRoom;
        this.nameClassRoom = nameClassRoom;
        this.numberOfSeats = numberOfSeats;
    }

    public String getIdClassRoom() {
        return idClassRoom;
    }

    public void setIdClassRoom(String idClassRoom) {
        this.idClassRoom = idClassRoom;
    }

    public String getNameClassRoom() {
        return nameClassRoom;
    }

    public void setNameClassRoom(String nameClassRoom) {
        this.nameClassRoom = nameClassRoom;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
