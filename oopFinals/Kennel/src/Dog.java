public class Dog extends Pet {

  public Dog(Date8 birthDate, String species) {
    super(birthDate.copy(), species, "Dog");
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
