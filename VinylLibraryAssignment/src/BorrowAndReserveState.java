public class BorrowAndReserveState implements VinylState
{
  @Override public void reserve(Vinyl vinyl, String userId)
  {
    System.out.println("Cant be reserved");
  }

  @Override public void borrow(Vinyl vinyl, String userId)
  {
    System.out.println("Cant be borrowed");
  }

  @Override public void returnVinyl(Vinyl vinyl)
  {
    vinyl.setBorrowedBy(null);
    vinyl.setCurrentState(new ReserveState());
  }

  @Override public void remove(Vinyl vinyl)
  {
    System.out.println("Cant be removed");
    vinyl.setMarkedForRemoval(true);
  }
}
