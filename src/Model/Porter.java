package Model;

public class Porter extends Person{
    public Guest guest;
    private String porter = "[Model.Porter] ";

    public Porter(Guest guest){
        this.guest = guest;
    }

    @Override
    public void speak(){
        System.out.printf("%sMy name is %s. And I'm here to help you", porter, male);
        System.out.println();
    }

    @Override
    public void reply(){
        System.out.printf("%sHave a nice vacation", porter);
        System.out.println();
    }
    public void bag(){
        System.out.printf("%sPlease, let me help you with the luggage", porter);
        System.out.println();
        speak();
        if(guest.weight >= 30){
            System.out.printf("%sIt seems like it's too heavy, please wait until one more porter comes", porter);
            System.out.println();
            guest.setTips(10);
            guest.setReview(3);
        }
        else{
            System.out.printf("%sI'll carry your bags to your room", porter);
            System.out.println();
            guest.setTips(5);
            guest.setReview(3);
        }
    }

}
