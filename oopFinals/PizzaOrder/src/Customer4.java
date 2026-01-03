public class Customer4
{
  private String name;

  public Customer4(String name){
    this.name = name;
  }
  public String getName(){
    return name;
  }

  @Override public String toString()
  {
    return "Customer4{" + "name='" + name + '\'' + '}';
  }
}
