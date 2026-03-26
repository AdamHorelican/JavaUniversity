public interface VinylState
{
  void reserve(Vinyl vinyl, String userId);
  void borrow(Vinyl vinyl, String userId);
  void returnVinyl(Vinyl vinyl);
  void remove(Vinyl vinyl);
}
