import java.util.Random;

public class Cleaning {
    private boolean answer;
    private boolean isCleaned;

    public boolean isCleaned() {
        return isCleaned;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setCleaned(boolean cleaned) {
        isCleaned = cleaned;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }

    public void cleaningCheck(Guest guest, Menu menu, Bill bill, Feedback feedback){
        Random random = new Random();
        isCleaned = random.nextBoolean();
        if(isCleaned){
            System.out.println("[Guest] The room is so clean");
            guest.review++;
            guest.tips++;
        }
        else{
            System.out.println("[Guest] The room is so dirty. Such a bad hotel");
            guest.review--;
            System.out.println("[Manager] Oh, we're so sorry. We can make order you food as an apology");
            System.out.println("[Manager] Would you accept it?");
            answer = random.nextBoolean();
            if(answer){
                System.out.println("[Guest] Fine, i'll except it");
                guest.review++;
                guest.tips++;
                menu.createMeals();
            }
            else{
                System.out.println("[Guest] No! It's unacceptable. I'm leaving");
                        guest.review -= 5;
                        guest.tips ++;
                        bill.lost = true;
                        feedback.feedbackCheck(guest, bill);
                        System.exit(0);
            }

        }
    }
}
