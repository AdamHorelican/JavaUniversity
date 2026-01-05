public abstract class Camera
{
  private Manufacturer manufacturer;

  public Camera(Manufacturer manufacturer){
    this.manufacturer = manufacturer;
  }

  public Manufacturer getManufacturer()
  {
    return manufacturer;
  }

  public abstract void takeAPicture();
}
