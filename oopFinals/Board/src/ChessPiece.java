public class ChessPiece extends Piece
{
  private boolean isWhite;

  public ChessPiece(String name, boolean isWhite){
    super(name);
    this.isWhite = isWhite;
  }
  @Override
  public String getInfo(){
    return (isWhite ? "White" : "Black") + getName();
  }
}
