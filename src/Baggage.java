import java.util.Random;

public class Baggage {
    private int weight;
    private boolean free_porter = true;

    public int getWeight() {
        return weight;
    }

    public boolean isFree_porter() {
        return free_porter;
    }

    public void setFree_porter(boolean free_porter) {
        this.free_porter = free_porter;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void bag(Guest guest){
        Random random = new Random();
        weight = random.nextInt(50);
        System.out.println("[Manager] Please, let us help you with the luggage");
        if(weight >= 30){
            free_porter = false;
            System.out.println("[Manager] It seems like it's too heavy, please wait until one more porter comes");
            guest.review--;
        }
        else{
            System.out.println("[Manager] Your luggage will be carried to your room");
            guest.review++;
            guest.tips++;
        }
    }
}
