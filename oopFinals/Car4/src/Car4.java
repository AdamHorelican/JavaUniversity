import java.util.Objects;

public class Car4
{
  private String model;
  private int year;
  private Engine2 engine;

  public Car4(String model, int year, Engine2 engine){
    this.model = model;
    this.year = year;
    this.engine = engine;
  }

  public String getModel()
  {
    return model;
  }

  public int getYear()
  {
    return year;
  }

  public Engine2 getEngine()
  {
    return engine;
  }
  public boolean equals(Object o){
    if (this == o) return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Car4 other = (Car4) o;
    return Objects.equals(model, other.model) && year == other.year && Objects.equals(engine, other.engine);

  }
}
