/**
 * @author Ljh
 * @version 1.0
 * @date 2024/2/24 18:04
 * @describe
 */
public class Main {
    public static void main(String[] args) {
        // 创建水果对象
        Fruit apple = new Fruit("苹果", 8);
        Fruit strawberry = new Fruit("草莓", 13);
        Fruit mango = new Fruit("芒果", 20);
        // 创建顾客对象并购买水果

        // 顾客A
        Customer customerA = new Customer();
        customerA.buy(apple, 3); // 购买3斤苹果
        customerA.buy(strawberry, 2); // 购买2斤草莓
        // 计算总价
        double totalPriceA = Supermarket.calculateTotalPrice(customerA);
        System.out.println("顾客A购买的商品总价：" + totalPriceA + " 元");


        // 顾客B
        Customer customerB = new Customer();
        customerB.buy(apple, 3); // 购买3斤苹果
        customerB.buy(strawberry, 2); // 购买2斤草莓
        customerB.buy(mango, 2); // 购买2斤芒果
        // 计算总价
        double totalPriceB = Supermarket.calculateTotalPrice(customerB);
        System.out.println("顾客B购买的商品总价：" + totalPriceB + " 元");


        // 顾客C
        Customer customerC = new Customer();
        customerC.buy(apple, 3); // 购买3斤苹果
        customerC.buy(strawberry, 2); // 购买2斤草莓
        customerC.buy(mango, 2); // 购买2斤芒果
        // 计算总价
        double totalPriceC = Supermarket.calculateTotalPriceWithDis(customerC);
        System.out.println("顾客C购买的商品总价：" + totalPriceC + " 元");


        // 顾客D
        Customer customerD = new Customer();
        customerD.buy(apple, 3); // 购买3斤苹果
        customerD.buy(strawberry, 2); // 购买2斤草莓
        customerD.buy(mango, 4); // 购买4斤芒果
        // 计算总价
        double totalPriceD = Supermarket.calculateTotalPriceWithDiscount(customerD);
        System.out.println("顾客D购买的商品总价：" + totalPriceD + " 元");
    }
}