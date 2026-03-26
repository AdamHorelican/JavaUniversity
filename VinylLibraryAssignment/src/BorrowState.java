public class BorrowState implements VinylState
{
  @Override public void reserve(Vinyl vinyl, String userId)
  {
    vinyl.setCurrentState(new BorrowAndReserveState());
    vinyl.setReservedBy(userId);
  }

  @Override public void borrow(Vinyl vinyl, String userId)
  {
    System.out.println("cant be borrowed");
  }

  @Override public void returnVinyl(Vinyl vinyl)
  {
    vinyl.setBorrowedBy(null);
    vinyl.setCurrentState(new AvailableState());
  }

  @Override public void remove(Vinyl vinyl)
  {
    vinyl.setMarkedForRemoval(true);
  }
}
