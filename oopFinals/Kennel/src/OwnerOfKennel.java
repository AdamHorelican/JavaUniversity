public class OwnerOfKennel
{
  private String name;
  private Date8 birthday;

  public OwnerOfKennel(Date8 birthday, String name){
    this.birthday = birthday.copy();
    this.name = name;
  }

  public String getName()
  {
    return name;
  }

  public Date8 getBirthday()
  {
    return birthday.copy();
  }

}
