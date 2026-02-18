public class Closed implements DoorInterface
{
  @Override public void push(Door door)
  {
    door.setCurrentState(new Opening(door));
  }

  @Override public String getText()
  {
    return "CLOSED";
  }
}
