package Model;

import java.util.Random;

public class Guest{
    Random random = new Random();
    public static int review = 0;
    public static int tips = 0;
    public static int spending = 0;
    public int weight;
    public boolean answer;
    public boolean enjoy;
    public int temperature;
    public  boolean isIll;
    public boolean wantToTravel;

    public boolean check_isIll(){
        isIll = random.nextBoolean();
        return isIll;
    }

    public boolean check_trip(){
        wantToTravel = random.nextBoolean();
        return wantToTravel;
    }

    public static void setTips(int tips) {
        Guest.tips += tips;
    }


    public static void setSpending(int spending) {
        Guest.spending += spending;
    }

    public static void setReview(int review) {
        Guest.review += review;
    }

    public Guest(){
        this.weight = random.nextInt(60);
        this.answer =  random.nextBoolean();
        this.enjoy =  random.nextBoolean();
        this.temperature = random.nextInt(36,40);
    }
}