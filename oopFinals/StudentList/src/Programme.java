import java.util.Objects;

public class Programme extends Education
{
  private String level;

  public Programme(String code, String title, String level){
    super(code, title);
    this.level = level;
  }
  public String getLevel(){
    return level;
  }
  @Override
  public boolean equals(Object o){
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    if (!super.equals(o)) return false;

    Programme other = (Programme) o;
    return Objects.equals(level, other.level);
  }
  @Override
  public String toString(){
    return super.toString() + " | Level: " + level;
  }
}
