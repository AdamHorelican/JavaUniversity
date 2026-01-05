public class TicTaacToePiece extends Piece
{
  private boolean isX;

  public TicTaacToePiece(boolean isX){
    super(isX ? "X" : "O");
    this.isX = isX;
  }

  @Override public String getInfo()
  {
    return isX ? "X" : "O";
  }
}
