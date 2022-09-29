import java.util.Random;

public class Guest {
    public int review = 0;
    private String name;
    private String food;
    public int wallet;
    public int check;
    public int tips;

    public int getTips() {

        return tips;
    }

    public int getReview() {

        return review;
    }

    public String getName() {

        return name;
    }

    public void setReview(int review) {

        this.review = review;
    }

    public void setName(String name) {

        this.name = name;
    }


    public void setCheck(int check) {
        this.wallet -= check;
    }

    public void setTips(int tips) {
        this.wallet -= tips;
    }

    public Guest(){
        Random random = new Random();
        this.name = name;
        this.wallet = random.nextInt(200);
    }
}

