import java.util.Objects;

public class Van extends Car
{
  private int maxLoad;

  public Van(String theOwner, double thePrice, String regNo, int maxLoad){
    super(theOwner,thePrice,regNo);
    this.maxLoad = maxLoad;
  }

  public int getMaxLoad()
  {
    return maxLoad;
  }

  @Override public String toString()
  {
    return super.toString() + ", max load: " + maxLoad;
  }

  @Override public boolean equals(Object o)
  {
    if (o == null || getClass() != o.getClass())
      return false;
    if (!super.equals(o))
      return false;
    Van other = (Van) o;
    return maxLoad == other.maxLoad;
  }

  @Override public int hashCode()
  {
    return Objects.hashCode(maxLoad);
  }
}
