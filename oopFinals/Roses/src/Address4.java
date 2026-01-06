public class Address4
{
  private String town, streetAndNumber;
  private int zipCode;

  public Address4(int zipCode, String town, String streetAndNumber){
    this.zipCode = zipCode;
    this.town = town;
    this.streetAndNumber = streetAndNumber;
  }

  public void setZipCode(int zipCode)
  {
    this.zipCode = zipCode;
  }
  public Address4 copy(){
    return new Address4(zipCode, town, streetAndNumber);
  }

  @Override public String toString()
  {
    return "Address4{" + "town='" + town + '\'' + ", streetAndNumber='"
        + streetAndNumber + '\'' + ", zipCode=" + zipCode + '}';
  }
}
