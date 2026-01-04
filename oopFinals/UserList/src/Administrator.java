public class Administrator extends User
{
  public Administrator(String name){
    super(name);
  }

  public void setUserAccessForSite(Website website){
    website.setAccess(true);
  }
  public Administrator createAdministrator(User user){
    Administrator admin = new Administrator(user.getName());
    SiteCollection userSites = user.getSiteCollection();

    for (int i = 0; i < userSites.getNumberOfSites(); i++)
    {
      Website s = userSites.getSite(i);

      Website copy = new Website(s.getUrl(), s.hasAccess());

      admin.getSiteCollection().addSite(copy);
    }
    return admin;
  }
}
