import java.util.ArrayList;

public class ListContainer
{
  private ArrayList<Integer> list;

  public ListContainer(){
    list = new ArrayList<>();
  }
  public synchronized void add(int i){
    list.add(i);
  }
  public synchronized int getSize(){
    return list.size();
  }
}
