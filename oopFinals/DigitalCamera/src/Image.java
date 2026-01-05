public class Image
{
  private String description;

  public Image(){
    this.description = "";
  }

  public String getDescription()
  {
    return description;
  }

  public void setDescription(String description)
  {
    this.description = description;
  }

  @Override public String toString()
  {
    return "Image{" + "description='" + description + '\'' + '}';
  }
}
