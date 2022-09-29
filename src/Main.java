public class Main {
    public static void main(String[] args) {
        Guest guest = new Guest();
        Manager manager = new Manager();
        Feedback feedback = new Feedback();
        Baggage baggage = new Baggage();
        Menu menu = new Menu();
        Cleaning cleaning = new Cleaning();
        Repair repair = new Repair();
        Bill bill = new Bill();
        Other other = new Other();
        manager.available(guest);
        baggage.bag(guest);
        cleaning.cleaningCheck(guest, menu, bill, feedback);
        repair.repairProblems(guest);
        other.things(guest, bill);
        bill.payBill(guest);
        feedback.feedbackCheck(guest, bill);
    }
}