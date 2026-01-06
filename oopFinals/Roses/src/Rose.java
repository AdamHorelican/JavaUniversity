public class Rose
{
  private String[] colours;

  public Rose(String colour){
    this.colours = new String[] { colour };

  }
  public Rose(String[] colours){
    this.colours = colours;
  }
  public int getNumberOfColours(){
    return colours.length;
  }
  public String[] getColours(){
    return colours;
  }
  public boolean hasColour(String colour){
    for (String c : colours){
      if (c.equals(colour)){
        return true;
      }
    }
    return false;
  }
}
