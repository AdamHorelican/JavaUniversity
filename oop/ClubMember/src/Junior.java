public class Junior extends ClubMember
{
  private char gender;

  public Junior(String name, int age, char gender){
    super(name, age);
    this.gender = Character.toLowerCase(gender);
  }

  public char getGender()
  {
    return gender;
  }

  @Override public String toString()
  {
    return super.toString() + " Gender: " + gender;
  }

  @Override
  public double getMembershipFee(){

    if (gender == 'f'){
      return 300;
    }
    else{
      return 400;
    }
  }
}
