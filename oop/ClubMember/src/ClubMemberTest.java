public class ClubMemberTest
{
  public static void main(String[] args)
  {

    ClubMember[] members = new ClubMember[3];
    members[0] = new Junior("Adam", 12, 'm');
    members[1] = new Senior("Feroslav", 19);
    members[2] = new OldBoys("Luas", 40, 7);

    for (ClubMember m : members){
      System.out.println(m.toString());
      System.out.println("Membership fee: " + m.getMembershipFee());
      System.out.println();
    }

  }
}
