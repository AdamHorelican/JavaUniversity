public class PrintingBetweenIntegers implements Runnable
{

  private int x,y;

  public PrintingBetweenIntegers(int x, int y){
    this.x =x;
    this.y = y;
  }
  @Override
  public void run(){
    for (int i = 0; i < y; i++)
    {
      System.out.println(i);
    }
  }
}
