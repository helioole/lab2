import java.util.Random;

public class Manager {
    //private int available_rooms;
    private int occupied_rooms;
    private boolean isOccupied;
    private int room_index = 0;

    public boolean isOccupied() {

        return isOccupied;
    }

    public int getAvailable_rooms() {
        return occupied_rooms;
    }

    public int getRoom_index() {

        return room_index;
    }

    public void setRoom_index(int room_index) {

        this.room_index = room_index;
    }

    public void setAvailable_rooms(int available_rooms) {

        this.occupied_rooms = available_rooms;
    }

    public void setOccupied(boolean occupied) {

        isOccupied = occupied;
    }

    public void available(Guest guest) {
        Random random = new Random();
        this.room_index = random.nextInt(6);
        this.occupied_rooms = random.nextInt(10);
        System.out.println("[Manager] Welcome to our hotel");
                if (occupied_rooms >= 5) {
                    isOccupied = true;
                    guest.review--;
                    System.out.println("[Manager] Oh, sorry. We don't have enough free rooms");
                    System.exit(0);
                } else {
                    guest.review++;
                    guest.tips++;
                    System.out.println("[Manager] Your room is " + room_index + ". Take your keys");
                    guest.check += 70;
                }
    }
}
