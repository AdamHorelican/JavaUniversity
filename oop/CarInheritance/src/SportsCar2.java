public class SportsCar2 extends CarDifferent
{
  public SportsCar2(String licenseNo, double price){
    super(licenseNo, price);
  }

  @Override
  public String getType(){
    return "Sports Car";
  }
}
