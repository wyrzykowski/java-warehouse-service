import java.util.Comparator;


public class ComparatorAmount implements Comparator<Item>{

    @Override
    public int compare(Item temp1, Item temp2){
        int amount = temp1.getQuantity()-temp2.getQuantity();
        if(amount==0){
            return temp1.compareTo(temp2);
        }
        return amount;
    }
}
