package Model;

import java.util.Random;

public class Room {
    Random random = new Random();
    private boolean isCleaned;

    public boolean isCleaned() {
        isCleaned = random.nextBoolean();
        return isCleaned;
    }
}
