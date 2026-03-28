public class ReserveState implements VinylState
{
  @Override public void reserve(Vinyl vinyl, String userId)
  {
    System.out.println("cant reserved it");
  }

  @Override public void borrow(Vinyl vinyl, String userId)
  {
    if (vinyl.getReservedBy().equals(userId)){
      vinyl.setReservedBy(null);
      vinyl.setBorrowedBy(userId);
      vinyl.setCurrentState(new BorrowState());
    }
    else {
      System.out.println("Cant be borrowed");
    }
  }

  @Override public void returnVinyl(Vinyl vinyl, String userId)
  {
    System.out.println("Cant be removed");
  }

  @Override public void remove(Vinyl vinyl)
  {
    vinyl.setMarkedForRemoval(true);
  }
}
