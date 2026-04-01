import java.util.List;
import java.util.Random;

public class VinylSimulator implements Runnable
{

  private VinylLibrary vinylLibrary;
  private Random random = new Random();
  private String userId = "319";

  public VinylSimulator(VinylLibrary vinylLibrary){
    this.vinylLibrary = vinylLibrary;
  }

  @Override public void run()
  {
    while(true){
      try {
        Thread.sleep(3000);
        List<Vinyl> vinyls = vinylLibrary.getVinyls();
        Vinyl vinyl = vinyls.get(random.nextInt(vinyls.size()));

        int action = random.nextInt(4);
        switch (action){
          case 0: vinylLibrary.borrowVinyl(vinyl, userId); break;
          case 1: vinylLibrary.reserveVinyl(vinyl, userId); break;
          case 2: vinylLibrary.returnVinyl(vinyl, userId); break;
          case 3: vinylLibrary.removeVinyl(vinyl); break;
        }

      }
      catch (InterruptedException e){
        break;
      }
    }
  }
}
