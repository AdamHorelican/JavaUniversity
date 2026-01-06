import java.util.ArrayList;

public class Kennel
{
  private OwnerOfKennel owner;
  private ArrayList<Pet> pets;

  public Kennel(OwnerOfKennel owner){
    this.owner = owner;
    this.pets = new ArrayList<>();
  }
  public void SellTo(OwnerOfKennel newOwner){
  this.owner = newOwner;
  }
  public void addPet(Pet pet){
    this.pets.add(pet);
  }
  public Pet hasPet(String id){
    for (int i = 0; i < pets.size(); i++)
    {
      if(pets.get(i).getId().equals(id)){
        return pets.get(i);
      }
    }
    return null;
  }
  public Pet sellPet(String id){
    for (int i = 0; i < pets.size(); i++)
    {
      if (pets.get(i).getId().equals(id)){
        Pet sold = pets.get(i);
        pets.remove(pets.get(i));
        return sold;
      }
    }
    return null;
  }
  public ArrayList<Pet> getPetsByBirthDates(int year, int month, int day){
    ArrayList<Pet> petss = new ArrayList<>();

    for (int i = 0; i < pets.size(); i++)
    {
      Date8 temp = pets.get(i).getBirthday();
      if (temp.getDay() == day && temp.getMonth() == month && temp.getYear() == year){
        petss.add(pets.get(i));
      }
    }
    return petss;
  }
}
