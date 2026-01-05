public class ImageDirectory
{
  private int numberOfImages;
  private Image[] images;

  public ImageDirectory(int maxSize){
    this.images = new Image[maxSize];
    this.numberOfImages = 0;
  }

  public int getNumberOfImages()
  {
    return numberOfImages;
  }

  public void addImage(){
    images[numberOfImages] = new Image();
    numberOfImages++;

  }
  public void addDescription(int index, String description){
    images[index].setDescription(description);
  }
  public void removeImage(int index){
    for (int i = index; i < getNumberOfImages()-1; i++)
    {
      images[i] = images[i+1];
    }
    images[numberOfImages-1] = null;
    numberOfImages--;

  }

  public Image getImage(int index){
    return images[index];
  }
  public Image getImage(String description){
    for (int i = 0; i < numberOfImages; i++)
    {
      if (images[i].getDescription().equals(description)){
        return images[i];
      }
    }
    return null;
  }
}
