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

  @Override public void returnVinyl(Vinyl vinyl, String userId)
  {
    if (vinyl.getBorrowedBy().equals(userId)){
      vinyl.setBorrowedBy(null);
      vinyl.setCurrentState(new ReserveState());
    }
    else {
      System.out.println("Same Id has to return it.");
    }
  }

  @Override public void remove(Vinyl vinyl)
  {
    System.out.println("Cant be removed");
    vinyl.setMarkedForRemoval(true);
  }
}
