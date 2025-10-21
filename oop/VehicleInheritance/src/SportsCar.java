import java.util.Objects;

public class SportsCar extends Car
{
  private int maxVelocity;

  public SportsCar(String theOwner, double thePrice, String regNo, int maxVelocity){
    super(theOwner, thePrice, regNo);
    this.maxVelocity = maxVelocity;
  }

  public int getMaxVelocity()
  {
    return maxVelocity;
  }

  public void setMaxVelocity(int maxVelocity)
  {
    this.maxVelocity = maxVelocity;
  }

  @Override public String toString()
  {
    return super.toString() + ", max velocity: " + maxVelocity;
  }

  @Override public boolean equals(Object o)
  {
    if (o == null || getClass() != o.getClass())
      return false;
    if (!super.equals(o))
      return false;
    SportsCar sportsCar = (SportsCar) o;
    return maxVelocity == sportsCar.maxVelocity;
  }

  @Override public int hashCode()
  {
    return Objects.hashCode(maxVelocity);
  }
}
