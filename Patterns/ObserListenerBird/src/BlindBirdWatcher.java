import java.util.Random;

public class BlindBirdWatcher
{
  public BlindBirdWatcher(Bird birdToWatch){
    birdToWatch.addPropertyChangeListener("Singing", evt -> reactToSinging());
  }

  private void reactToSinging()
  {
    Random random = new Random();
    int reaction = random.nextInt(3);
    if(reaction == 0)
    {
      System.out.println("Blind Bird Watcher: Wow!");
    }
    else if(reaction == 1)
    {
      System.out.println("Blind Bird Watcher: How nice");
    }
    else
    {
      System.out.println("Blind Bird Watcher: What a lovely voice!");
    }
  }
}
