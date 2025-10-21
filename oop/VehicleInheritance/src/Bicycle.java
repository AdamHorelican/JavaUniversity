import java.util.Objects;

public class Bicycle extends Vehicle
{
  private int gears;

  public Bicycle(String theOwner, double price, int numberOfGears){
    super(theOwner,price);
    this.gears = numberOfGears;
  }

  public void setGears(int numberOfGears){
    this.gears = numberOfGears;
  }

  public int getGears()
  {
    return gears;
  }
  public String toString(){
    return super.toString() + ", Number of gears: " + gears;
  }

  @Override public boolean equals(Object o)
  {
    if (o == null || getClass() != o.getClass())
      return false;
    if (!super.equals(o)){
      return false;
    }
    Bicycle other = (Bicycle) o;
    return gears == other.gears;
  }

  @Override public int hashCode()
  {
    return Objects.hashCode(gears);
  }
}
