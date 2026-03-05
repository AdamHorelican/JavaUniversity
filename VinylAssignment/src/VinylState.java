public interface VinylState
{


  public void available();
  public void borrowed();
  public void reserved();
  public void borrowedReserved();

  public String getState();


}
