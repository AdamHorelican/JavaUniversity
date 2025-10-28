abstract class TwoDimensionalShape
{
  private double x, y;

  public TwoDimensionalShape(double x, double y){
    this.x = x;
    this.y = y;
  }

  public double getX()
  {
    return x;
  }

  public double getY()
  {
    return y;
  }
  public void moveTo(double x, double y){
    this.x = x;
    this.y = y;
  }
  public abstract double getArea();
}
