package rocks.zipcode.assessment2.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Use a map to solve
 */
public class MonthConversion {
    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    HashMap<Integer, String> myMap = new HashMap<>();

    public void add(Integer monthNumber, String monthName) {
        this.myMap.put(monthNumber, monthName);

    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
        String[] newArray = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        Integer count = 1;
        for (String a : newArray) {
            this.myMap.put(count, a);
            count += 1;
        }

        return this.myMap.get(monthNumber);

    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public int getNumber(String monthName) {
        String[] newArray = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        Integer count = 1;
        for (String a : newArray) {
            this.myMap.put(count, a);
            count += 1;
        }
        for(Integer a : this.myMap.keySet()){
            if(this.myMap.get(a).equals(monthName)){
                return a;
            }
        }

        return (Integer)null;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        String[] newArray = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        Integer count = 1;
        for (String a : newArray) {
            this.myMap.put(count, a);
            count += 1;
        }
        return this.myMap.containsKey(monthNumber);
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        String[] newArray = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        Integer count = 1;
        for (String a : newArray) {
            this.myMap.put(count, a);
            count += 1;
        }
        return this.myMap.containsValue(monthName);
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {

        return this.myMap.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        String[] newArray = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        Integer count = 1;
        for (String a : newArray) {
            this.myMap.put(count, a);
            count += 1;
        }
        if(newArray[monthNumber-1] == monthName){
            this.myMap.put(monthNumber, monthName);
        }
    }
}
