import java.util.Objects;

public class Website
{
  private String url;
  private boolean userAccess;

  public Website(String url, boolean userAccess){
    this.url = url;
    this.userAccess = userAccess;
  }

  public String getUrl()
  {
    return url;
  }

  public void setAccess(boolean access){
    this.userAccess = access;
  }
  public boolean hasAccess(){
    return userAccess;
  }

  @Override public boolean equals(Object o)
  {
    if (o == null || getClass() != o.getClass())
      return false;
    Website website = (Website) o;
    return userAccess == website.userAccess && Objects.equals(url, website.url);
  }

  @Override public int hashCode()
  {
    return Objects.hash(url, userAccess);
  }
}
