public class User
{
  private String name;
  private SiteCollection siteCollection;

  public User(String name){
    this.name = name;
    this.siteCollection = new SiteCollection();
  }

  public String getName()
  {
    return name;
  }
  public SiteCollection getSiteCollection(){
    return siteCollection;
  }
  public SiteCollection getAccessibleSites(){
   SiteCollection access = new SiteCollection();
    for (int i = 0; i < siteCollection.getNumberOfSites(); i++)
    {
      if (siteCollection.getSite(i).hasAccess()){
        access.addSite(siteCollection.getSite(i));
      }
    }
    return access;
  }
}
