import java.util.ArrayList;

public class Person6
{
  private String name;
  private ArrayList<Car4> cars;
  private SportsCar5 sportsCar;


  public Person6(String name){
    this.name = name;
    this.cars = new ArrayList<>();
    this.sportsCar = null;
  }

  public String getName()
  {
    return name;
  }
  public int getNumberOfCarsOwned(){
    return cars.size();
  }
  public void buyACar(Car4 car){
    this.cars.add(car);
  }
  public void sellACar(Car4 car4){
    this.cars.remove(car4);
  }
  public void registerAsSportsDriver(SportsCar5 car){
    this.sportsCar = car;
  }
  public void sellTheOldestCar(){
    Car4 oldestCar = cars.get(0);
    for (int i = 1; i < getNumberOfCarsOwned(); i++)
    {
      if (oldestCar.getYear() > cars.get(i).getYear()){
        oldestCar = cars.get(i);
      }
    }
    cars.remove(oldestCar);
  }

  public Car4 getOwnedCarWithLargestEngine()
  {
    if (cars.isEmpty()) return null;

    Car4 best = cars.get(0);

    for (int i = 1; i < cars.size(); i++)
    {
      Car4 current = cars.get(i);
      if (current.getEngine().getSize() > best.getEngine().getSize())
      {
        best = current;
      }
    }

    return best;
  }

  public SportsCar5 getAllSportsCarOwned()
  {
    SportsCar5 best = null;

    for (Car4 c : cars)
    {
      if (c instanceof SportsCar5)
      {
        SportsCar5 sc = (SportsCar5) c;

        if (best == null || sc.getSpeed() > best.getSpeed())
        {
          best = sc;
        }
      }
    }

    return best;
  }


}
