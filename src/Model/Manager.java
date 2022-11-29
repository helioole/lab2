package Model;

import java.util.Random;

public class Manager extends Person{
    Random random = new Random();
    public Room room;
    public Guest guest;
    public Porter porter;
    public Medical medical;
    public Meal meal;
    private int nrGuests;
    private int capacity = 5;
    private int room_index = 0;

    public Manager(Room room, Guest guest, Porter porter, Medical medical,Meal meal){
        this.room = room;
        this.guest = guest;
        this.porter = porter;
        this.medical = medical;
        this.meal = meal;
    }

    @Override
    public void speak(){
        System.out.printf("[Model.Manager] Welcome to our hotel!" + "\n");
        System.out.printf("[Model.Manager] My name is %s. I'll check if we have free rooms", call);
        System.out.println();
    }
    @Override
    public void reply(){
        System.out.printf("[Model.Manager] We hope you'll enjoy our service" + "\n");
    }
    public int available() {
        System.out.println();
        speak();
        room_index = random.nextInt(51);
        nrGuests = random.nextInt(7);

        if (nrGuests > capacity) {
            System.out.printf("[Model.Manager] Oh, sorry. All rooms are booked" + "\n");
            return 0;
        } else {
            System.out.println("[Model.Manager] Your room is " + room_index + ". Take your keys");
            reply();
            guest.setReview(5);
            guest.setTips(5);
            guest.setSpending(70);
            porter.bag();
            return 1;
        }
    }

    public int mood_check() {
        room.isCleaned();
        if (room.isCleaned()) {
            System.out.println("[Manager] We're so sorry. We could order you food as an apology");
            System.out.println("[Manager] Would you accept it?");
            if (guest.answer) {
                System.out.println("[Guest] Fine, i'll except it");
                guest.setReview(1);
                guest.setTips(1);
                meal.createMeals();
                System.out.println("[Manager] Did you enjoy your meal?");
                if (guest.enjoy) {
                    System.out.println("[Guest] Yeah, thank you");
                    return 1;
                } else {
                    medical.help();
                    guest.setReview(-1);
                    setFine(10);
                    return 1;
                }
            } else {
                System.out.println("[Guest] No! It's unacceptable. I'm leaving");
                guest.setReview(-1);
                setFine(30);
                guest.setSpending((-70));
                return 0;
            }
        }
        return 1;
    }
}