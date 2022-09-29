public class Feedback {


    public void feedbackCheck(Guest guest, Bill bill) {
        if(guest.review < 0 ) {
            System.out.println("[REVIEW] This is not the best place to stay at");
        }
        else if(bill.lost){
            System.out.println("[REVIEW] The hotel lost " + bill.payment);
        }
        else{
            System.out.println("[REVIEW] I enjoyed everything. 5 stars!");
        }
    }
}

