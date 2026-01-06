public class RedRose extends Rose
{
  private boolean darkRed;

  public RedRose(boolean darkRed){
    super("red");
    this.darkRed = darkRed;
  }
  public boolean isDarkRed(){
    return darkRed;
  }

}
