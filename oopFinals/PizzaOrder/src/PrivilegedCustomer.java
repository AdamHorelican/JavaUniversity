public class PrivilegedCustomer extends Customer3
{
  private double discount;

  public PrivilegedCustomer(String name){
    super(name);
    this.discount = 0;
  }

  public double getDiscount()
  {
    return discount;
  }
  public void setDiscount(double percentage){
    this.discount = discount;
  }
}
