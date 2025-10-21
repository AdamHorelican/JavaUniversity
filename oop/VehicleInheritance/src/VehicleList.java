import java.util.ArrayList;

public class VehicleList
{
  private ArrayList<Vehicle> list;

  public VehicleList(){
    this.list = new ArrayList<>();
  }
  public int size(){
    return this.list.size();
  }

  public void add(Vehicle vehicle){
    this.list.add(vehicle);
  }
  public void remove(Vehicle vehicle){
    this.list.remove(vehicle);
  }
  public Vehicle get(int index){
    return list.get(index);
  }
  public int getNumberOfVehiclesByOwner(String owner){
    int result = 0;

    for (Vehicle v : list){
      if (v.getOwner().equals(owner)){
        result++;
      }
    }
    return result;
  }

  public ArrayList<Vehicle> getVehiclesByPrice(double maxPrice){
    ArrayList<Vehicle> result = new ArrayList<>();
    for (Vehicle v : list){
      if (v.getPrice() == maxPrice){
        result.add(v);
      }
    }
    return result;
  }
  public int getNumberOfCars(){
    int result = 0;
    for (Vehicle v : list){
      if (v instanceof Car){
        result++;
      }
    }
    return result;
  }

  public Car getCar(String regNo){
    for (Vehicle v : list){
      if (v instanceof Car && ((Car) v).getRegNo().equals(regNo)){
        return (Car) v;
      }
    }
    return null;
  }
  public ArrayList<Van> getLargeVans(int minLoad){
    ArrayList<Van> result = new ArrayList<>();

    for (Vehicle v : list){
      if (v instanceof Van){
        Van van = (Van) v;
        if (van.getMaxLoad()>minLoad){
          result.add(van);
        }
      }
    }
    return result;
  }
}
