import java.util.ArrayList;

public class PizzaOrder
{
  private ArrayList<Pizza> pizzas;
  private Customer4 customer;

  public PizzaOrder(Customer4 customer){
    this.customer = customer;
    this.pizzas = new ArrayList<Pizza>();
  }

  public Customer4 getCustomer()
  {
    return customer;
  }
  public int getNumberOfPizzas(){
    return pizzas.size();
  }
  public void addPizza(Pizza pizza){
    pizzas.add(pizza);
  }
  public Pizza getPizza(int index){
    return pizzas.get(index);
  }
  public Pizza getPizza(String pizzaName){
    for (int i = 0; i < pizzas.size(); i++)
    {
      if(pizzas.get(i).getName().equals(pizzaName)){
        return pizzas.get(i);
      }
    }
    return null;
  }
  public double getTotalPrice(){
    double  count = 0;
    for (int i = 0; i < pizzas.size(); i++)
    {
      count += pizzas.get(i).getTotalPrice();
    }

    if (customer instanceof PrivilegedCustomer){
      PrivilegedCustomer pc = (PrivilegedCustomer) customer;
      count = count * (1-pc.getDiscount() /100);
    }
    return count;
  }
}
