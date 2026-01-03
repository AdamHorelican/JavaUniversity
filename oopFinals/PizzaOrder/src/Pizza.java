public class Pizza
{
  private String name;
  private double initialPrice;
  private int numberOfToppings;
  private static final int MAX_NUMBER_OF_TOPPINGS = 5;
  private Topping[] toppings;


  public Pizza(String name, double initialPrice){
    this.name = name;
    this.initialPrice = initialPrice;
    this.numberOfToppings = 0;
    this.toppings = new Topping[MAX_NUMBER_OF_TOPPINGS];
  }

  public String getName()
  {
    return name;
  }

  public int getNumberOfToppings(){
    return numberOfToppings;
  }
  public void addTopping(Topping topping){
    if (numberOfToppings == MAX_NUMBER_OF_TOPPINGS){
      throw new RuntimeException("Max Number of toppings reached");
    }
    toppings[numberOfToppings] = topping;
    numberOfToppings++;

  }
  public void removeTopping(String toppingName){
    int index = -1;
    for (int i = 0; i < numberOfToppings; i++)
    {
      if (toppings[i].getName().equals(toppingName)){
        index = i;
        break;
      }
    }
    if (index == -1){
      throw new RuntimeException("Not in list");
    }

    for (int i = index; i < numberOfToppings-1; i++)
    {
      toppings[i] = toppings[i+1];
    }
    toppings[numberOfToppings-1] = null;
    numberOfToppings--;
  }
  public double getTotalPrice(){
    double count = initialPrice;
    for (int i = 0; i < numberOfToppings; i++)
    {
      count += toppings[i].getPrice();
    }
    return count;
  }
}
