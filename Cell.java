public class Cell {
  private final int x;
  private final int y;
  private final int size;
  private int state;
  public Cell(int x, int y, int size) {
    this.x = x;
    this.y = y;
    this.size = size;
    this.state = 0;
  }
}
