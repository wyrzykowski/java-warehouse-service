public class Item implements Comparable<Item> {
    String name; ItemCondition condition; double weight; int quantity;

    public Item(String _name, ItemCondition _condition, double _weight,int _quantity){
    name= _name;
    condition=_condition;
    weight = _weight;
    quantity = _quantity;
    }

    int getQuantity(){
        return this.quantity;
    }

   void print()
    {
        System.out.println("Product inforamtion: \n" +
                "name: " + this.name +"\n"+
                "condition: " + this.condition +"\n"+
                "weight: " + this.weight+"\n"+
                "quantity: " + this.quantity +"\n"+
                "");

    }
    @Override
    public int compareTo(Item o) {
            return name.compareTo(o.name);
    }
}
