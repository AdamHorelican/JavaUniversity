public class Circle extends TwoDimensionalShape
{

  private double radius;

  public Circle(double x, double y, double radius){
    super(x,y);
    this.radius = radius;
  }

  public double getRadius()
  {
    return radius;
  }

  public void setRadius(double radius)
  {
    this.radius = radius;
  }
  @Override
  public double getArea(){
    return Math.PI * Math.pow(radius, 2);
  }
}
