public class Pet
{
  private String id, species;
  private static int running_ID = 1001;
  private Date8 birthday;

  public Pet(Date8 birthday, String species, String prefixId){
    this.birthday = birthday.copy();
    this.id = prefixId+running_ID;
    running_ID++;
    this.species = species;
  }

  public String getId()
  {
    return id;
  }

  public String getSpecies()
  {
    return species;
  }

  public Date8 getBirthday()
  {
    return birthday.copy();
  }

  @Override public String toString()
  {
    return "Pet{" + "id='" + id + '\'' + ", species='" + species + '\''
        + ", birthday=" + birthday + '}';
  }
}
