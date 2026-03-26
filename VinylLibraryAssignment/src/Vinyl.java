public class Vinyl
{
  private String title;
  private String artist;
  private int releaseYear;
  private VinylState currentState;
  private String borrowedBy;
  private String reservedBy;
  private boolean markedForRemoval;

  public Vinyl(String title, String artist, int releaseYear){
    this.title = title;
    this.artist = artist;
    this.releaseYear = releaseYear;
    this.currentState = new AvailableState();
    this.borrowedBy = null;
    this.reservedBy = null;
    this.markedForRemoval = false;
  }

  public void reserve(String userId){
    currentState.reserve(this, userId);
  }
  public void borrow(String userId){
    currentState.borrow(this, userId);
  }
  public void returnVinyl(){
    currentState.returnVinyl(this);
  }
  public void remove(){
    currentState.remove(this);
  }

  public String getTitle()
  {
    return title;
  }

  public String getArtist()
  {
    return artist;
  }

  public int getReleaseYear()
  {
    return releaseYear;
  }

  public VinylState getCurrentState()
  {
    return currentState;
  }

  public String getBorrowedBy()
  {
    return borrowedBy;
  }

  public String getReservedBy()
  {
    return reservedBy;
  }
  public Boolean getMarkedFlag(){
    return markedForRemoval;
  }

  public void setCurrentState(VinylState currentState)
  {
    this.currentState = currentState;
  }

  public void setBorrowedBy(String usedId)
  {
    this.borrowedBy = usedId;
  }

  public void setReservedBy(String userId)
  {
    this.reservedBy = userId;
  }

  public void setMarkedForRemoval(boolean markedForRemoval)
  {
    this.markedForRemoval = markedForRemoval;
  }
}
