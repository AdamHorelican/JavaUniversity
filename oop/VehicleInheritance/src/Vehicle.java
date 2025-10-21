public class Vehicle extends Object
{
  private String owner;
  private double price;

  public Vehicle(String owner, double price){
    super();
    this.owner = owner;
    this.price = price;
  }

  public String getOwner()
  {
    return owner;
  }

  public void setOwner(String owner)
  {
    this.owner = owner;
  }

  public double getPrice()
  {
    return price;
  }

  public void setPrice(double price)
  {
    this.price = price;
  }

  @Override public String toString()
  {
    return "Vehicle{" + "owner='" + owner + '\'' + ", price=" + price + '}';
  }

  public boolean equals(Object o){
    if (o == null || o.getClass() != getClass()){
      return false;
    }
    Vehicle other = (Vehicle) o;
    return owner.equals(other.owner) && price == other.price;
  }
}
