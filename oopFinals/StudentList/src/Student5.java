import java.util.Objects;

public class Student5
{
  private String name;
  private Education education;

  public Student5(String name, Education education){
    this.name = name;
    this.education = education;
  }

  public String getName()
  {
    return name;
  }

  public Education getEducation()
  {
    return education;
  }
  public void changeEducation(Education education){
    if (education == null){
      throw new IllegalArgumentException("education must not be null");
    }
    this.education = education;
  }
  public boolean equals(Object o){
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Student5 other = (Student5) o;
    return Objects.equals(education, other.education) && Objects.equals(name, other.name);
  }
  @Override
  public String toString(){
    return "Name: " + name + " | Education: " + education;
  }
}
