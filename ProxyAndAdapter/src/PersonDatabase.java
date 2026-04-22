import java.util.ArrayList;
import java.util.List;

public class PersonDatabase implements PersonCollection
{
  private List<Person> people = new ArrayList<>();


  public PersonDatabase(){
    people.add(new Person("Adam"));
    people.add(new Person("David"));
    people.add(new Person("Simon"));
  }
  @Override public Person getPersonWithName(String name)
  {
    System.out.println("Searching for " + name + " Slow though");
    try{
      Thread.sleep(2000);
    }
    catch (Exception e){
      System.out.println(e.getMessage());
    }

    for (Person p : people){
      if (p.getName().equals(name)){
        System.out.println("Databse found: " + name);
        return p;
      }
    }
    System.out.println("Not found");
    return null;
  }
}
