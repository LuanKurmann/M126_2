package Grafikeditor1.Figures;

public class Rechteck extends Figur{
    private int laenge, breite;

    public Rechteck(int xPos, int yPos, int laenge, int breite, int liniendicke) {
        super(xPos, yPos, liniendicke);
        this.laenge = laenge;
        this.breite = breite;
    }

    public int getLaenge() {
        return laenge;
    }

    public int getBreite() {
        return breite;
    }

    @Override
    public void groesseAendern(float faktor){
        liniendicke = (int)(liniendicke*faktor);
        laenge = (int)(laenge*faktor);
        breite = (int)(breite*faktor);
    }
}
