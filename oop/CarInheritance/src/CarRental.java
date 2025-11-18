import java.util.ArrayList;

public class CarRental
{
  private String companyName;
  private String address;
  private ArrayList<CarDifferent> carsForRent;

  public CarRental(String companyName, String address){
    this.companyName = companyName;
    this.address = address;
    this.carsForRent = new ArrayList<>();
  }

  public String getCompanyName()
  {
    return companyName;
  }

  public String getAddress()
  {
    return address;
  }
  public int getNumberOfCars(){
    return carsForRent.size();
  }
  public CarDifferent getCar(int index){
    try {
      return carsForRent.get(index);
    }
    catch (IndexOutOfBoundsException e){
      System.out.println("Index out of bounds");
      return null;
    }
  }
  public void addCar(CarDifferent car){
    this.carsForRent.add(car);
  }
}
