import java.util.Arrays;
import java.util.Objects;

public class Order {
    public String customer;
    public Product[] basket;
 public Order(String customer, Product[] basket){
     this.basket = basket != null ? Arrays.copyOf(basket, basket.length) : null;
     this.customer = customer;
 }
    @Override
    public String toString(){
        return "Order{customer='" + customer + "', basket=" + Arrays.toString(basket) + '}';
    }

    @Override
    public boolean equals(Object o) {
     if (this == o) return true;
     if (o == null || getClass() != o.getClass()) {
            return false;
        }
     Order order = (Order) o;
     return Objects.equals(customer, order.customer) && Arrays.equals(basket, order.basket);


    }
}
