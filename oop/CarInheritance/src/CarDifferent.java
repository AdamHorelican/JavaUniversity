public abstract class CarDifferent
{
  private String licenseNo;
  private double price;
  private Customer3 rentedTo;


  public CarDifferent(String licenseNo, double price){
    this.licenseNo = licenseNo;
    this.price = price;
  }

  public String getLicenseNo()
  {
    return licenseNo;
  }

  public double getPrice()
  {
    return price;
  }
  public void setPrice(double price){
    this.price = price;
  }

  public abstract String getType();

  public Customer3 getRentedTo(){
    return rentedTo;
  }
  public void setRentedTo(Customer3 customer){
    this.rentedTo = customer;
  }
  public boolean isAvailable(){
    if (rentedTo != null){
      return false;
    }
    else {
      return true;
    }
  }
}
