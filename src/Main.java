import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {

    public static void main(String[] args) {

        System.out.println("Magazin services");
       Item balls = new Item("Ball",ItemCondition.NEW,200,1);
       Item balls2 = new Item("Ball2",ItemCondition.NEW,1,1);
       Item chair = new Item("Chair",ItemCondition.NEW,11,1);
       Item zuckerDoze = new Item("Zucker doze",ItemCondition.NEW,11,1);



       FulfillmentCenter warehouseTest = new FulfillmentCenter("werehouseTest",1000);


       FulfillmentCenterContainer warehouses = new FulfillmentCenterContainer();
       warehouses.addCenter("warehouse",1000);
       warehouses.addCenter("warehouse3",1000);
       warehouses.addCenter("warehouse2",1000);

       FulfillmentCenter warehouse3= warehouses.getFulfilmentCenter("warehouse3");
       FulfillmentCenter warehouse= warehouses.getFulfilmentCenter("warehouse");
       warehouse3.addProduct(balls);



       warehouse3.summary();
       warehouses.summary();


//        System.out.println("Empty warehouse:");
//        List<FulfillmentCenter> centers = new ArrayList<>();
//       centers =  warehouses.findEmpty();
//       for(FulfillmentCenter centersElement: centers){
//           System.out.println(centersElement.warehouseName);
//       }
//
//
//
       warehouse.addProduct(balls);
       warehouse.addProduct(balls);

       warehouse.addProduct(balls2);
       warehouse.addProduct(chair);
        warehouse.addProduct(zuckerDoze);
//       warehouse.summary();
//
//        warehouse.getProduct(balls);
//       warehouse.summary();
//       Item temp = warehouse.search("Chair");
//       temp.print();
//
        //partiaSearch'
        System.out.println("partial");
        List<Item>items = warehouse.searchPartial("X");
        for(Item item : items)
        {
            System.out.println((item.name));
        }



//        //Count by condition:
//       int quantity = warehouse.countByCondition(ItemCondition.NEW);
//        System.out.println(quantity);
//
//        System.out.println("Sorted by amount:");
//        List<Item>sorted=new ArrayList<Item>();
//        sorted=warehouse.sortByAmount();
//        for(Item item : sorted)
//        {
//            System.out.println((item.name));
//        }
//
//        System.out.println("Sorted by name:");
//        List<Item>sortedByName=new ArrayList<Item>();
//        sortedByName= warehouse.sortByName();
//        for(Item item : sortedByName)
//        {
//            System.out.println((item.name));
//        }
//
//        System.out.println("Warehouses summary:");
//        warehouses.summary();
    }
}
