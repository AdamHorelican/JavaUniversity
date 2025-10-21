public class ApartmentComplexTest
{

  public static void main(String[] args)
  {
    Tenant t = new Tenant("Adam");
    MyDate d = new MyDate();
    Apartment a = new Apartment(12);
    a.rentTo(t,d);
    System.out.println(a.isAvailable());
    System.out.println(a.toString());

    ApartmentComplex ac = new ApartmentComplex("Myjava");
    ac.add(a);
    ac.add(a);
    System.out.println(ac.getAllAvailbaleApartments());
  }

}
