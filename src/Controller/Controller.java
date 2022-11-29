package Controller;

import java.util.concurrent.TimeUnit;
import View.View;
import Model.Model;

public class Controller {
    View view = new View();
    Model model = new Model();

    public void runSimulation() throws InterruptedException {
        int n = 365;
        int nrDays = 0;
        for(;;) {
            for (int i = 1; i <= n; i++) {
                System.out.println();
                    model.dataLogic();

                view.startStats();
                view.dayCount(i);
                view.nrCustomers(model.getNrGuests() + 1);
                view.tipsStats(model.tips());
                view.fineStats(model.fines());
                view.profitStats(model.profit());
                view.incomeStats(model.income());
                view.giveReview(model.review());
                view.endStats();

                System.out.println();

                TimeUnit.SECONDS.sleep(1);
            }
        }
    }
}
