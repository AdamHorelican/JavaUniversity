public class Inserter implements Runnable
{
  private ListContainer listContainer;

  public Inserter(ListContainer listContainer){
    this.listContainer = listContainer;
  }

  @Override public void run()
  {
    for (int i = 0; i < 100000; i++){
      listContainer.add(i);
    }
  }


}
