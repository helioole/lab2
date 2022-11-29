package Model;

import java.util.Random;

public class Taxi{
    public Guest guest;
    Random random = new Random();
    private int fair = 0;
    private int road = 0;
    private int sum = 0;
    public int minutes;

    public Taxi(Guest guest){
        this.guest = guest;
    }
    public void waiting(Souvenir souvenir){
        guest.check_trip();
        fair = random.nextInt(1, 7);
        road = random.nextInt(1,7);
        sum = fair * road;
        System.out.println("[Model.Guest] I need a taxi");
        if(guest.wantToTravel) {
            guest.setReview(1);
            minutes = random.nextInt(15);
            if (minutes == 0) {
                System.out.println("[Model.Manager] Your taxi has arrived");
                System.out.printf("[Model.Taxi driver] Model.Taxi will cost " + sum + " dollars" + "\n");
                guest.setReview(1);
                guest.setSpending(sum);
                guest.setTips(3);
            } else {
                System.out.printf("[Model.Manager] Model.Taxi will arrive in %d minutes. Please wait" + "\n", minutes);
            }
        }
        else{
            System.out.println("[Model.Manager] There are no free cars");
            System.out.println("[Model.Guest] I'll visit hotel's shop then");
            souvenir.things();
            guest.setReview(1);
        }
    }
}
