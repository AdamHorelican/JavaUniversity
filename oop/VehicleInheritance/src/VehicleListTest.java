public class VehicleListTest
{
  public static void main(String[] args)
  {
    SportsCar sp1 = new SportsCar("Adam", 25000, "ABC222", 350);
    Van van1 = new Van("David", 70000, "JTC498", 4000);
    Bicycle bicycle1 = new Bicycle("Simon", 200, 8);
    Car car1 = new Car("Maros", 30000, "DR197");

    VehicleList vehicles = new VehicleList();

    vehicles.add(sp1);
    vehicles.add(van1);
    vehicles.add(bicycle1);
    vehicles.add(car1);

    System.out.println(vehicles.getCar("DR197"));
    System.out.println(vehicles.getLargeVans(3000));

  }
}
