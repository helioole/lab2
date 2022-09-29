import java.util.Random;
import java.util.*;

public class Other {
    //other guests' needs such as
    //medical services, taxi, souvenir
    private  boolean isIll;
    private boolean trip;
    private boolean wants;
    private int index;
    Map<String, Integer> map = new HashMap<>();

    public boolean isIll() {
        return isIll;
    }

    public void setIll(boolean ill) {
        isIll = ill;
    }

    public void things(Guest guest, Bill bill){
        Random random = new Random();
        isIll = random.nextBoolean();
        trip = random.nextBoolean();
        wants = random.nextBoolean();

        map.put("Statue", 55);
        map.put("Pot", 13);
        map.put("Picture", 33);

        Set<String> keySet = map.keySet();
        List<String> keyList = new ArrayList<>(keySet);

        int size = keyList.size();
        int randIdx = new Random().nextInt(size);

        String randomKey = keyList.get(randIdx);
        Integer randomValue = map.get(randomKey);

        if(isIll){
            System.out.println("[Client] I need a medical service");
            guest.check += 50;
        }
        if(trip){
            System.out.println("[Client] I need a taxi");
            guest.check += 50;
        }

        if(wants){
            System.out.println("[Client] I would like to buy a souvenir");
            for(Map.Entry mp : map.entrySet()){
                System.out.println("[OPTION] Souvenir: " + mp.getKey() + " Price: " + mp.getValue());
            }
            System.out.println("[Client] I'll pick " + randomKey);
            bill.payment += randomValue;

        }
    }

}
