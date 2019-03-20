import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class FulfillmentCenter {
    String warehouseName;
    List<Item> items = new ArrayList<>();
    double maximumCapacity;// summary maximal weight capacity

    public FulfillmentCenter(String _warehouseName, double _maximumCapacity) {
        warehouseName = _warehouseName;
        maximumCapacity = _maximumCapacity;
    }

    public String getName(){
        return this.warehouseName;
    }
    public int getItemsQuantity(){
        return items.size();
    }

    void addProduct(Item item) {
        //getting actual warehouse weight
        double actualWarehouseWeight = 0;
        for (Item itemElement : items) {
            actualWarehouseWeight += itemElement.weight;
        }
        //if warehouse is full throw error
        if (item.weight + actualWarehouseWeight >= maximumCapacity) {
            throw new IllegalArgumentException("Warehouse is full!");
        } else {
            boolean finded = false;
            for (Item itemElement : items) {
                if (itemElement.name.equals(item.name)) {
                    finded = true;
                    itemElement.weight = item.weight + itemElement.weight;
                    itemElement.quantity = item.quantity + itemElement.quantity;
                }
            }
            if (!finded) {
                items.add(item);
            }
        }
    }

    void getProduct(Item item) {
        boolean found = false;
        for (Item itemElement : items) {
            if (itemElement.name.equals(item.name)) {
                found = true;
                if (--itemElement.quantity <= 0) {
                    items.remove(itemElement);
                }
            }
        }
        if (found == false) {
            throw new IllegalArgumentException("This item not exist in warehouse!");
        }
    }

    void removeProduct(Item item) {
        items.remove(item);
    }

    void summary() {
        for (Item itemElement : items) {
            itemElement.print();
        }
    }

    double getActualWeight(){
        double actualWarehouseWeight = 0;
        for (Item itemElement : items) {
            actualWarehouseWeight +=itemElement.weight;
        }
        return actualWarehouseWeight;
    }

    Item search(String name) {
        Item temp = new Item(name, ItemCondition.NEW, 1, 1);
        for (Item itemElement : items) {
            int a = itemElement.compareTo(temp);
            if (0 == a) {
                return itemElement;
            }
        }
        throw new IllegalArgumentException("Item not exist!");
    }

    public List<Item> searchPartial(String temp){
        List<Item> buff=new ArrayList<Item>();

        Collections.sort(items);
        for(int i = 0; i<items.size(); i++){
            if(items.get(i).name.contains(temp)){
                buff.add(items.get(i));
            }
        }
        return buff;
    }

    public int countByCondition(ItemCondition temp) {
        int counter = 0;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).condition == temp) {
                counter++;
            }
        }
        return counter;
    }

    public List<Item> sortByName(){
        List <Item> temp = new ArrayList<Item>();
        for(int i = 0; i<items.size(); i++){
            temp.add(items.get(i));
        }

        Collections.sort(temp);

        return temp;
    }

    public List<Item> sortByAmount(){
        List <Item> temp = new ArrayList<Item>();
        for(int i = 0; i<items.size(); i++){
            temp.add(items.get(i));
        }

        Collections.sort(temp, new ComparatorAmount());

        return temp;
    }


    public Item max(){
        List <Item> temp = new ArrayList<Item>();
        for(int i = 0; i<items.size(); i++){
            temp.add(items.get(i));
        }

        Item buff = Collections.max(temp, new ComparatorAmount());
        return buff;
    }


}
