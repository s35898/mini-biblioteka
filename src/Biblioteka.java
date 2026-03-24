public class Biblioteka {
    private książka[] książki;
    private int liczbaKsiazek;

    public Biblioteka(int pojemnosc){
        książki = new książka[pojemnosc];
        liczbaKsiazek = 0;
    }

    public void dodajKsiazke(książka książka){
        liczbaKsiazek ++;

    }




}
