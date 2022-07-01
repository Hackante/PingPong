public class BALL extends KREIS {
  private int deltaX = 0;
  private int deltaY = 0;

  public BALL() {
    super();
    String Farbe = "gelb";
    setzeFarbe(Farbe);
    int radius = 10;
    setzeRadius(radius);
    int m_x = 400;
    int m_y = 300;
    setzeMittelpunkt(m_x, m_y);
    deltaX = 1;
    deltaY = -1;
  }

  public void bewegen() {
    verschiebenUm(deltaX, deltaY);
  }

  public void invertiereY() {
    deltaY = -deltaY;
  }

  public void invertiereX() {
    deltaX = -deltaX;
  }

}