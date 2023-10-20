package design_patterns;

import java.util.ArrayList;
import java.util.List;

public class CommandUsage {

    public static void main(String[] args) {
        Stock stock = new Stock("Nestle Coffee", 30);
        BuyStockOrder buyStock = new BuyStockOrder(stock);
        SellStockOrder sellStock = new SellStockOrder(stock);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);
        broker.placeOrder();
    }

}

interface Order {

    void execute();

}

class Stock {
    String name;
    int quantity;

    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void sell() {
        System.out.println("Stock with name " + name + " is sold in quantity " + quantity);
    }

    public void buy() {
        System.out.println("Stock with name " + name + " is bought in quantity " + quantity);
    }
}

class BuyStockOrder implements Order {

    Stock stock;
    public BuyStockOrder(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}

class SellStockOrder implements Order {

    Stock stock;
    public SellStockOrder(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}

class Broker {

    List<Order> orders = new ArrayList<>();

    public void takeOrder(Order order) {
        orders.add(order);
    }

    public void placeOrder() {
        for (Order order: orders) {
            order.execute();
        }
    }


}

