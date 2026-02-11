import java.util.Random;

public class BirdWatcher
{
  public BirdWatcher(Bird birdToWatch){
    birdToWatch.addPropertyChangeListener("Singing", evt -> reactToSinging());
    birdToWatch.addPropertyChangeListener("Flapping", evt -> reactToFlapping());
    
  }

  private void reactToFlapping()
  {
    Random random = new Random();
    int reaction = random.nextInt(3);
    if(reaction == 0)
    {
      System.out.println("Bird Watcher: Ooh!");
    }
    else if(reaction == 1)
    {
      System.out.println("Bird Watcher: So beautiful!");
    }
    else
    {
      System.out.println("Bird Watcher: Would you look at that");
    }
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
