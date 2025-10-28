public class OldBoys extends ClubMember
{
  private int yearsOfMembership;

  public OldBoys(String name, int age, int yearsOfMembership){
    super(name, age);
    this.yearsOfMembership = yearsOfMembership;
  }

  public void setYearsOfMembership(int yearsOfMembership)
  {
    this.yearsOfMembership = yearsOfMembership;
  }

  public int getYearsOfMembership()
  {
    return yearsOfMembership;
  }

  @Override
  public String toString(){
    return super.toString() + ". Years of membership: " + yearsOfMembership;
  }
  @Override
  public double getMembershipFee()
  {
    if (yearsOfMembership < 5){
      return 300;
    }
    else if (yearsOfMembership > 9){
      return 100;
    }
    else {
      return 200;
    }
  }
}
