/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 19.10.2015
  * @author 
  */

public class W�rfel {
  
  // Anfang Attribute
  protected int seitenAnzahl;
  protected int gewuerfelteSeite;
  // Ende Attribute
  
  public W�rfel(int seitenAnzahl) {
    this.seitenAnzahl = seitenAnzahl;
    this.gewuerfelteSeite = 0;
  }

  // Anfang Methoden
  public int getSeitenAnzahl() {
    return seitenAnzahl;
  }

  public int getGewuerfelteSeite() {
    return gewuerfelteSeite;
  }

  public void wuerfeln() {
    
  }

  // Ende Methoden
} // end of W�rfel
