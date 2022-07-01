public class SCHLÄGER extends RECHTECK {
  private int deltaY = 0;
  private int deltaX = 0;

  public SCHLÄGER(int m_x, int m_y) {
    super();
    deltaX = 0;
    deltaY = 1;
    // int m_x= 275; int m_y= 7; (links)
    // int m_x= 275; int m_y= 800; (rechts)
    setzeMittelpunkt(m_y, m_x);
    setzeFarbe("blau");
    int breite = 10;
    int hoehe = 100;
    setzeGroesse(breite, hoehe);
  }

  public void bewegen() {
    verschiebenUm(deltaX, deltaY);
  }

  public void verringereDeltaY() {
    deltaY--;
  }

  public void erhöheDeltaY() {
    deltaY++;
  }

  public void setzteDeltaX(int deltaX) {
    this.deltaX = deltaX;
  }

  public void setzeDeltaY(int deltaY) {
    this.deltaY = deltaY;
  }
}