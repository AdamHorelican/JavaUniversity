public class Cat extends Pet {
  private boolean isChipped;

  public Cat(Date8 birthDate, String species, boolean isChipped) {
    super(birthDate.copy(), species, "Cat");
    this.isChipped = isChipped;
  }

  public boolean isChipped() {
    return isChipped;
  }

  @Override
  public String toString() {
    return super.toString() + ", chipped: " + isChipped;
  }
}
