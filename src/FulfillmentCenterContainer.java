import java.util.*;
import java.util.Map.Entry;

public class FulfillmentCenterContainer {
    Map<String, FulfillmentCenter> warehouses = new TreeMap<>();


    public void addCenter(String name, double capacity){
        FulfillmentCenter temp = new FulfillmentCenter(name, capacity);
        this.warehouses.put(name,temp);
    }
    public void removeCenter(String name){
        if(!warehouses.containsKey(name)) {
            throw new IllegalArgumentException("Item not exist!");
        }
        warehouses.remove(name);
    }
    public FulfillmentCenter getFulfilmentCenter(String name){
       return warehouses.get(name);
    }

   public void summary(){
       Set<Entry<String, FulfillmentCenter>> entrySet = warehouses.entrySet();

       for(Entry<String, FulfillmentCenter> entry: entrySet) {
           System.out.println(entry.getKey() + ": " + ((entry.getValue().getActualWeight()/entry.getValue().maximumCapacity)*100+"%"));
       }
   }

    public List<FulfillmentCenter> findEmpty (){
        Set<Entry<String, FulfillmentCenter>> entrySet = warehouses.entrySet();
        List<FulfillmentCenter> centers = new ArrayList<>();
        for(Entry<String, FulfillmentCenter> entry: entrySet) {
            if(entry.getValue().getItemsQuantity()<=0) centers.add(entry.getValue());
        }
        return centers;
   }


}
