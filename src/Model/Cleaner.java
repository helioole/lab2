package Model;

import Model.Guest;
import Model.Person;

import java.util.Random;

public class Cleaner extends Person {
    public Guest guest;
    public Medical medical;
    public Meal meal;
    public Room room;

    public Cleaner(Room room, Guest guest, Medical medical, Meal meal) {
        this.room = room;
        this.guest = guest;
        this.medical = medical;
        this.meal = meal;
    }

    @Override
    public void speak() {
        System.out.printf("[Model.Cleaner] My name is %s. The room is prepared for you" + "\n", call);
    }

    @Override
    public void reply() {
        System.out.printf("[Model.Cleaner] We'll work on quality of our service" + "\n");
    }

    public int cleaningCheck() {
        speak();
        room.isCleaned();
        if (room.isCleaned()) {
            System.out.println("[Guest] The room is so clean");
            guest.review++;
            guest.setTips(7);
            return 1;
        } else {
            System.out.println("[Guest] The room is so dirty. Such a bad hotel");
            guest.setReview(-1);
            setFine(10);
            reply();
            return 1;
        }
    }
}
