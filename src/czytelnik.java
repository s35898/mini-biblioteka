public class czytelnik {

    private String imie;
    private String nazwisko;
    private int numerKarty;
    private int liczbaWypozyczen;

    public czytelnik(String imie, String nazwisko, int numerKarty, int liczbaWypozyczen) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerKarty = numerKarty;
        this.liczbaWypozyczen = liczbaWypozyczen;

    }

    public void wypiszDane(){
        System.out.print("Imie: " + this.imie );
        System.out.print("Nazwisko: " + this.nazwisko);
        System.out.print("Numer Karty: " + this.numerKarty);
        System.out.print("Liczba Wypozyczen: " + this.liczbaWypozyczen);
    }

    public int zwiekszLiczbeWypozyczen(){
        return this.liczbaWypozyczen ++;
    }

    public int zmniejszLiczbeWypozyczen(){
        return this.liczbaWypozyczen --;

    }

}
