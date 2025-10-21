import java.util.Objects;

public class Tenant
{
  private String name;
  private MyDate rentedFrom;

  public Tenant(String name){
    this.name = name;
    this.rentedFrom = new MyDate();
  }

  public String getName()
  {
    return name;
  }
  public MyDate getRentedFrom(){
    return rentedFrom.copy();
  }

  public void setRentedFrom(MyDate rentedFrom)
  {
    this.rentedFrom = rentedFrom.copy();
  }

  @Override public boolean equals(Object o)
  {
    if (o == null || getClass() != o.getClass())
      return false;
    Tenant tenant = (Tenant) o;
    return Objects.equals(name, tenant.name) && Objects.equals(rentedFrom,
        tenant.rentedFrom);
  }

  @Override public int hashCode()
  {
    return Objects.hash(name, rentedFrom);
  }

  @Override public String toString()
  {
    return "Tenant{" + "name='" + name + '\'' + ", rentedFrom=" + rentedFrom
        + '}';
  }
}
