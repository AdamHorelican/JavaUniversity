public class PizzaOrderTest
{
  public static void main(String[] args)
  {
    PrivilegedCustomer pc1 = new PrivilegedCustomer("anton");
    pc1.setDiscount(20);

    Topping topping1 = new Topping("Corn", 1);
    Topping topping2 = new Topping("Bacon", 2);
    Topping topping3 = new Topping("Cheese", 2);

    Pizza pizza = new Pizza("Margharita", 7);
    pizza.addTopping(topping1);
    pizza.addTopping(topping2);
    pizza.addTopping(topping3);
    System.out.println(pizza.getNumberOfToppings());
    System.out.println(pizza.getTotalPrice());

    PizzaOrder pizzaOrder = new PizzaOrder(pc1);
    pizzaOrder.addPizza(pizza);
    System.out.println(pizzaOrder.getTotalPrice());
    System.out.println(pizzaOrder.getCustomer());
  }
}
