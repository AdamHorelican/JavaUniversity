import java.util.ArrayList;

public class ApartmentComplex
{
  private String address;
  private ArrayList<Apartment> apartments;

  public ApartmentComplex(String address){
    this.address = address;
    this.apartments = new ArrayList<Apartment>();
  }

  public int getNumberOfApartments(){
    return apartments.size();
  }
  public void add(Apartment apartment){
    apartments.add(apartment);
  }
  public Apartment getApartment(int index){
    return apartments.get(index);
  }


  public Apartment getApartmentByNumber(int number){
    for (Apartment a : apartments){
      if (a.getNumber() == number){
        return a;
      }
    }
    return null;
  }

  public Apartment getApartmentByTenant(Tenant tenant){
    for (Apartment a : apartments){
      Tenant t = a.getTenant();
      if (t.equals(tenant)){
        return a;
      }
    }
    return null;
  }

  public Apartment getFirstAvailableApartment(){

    for (Apartment a : apartments){
      if (a.isAvailable()){
        return a;
      }
    }
    return null;
  }

  public ArrayList<Apartment> getAllAvailbaleApartments(){
    ArrayList<Apartment> result = new ArrayList<>();

    for(Apartment a : apartments){
      if (a.isAvailable()){
        result.add(a);
      }
    }
    return result;
  }
}
