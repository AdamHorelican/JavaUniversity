import java.util.Objects;

public class School extends Education
{
  private String type;

 public static String INFANT_SCHOOL = "Infant school";
 public static String JUNIOR_SCHOOL = "Junior school";
 public static String SECONDARY_SCHOOL = "Secondary school";
 public static String HIGH_SCHOOL = "High school";

 public School(String code, String title, String type){
   super(code, title);
   this.type = type;
 }

  public String getSchoolType()
  {
    return type;
  }
  @Override
  public boolean equals(Object o){
   if (this == o) return true;
   if (o == null || getClass() != o.getClass()) return false;

   if (!super.equals(o)) return false;

   School other = (School) o;
   return Objects.equals(type, other.type);
  }

  @Override
  public String toString(){
   return super.toString() + " | Type: " + type;
  }
}
