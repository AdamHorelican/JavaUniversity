public class AvailableState implements VinylState
{
  @Override public void reserve(Vinyl vinyl, String userId)
  {
    vinyl.setReservedBy(userId);
    vinyl.setCurrentState(new ReserveState());
  }

  @Override public void borrow(Vinyl vinyl, String userId)
  {
    vinyl.setBorrowedBy(userId);
    vinyl.setCurrentState(new BorrowState());
  }

  @Override public void returnVinyl(Vinyl vinyl)
  {
    //
  }

  @Override public void remove(Vinyl vinyl)
  {
    System.out.println("Vinyl can be removed");
  }
}
