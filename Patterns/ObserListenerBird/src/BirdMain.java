public class BirdMain
{
  public static void main(String[] args)
  {
    Bird bird = new Bird();
    new BirdWatcher(bird);
    new BlindBirdWatcher(bird);

    bird.start();
  }
}
