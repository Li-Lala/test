import java.util.Map;

// 超市类
public class Supermarket {


    // 计算总价，包括促销活动  
    public static double calculateTotalPrice(Customer customer) {
        double total = 0;
        for (Map.Entry<Fruit, Integer> entry : customer.getPurchases().entrySet()) {
            Fruit fruit = entry.getKey();
            int quantity = entry.getValue();
            double pricePerJin = fruit.getPricePerJin();
            total += quantity * pricePerJin;
        }
        return total;
    }


    // 计算总价，c草莓打八折
    public static double calculateTotalPriceWithDis(Customer customer) {
        double total = 0;
        for (Map.Entry<Fruit, Integer> entry : customer.getPurchases().entrySet()) {
            Fruit fruit = entry.getKey();
            int quantity = entry.getValue();
            double pricePerJin = fruit.getPricePerJin();

            if (fruit.getName().equals("草莓")) {
                // 草莓打8折
                pricePerJin *= 0.8;
            }
            total += quantity * pricePerJin;
        }
        return total;
    }

    // 计算总价，c草莓打八折
    public static double calculateTotalPriceWithDiscount(Customer customer) {
        double total = 0;
        for (Map.Entry<Fruit, Integer> entry : customer.getPurchases().entrySet()) {
            Fruit fruit = entry.getKey();
            int quantity = entry.getValue();
            double pricePerJin = fruit.getPricePerJin();

            if (fruit.getName().equals("草莓")) {
                // 草莓打8折
                pricePerJin *= 0.8;
            }

            total += quantity * pricePerJin;
        }
        // 满100减10
        if (total >= 100) {
            total -= 10;
        }

        return total;
    }
}



