public class Triangle extends TwoDimensionalShape
{
  private double sideA, sideB, sideC;

  public Triangle(double x, double y, double sideA, double sideB, double sideC){
    super(x,y);
    this.sideA = sideA;
    this.sideB = sideB;
    this.sideC = sideC;
  }

  public double getSideA()
  {
    return sideA;
  }

  public double getSideB()
  {
    return sideB;
  }

  public double getSideC()
  {
    return sideC;
  }
  public void setSides(double sideA, double sideB, double sideC){
    this.sideA = sideA;
    this.sideB = sideB;
    this.sideC = sideC;
  }
  @Override
  public double getArea(){
    return 0.5*getSideA()*getSideB()*Math.sin(Math.acos((Math.pow(getSideA(),2) + Math.pow(getSideB(),2) - Math.pow(getSideC(),2))/(2*getSideA()*getSideB())));
  }
}
