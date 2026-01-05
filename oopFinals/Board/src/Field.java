public class Field
{
  private Piece piece;

  public Field(){
    this.piece = null;
  }
  public Field(Piece piece){
    this.piece = piece;
  }
  public void setPiece(Piece piece){
    this.piece = piece;
  }
  public void removePiece(){
    this.piece = null;
  }

  public Piece getPiece()
  {
    return piece;
  }

  @Override public String toString()
  {
    if (piece == null) return ".";
    return piece.getInfo();
  }
}
