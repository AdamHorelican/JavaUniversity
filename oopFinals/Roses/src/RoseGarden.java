import java.util.ArrayList;

public class RoseGarden
{
  private Address4 address;
  private ArrayList<Rose> roses;

  public RoseGarden(Address4 address){
    this.address = address;
    this.roses = new ArrayList<>();
  }

  public Address4 getAddress()
  {
    return address;
  }
  public int getNumberOfRoses(){
    return roses.size();
  }
  public ArrayList<RedRose> getAllDarkRedRoses(){
    ArrayList<RedRose> redrosesArray = new ArrayList<>();

    for (int i = 0; i < roses.size(); i++)
    {
      if (roses.get(i) instanceof RedRose && ((RedRose) roses.get(i)).isDarkRed()){
        RedRose rr = (RedRose) roses.get(i);
        redrosesArray.add(rr);
      }
    }
    return redrosesArray;
  }
  public int getNumberOfDoubleColourRosesByColour(String colour){
    int count = 0;

    for (int i = 0; i < roses.size(); i++)
    {
      if (roses.get(i) instanceof MultiColourRose && roses.get(i).getNumberOfColours() == 2 && roses.get(i).hasColour(colour)){
        count++;
      }
    }
    return count;
  }
  public ArrayList<Rose> pickBouqueteByColour(String colour, int size){
    ArrayList<Rose> bouquet = new ArrayList<>();

    for (Rose r : roses) {
      if (r.hasColour(colour)) {
        bouquet.add(r);
        if (bouquet.size() == size) {
          break;
        }
      }
    }

    return bouquet;
  }
}
