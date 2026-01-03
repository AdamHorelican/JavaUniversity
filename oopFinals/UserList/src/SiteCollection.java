public class SiteCollection
{
  private int size;
  private static final int MAX_SITES = 25;
  private Website[] websites;

  public SiteCollection(){
    this.size = 0;
    this.websites = new Website[MAX_SITES];
  }
  public int getNumberOfSites(){
    return size;
  }
  public void addSite(Website website){
    if (size == MAX_SITES){
      throw new RuntimeException("Full List");
    }
    websites[size] = website;
    size++;
  }
  public void removeSite(String url){
    int index = -1;
    for (int i = 0; i < size; i++)
    {
      if (websites[i].getUrl().equals(url)){
        index = i;
        break;
      }
    }
    if (index == -1){
      throw  new RuntimeException("Url not found");
    }

    for (int i = index; i < size-1; i++)
    {
      websites[i] = websites[i+1];
    }
    websites[size-1] = null;
    size--;

  }
  public Website getSite(int index){
    if (index<0 || index>=websites.length){
      throw new IndexOutOfBoundsException();
    }
    return websites[index];
  }
  public boolean contains(Website website){
    for (int i = 0; i < size; i++)
    {
      if (websites[i].equals(website)){
        return true;
      }
    }
    return false;
  }
}
