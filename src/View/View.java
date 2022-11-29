package View;

public class View{

    public void startStats(){
        System.out.println();
        System.out.println("################################");
    }
    public void dayCount(int day){
        System.out.printf("Day: %d" + "\n", day);
    }
    public void nrCustomers(int nr){
        System.out.printf("Guests in the hotel: %d" + "\n", nr);
    }
    public void tipsStats(int tips){
        System.out.printf("Tips: %d" + " dollars" +"\n", tips);
    }

    public void fineStats(int fine){
        System.out.printf("Fines: %d" + " dollars" +"\n", fine);
    }
    public void profitStats(int profit){
        System.out.printf("Profit: %d" + " dollars" +"\n", profit);
    }

    public void incomeStats(int income) {
        System.out.printf("Overall income: %d" + " dollars" + "\n", income);
    }

    public void giveReview(int review){
        if(review <= 75){
            System.out.println("[RANK] ⭐");
        }
        if(review <= 125 && review >= 75){
            System.out.println("[RANK] ⭐⭐");
        }
        if(review >  125 && review <= 175){
            System.out.println("[RANK] ⭐⭐⭐");
        }
        if(review > 175 && review <= 300){
            System.out.println("[RANK] ⭐⭐⭐⭐");
        }
        if(review > 300){
            System.out.println("[RANK] ⭐⭐⭐⭐⭐");
        }
    }

    public void endStats(){
        System.out.println("################################");
    }
}
