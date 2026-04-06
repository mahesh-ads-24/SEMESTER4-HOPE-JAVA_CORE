
/*

E-commerce Order System
Design Sys where uses places an order, while ordering sys must handle failures using Exceptional handling 
1.prdt out of stock
2.payment failed
3.order processing failed

classes
Product(name,stock,price)
user(name,address)
order(prodt, user, quantity)
order_service(placeorder(order))

*/

class OutOfStockException extends Exception {
    public OutOfStockException(String msg) {
        super(msg);
    }
}

class PaymentFailedException extends Exception {
    public PaymentFailedException(String msg) {
        super(msg);
    }
}

class OrderProcessingException extends Exception {
    public OrderProcessingException(String msg) {
        super(msg);
    }
}

class Product{
    String name;
    int stock;
    double price;
    Product(String name, int stock, double price) {
        this.name = name;
        this.stock = stock;
        this.price = price;
    }
}
class User{
    String name;
    String address;
    User(String name, String address){
        this.name=name;
        this.address=address;
    }

}
class Order{
    Product product;
    User user;
    int quantity;
    Order(Product product, User user, int quantity){
        this.product=product;
        this.user=user;
        this.quantity=quantity;
    }
}
class OrderService {

    public void placeOrder(Order order)
            throws OutOfStockException, PaymentFailedException, OrderProcessingException {

        // 1. Check stock
        if ( order.product.stock<order.quantity) {
            throw new OutOfStockException("Product out of stock");
        }

        // 2. Payment simulation (random failure)
        if (Math.random()<0.4) {
            throw new PaymentFailedException("Payment failed");
        }

        // 3. Order processing simulation
        if (Math.random()<0.2) {
            throw new OrderProcessingException("Order processing failed");
        }

        // 4. Reduce stock if everything succeeds
        order.product.stock -= order.quantity;
        System.out.println("Order placed successfully for " + order.user.name);
    }
}

public class Task {
    public static void main(String[] args) {
        Product p=new Product("cap",70,45.50);
        User u1=new User("garcia", "chennai");
        Order o1=new Order(p,u1,78);
        OrderService os=new OrderService();
        try{
            os.placeOrder(o1);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}