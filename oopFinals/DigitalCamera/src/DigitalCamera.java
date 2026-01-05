public class DigitalCamera extends Camera
{
  private double megaPixels;
  private ImageDirectory imageDirectory;

  public DigitalCamera(Manufacturer manufacturer, double megaPixels, int maxNumberOfImages){
    super(manufacturer);
    this.megaPixels = megaPixels;
    this.imageDirectory = new ImageDirectory(maxNumberOfImages);
  }

  @Override public void takeAPicture()
  {
    imageDirectory.addImage();
  }

  public void addDescriptionToLastPicture(String description){
    int index = imageDirectory.getNumberOfImages() -1;

    imageDirectory.addDescription(index, description);
  }
  public ImageDirectory getImageDirectory(){
    return imageDirectory;
  }
}
