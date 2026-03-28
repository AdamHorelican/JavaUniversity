public class BorrowState implements VinylState
{
  @Override public void reserve(Vinyl vinyl, String userId)
  {
    if (vinyl.getMarkedFlag() == false){
      vinyl.setCurrentState(new BorrowAndReserveState());
      vinyl.setReservedBy(userId);
    }
    else {
      System.out.println("will be removed, cant reserve it");
    }
  }

  @Override public void borrow(Vinyl vinyl, String userId)
  {
    System.out.println("cant be borrowed");
  }

  @Override public void returnVinyl(Vinyl vinyl, String userId)
  {
    if (vinyl.getBorrowedBy().equals(userId)){
      vinyl.setBorrowedBy(null);
      vinyl.setCurrentState(new AvailableState());
    }
    else {
      System.out.println("Has to be correct id.");
    }
  }

  @Override public void remove(Vinyl vinyl)
  {
    vinyl.setMarkedForRemoval(true);
  }
}
