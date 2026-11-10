//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product oreo = new Product(12444, "Oreo", 260, "food");
        Product milk = new Product(12448, "Milk", 160, "food");
        Product apple = new Product(12449, "apple", 220, "food");
        Product bread = new Product(12608, "bread", 160, "food");

        Product[] basket1 = {oreo, milk};
        Order order1 = new Order("Анна", basket1);

        Product[] basket2 = {oreo, milk};
        Order order2 = new Order("Таня", basket1);
        System.out.println();

        System.out.println("order1: " + order1);
        System.out.println(order1.equals(order2));

    }
}