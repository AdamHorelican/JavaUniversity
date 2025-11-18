public class VanDifferent extends CarDifferent
{
  private int capacity;

  public VanDifferent(String licenseNo, double price, int capacity){
    super(licenseNo, price);
    this.capacity = capacity;
  }

  public int getCapacity()
  {
    return capacity;
  }
  @Override
  public String getType(){
    return "Van";
  }
}
