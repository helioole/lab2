package Model;

import java.util.Random;

public class Model {
    Random random = new Random();
    Guest guest = new Guest();
    Porter porter = new Porter(guest);
    Meal meal = new Meal();
    Room room = new Room();
    Medical medical = new Medical(guest);
    Manager manager = new Manager(room, guest, porter, medical, meal);
    Cleaner clean = new Cleaner(room, guest, medical, meal);
    Repair repair = new Repair(guest);
    Souvenir souvenir = new Souvenir(guest);
    Taxi taxi = new Taxi(guest);
    public int nrGuests = 0;

    public int getNrGuests() {
        return nrGuests;
    }

    public void setNrGuests() {
        this.nrGuests = random.nextInt(7);
    }

    public void dataLogic() {
        setNrGuests();
        for (int i = 0; i <= getNrGuests(); i++) {

            if (manager.available() != 0) ;
            {
                clean.cleaningCheck();
                if (manager.mood_check() != 0) {
                    repair.repairProblems();
                    taxi.waiting(souvenir);
                    System.out.println();
                }
            }
        }
    }


    public int profit(){
        return guest.spending;
    }

    public int income(){
        return guest.spending + guest.tips - Person.fine;
    }

    public int tips(){
        return guest.tips;
    }

    public int fines(){
        return Person.fine;
    }

    public int review(){
        return guest.review;
    }

}
