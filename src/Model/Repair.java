package Model;

import java.util.ArrayList;
import java.util.Random;

public class Repair{
    public Guest guest;
    Random random = new Random();
    private ArrayList<String> stuff = new ArrayList<String>();
    private ArrayList<String> price = new ArrayList<String>();
    private String rep1;
    private String rep2;
    public boolean isBroken;
    public boolean before;

    public Repair(Guest guest){
        this.guest = guest;
    }

    public boolean check_isBroken(){
        isBroken = random.nextBoolean();
        return isBroken;
    }

    public boolean check_before(){
        before = random.nextBoolean();
        return before;
    }

    public void repairProblems(){
        check_isBroken();
        check_before();

        stuff.add("TV");
        stuff.add("bed");
        stuff.add("Fridge");

        price.add("45");
        price.add("50");
        price.add("70");


        rep1 = stuff.get(random.nextInt(stuff.size()));
        rep2 = price.get(random.nextInt(price.size()));


        if(isBroken){
            System.out.println("[Model.Guest] Oh, there is " + rep1 + " broken");
            if(before){
                System.out.println("[Model.Manager] Oh, we'll replace it immediately");
                guest.setReview(5);
                guest.setTips(5);
            }
            else{
                System.out.println("[Model.Manager] We check each of our rooms before guest's arriving");
                System.out.print("[Model.Manager] Unfortunately, you'll have to pay for it " + rep2 + " dollars" + "\n");
                stuff.clear();
                price.clear();
                int result = Integer.parseInt(rep2);
                guest.setSpending(result);
                guest.setReview(-1);
            }
        }
    }
}
