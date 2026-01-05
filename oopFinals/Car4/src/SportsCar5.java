import java.util.Objects;

public class SportsCar5 extends Car4
{
  private int speed;

  public SportsCar5(String model, int year, Engine2 engine, int speed){
    super(model, year, engine);
    this.speed = speed;
  }

  public int getSpeed()
  {
    return speed;
  }

  @Override
  public boolean equals(Object o){
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()){
      return false;
    }
    if (!super.equals(o)) return false;

    SportsCar5 other = (SportsCar5) o;
    return speed == other.speed;
  }
}
