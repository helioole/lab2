package Model;

import java.util.ArrayList;
import java.util.Random;

public class Medical {
    public Guest guest;
    Random random = new Random();
    private ArrayList<String> meds = new ArrayList<String>();
    private String med;

    public Medical(Guest guest){
        this.guest = guest;
    }

    public void hasFever(){

        meds.add("Paracetamol");
        meds.add("Rinza");
        meds.add("Panadol");

        String rep = meds.get(random.nextInt(meds.size()));
        System.out.println("[Doctor] Please, take " + med);

        meds.clear();
    }
    public void help(){
        guest.check_isIll();
        if(guest.isIll) {
            System.out.println("[Model.Guest] Ugh, I don't feel well, I need a doctor");
            if (guest.temperature >= 38) {
                hasFever();
                guest.setReview(5);
            } else {
                System.out.println("[Doctor] You don't have any symptoms. You just need to rest");
            }
        }
    }
}
