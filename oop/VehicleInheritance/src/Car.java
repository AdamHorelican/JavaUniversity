import java.util.Objects;

public class Car extends Vehicle
{
  private String regNo;

  public Car(String theOwner, double thePrice, String regNo){
    super(theOwner, thePrice);
    this.regNo = regNo;
  }

  public String getRegNo()
  {
    return regNo;
  }

  public void setRegNo(String regNo)
  {
    this.regNo = regNo;
  }

  public String toString(){
    return super.toString() + ", regNo: " + regNo;
  }

  @Override public boolean equals(Object o)
  {
    if (o == null || getClass() != o.getClass()){
      return false;
    }
    if (!super.equals(o)){
      return false;
    }
    Car other = (Car) o;
    return Objects.equals(regNo, other.regNo);
  }
}
