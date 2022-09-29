public class Bill {
    public int payment = 0;
    public boolean lost;

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public void payBill(Guest guest){
        payment += guest.check;
        payment += (guest.tips)*5;
        System.out.println("[CHECK] You have to pay " + payment + " dollar");

        if(payment > guest.wallet){
            lost = true;
            System.out.println("[Client] Oh, I can't pay");
            System.out.println("Client ray away without paying...");
        }
    }
}
