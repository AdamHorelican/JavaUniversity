public class TwoDimensionalShapeTest
{
  public static void main(String args[])
  {
    //    TwoDS shape1 = new TwoDS(1,1);
    Circle shape2 = new Circle(1,1,5);
    TwoDimensionalShape shape3 = new Triangle(2,2,3,4,5);
    System.out.println(shape2.getArea());
    System.out.println(shape3.getArea());
  }
}