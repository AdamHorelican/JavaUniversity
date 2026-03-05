public class Vinyl
{
  private String title;
  private String artist;
  private int releaseYear;
  private String state;


  public Vinyl(String title, String artist, int releaseYear, String state) {
    this.title = title;
    this.artist = artist;
    this.releaseYear = releaseYear;
    this.state = state;
  }

  public String getTitle() { return title; }
  public String getArtist() { return artist; }
  public int getReleaseYear() { return releaseYear; }
  public String getState() { return state; }
  public void setState(String state) { this.state = state; }
}
