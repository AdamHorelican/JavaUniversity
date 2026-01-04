import java.util.ArrayList;

public class UserList
{
  private ArrayList<User> users;

  public UserList(){
    this.users = new ArrayList<>();
  }

  public int getNumberOfUsers(){
    return users.size();
  }
  public void addUser(User user){
    users.add(user);
  }
  public User findAUserWithAccessTo(Website website){
    for (int i = 0; i < getNumberOfUsers(); i++)
    {
      if(users.get(i).getAccessibleSites().contains(website)){
        return users.get(i);
      }
    }
    return null;
  }
  public Administrator findFirstAdministrator(){
    for (int i = 0; i < getNumberOfUsers(); i++)
    {
      if (users.get(i) instanceof Administrator){
        return (Administrator) users.get(i);
      }
    }
    return null;
  }
}
