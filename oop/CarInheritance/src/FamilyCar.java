public class FamilyCar extends CarDifferent
{
  private int seats;

  public FamilyCar(String licenseNo, double price, int seats){
    super(licenseNo, price);
    this.seats =seats;
  }

  public int getSeats()
  {
    return seats;
  }
  @Override
  public String getType(){
    return "Family Car";
  }
}
