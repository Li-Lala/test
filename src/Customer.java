import java.util.HashMap;
import java.util.Map;

// 顾客类
public class Customer {
    Map<Fruit, Integer> purchases;
  
    public Customer() {  
        purchases = new HashMap<>();
    }  
  
    public void buy(Fruit fruit, int quantity) {  
        purchases.put(fruit, purchases.getOrDefault(fruit, 0) + quantity);  
    }  
  
    public Map<Fruit, Integer> getPurchases() {  
        return purchases;  
    }  
}  