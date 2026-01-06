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
  public boolean isAPureDogKennel(){
    for (int i = 0; i < pets.size(); i++)
    {
      if (!(pets.get(i) instanceof Dog)){
        return false;
      }
    }
    return true;
  }
  public Cat getAChippedCat(){
    for (int i = 0; i < pets.size(); i++)
    {
      if(pets.get(i) instanceof Cat && ((Cat) pets.get(i)).isChipped()){
        Cat ourCat = (Cat) pets.get(i);
        return ourCat;
      }
    }
    return null;
  }
  public ArrayList<String> getIdsBySpecies(String spieces){
    ArrayList<String> ourString = new ArrayList<>();
    for (int i = 0; i < pets.size(); i++)
    {
      if (pets.get(i).getSpecies().equals(spieces)){
        ourString.add(pets.get(i).getId());
      }

    }
    return ourString;
  }
  public Dog[] getDogsByBirthYear(int year){
    int count = 0;
    for (int i = 0; i < pets.size(); i++)
    {
      if (pets.get(i) instanceof Dog && pets.get(i).getBirthday().getYear() == year){
        count++;
      }
    }
    Dog[] dogs = new Dog[count];
    count = 0;
    for (int i = 0; i < pets.size(); i++)
    {
      if (pets.get(i) instanceof Dog && pets.get(i).getBirthday().getYear() == year){
        Dog dg = (Dog) pets.get(i);
        dogs[count] = dg;
        count++;
      }
    }
    return dogs;
  }
}
