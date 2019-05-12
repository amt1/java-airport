import java.util.ArrayList;
import java.util.HashMap;

public class Passenger {

    private String name;
    private HashMap<BaggageType, Integer> baggageTally;
    private ArrayList<Baggage> baggageItems;
    // private Ticket ticket;

    public Passenger(String name) {
        this.name = name;
        this.baggageTally = new HashMap<>();
        this.baggageItems = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public HashMap<BaggageType, Integer> getBaggage() {
        return baggageTally;
    }

    public void updateBaggageCount(Baggage baggageItem, int numberChange){
        Integer count = 1;
        BaggageType btype = baggageItem.getTransportationType();
        if (baggageTally.containsKey(btype)) count = baggageTally.get(btype) + numberChange;
        if (count <= 0 ) {
            baggageTally.remove(btype);
        } else {
            baggageTally.put(btype, count);
        }
    }


    public void listBaggageTypes() {
        baggageTally.forEach((key,value) -> System.out.println(key + " = " + value));
    }

    public Baggage checkInBaggage(String baggageName) {
        for (Baggage baggage : baggageItems) {
            if (baggage.getName() == baggageName) {
                baggageItems.remove(baggage);
                updateBaggageCount(baggage, -1);
                return baggage;
            }
        }
        return null;
    }

    public void addBaggage(Baggage baggage) {
        baggageItems.add(baggage);
        updateBaggageCount( baggage, +1);
    }

    public int countBaggage(){
        return baggageItems.size();
    }
}
