import java.util.ArrayList;
import java.util.Random;

public class Repair {
    private boolean isBroken;
    private boolean before;
    private ArrayList<String> stuff = new ArrayList<String>();
    private String rep;


    public boolean isBroken() {

        return isBroken;
    }

    public boolean isBefore() {

        return before;
    }

    public void setBroken(boolean broken) {

        isBroken = broken;
    }

    public void setBefore(boolean before) {

        this.before = before;
    }

    public void repairProblems(Guest guest){
        stuff.add("TV");
        stuff.add("bed");
        stuff.add("Fridge");

        Random random = new Random();
        isBroken = random.nextBoolean();
        before = random.nextBoolean();

        String rep = stuff.get(random.nextInt(stuff.size()));

        if(isBroken){
            System.out.println("[Guest] Oh, there " + rep + " is broken");
            guest.review--;
            if(before){
                System.out.println("[Manager] Oh, we'll replace it immediately");
                guest.review++;
                guest.tips++;
            }
            else{
                System.out.println("[Manager] We check each of our rooms before guest's arriving");
                System.out.println("[Manager] Unfortunately, you'll have to pay for it");
                guest.review--;
                guest.check -=30;
            }
        }
    }
}
