package rocks.zipcode.assessment2.collections;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    /**
     * @param strings list of strings to add / remove / fetch from
     */
    private Map<String, Integer> myMap;
    public Inventory(List<String> strings) {
        Integer number = 1;
        for(String a : strings){
            if(this.myMap.containsKey(a)){
                Integer count = this.myMap.get(a);
                this.myMap.put(a, number + count);
            }
            else{
                this.myMap.put(a, number);
            }
        }
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        this.myMap = new LinkedHashMap<>();
    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        Integer initialCount = 1;
        if(this.myMap.containsKey(item)){
            Integer count = myMap.get(item);
            this.myMap.put(item, count+1);
        }
        else{
            this.myMap.put(item, initialCount);
        }

    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        this.myMap.remove(item);
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        return this.myMap.get(item);
    }
}
