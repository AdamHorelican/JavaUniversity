public class CachedPersonCollection implements PersonCollection
{

  private PersonCollection realDatabase;
  private Person lastFoundPerson;


  public CachedPersonCollection(PersonDatabase database){
    this.realDatabase = database;
    this.lastFoundPerson = null;
  }
  @Override public Person getPersonWithName(String name)
  {
    if(lastFoundPerson != null && lastFoundPerson.getName().equals(name)){
      System.out.println("Found");
      return lastFoundPerson;
    }
    lastFoundPerson = realDatabase.getPersonWithName(name);
    return lastFoundPerson;
  }
}
