
public class książka {

    private String tytul;
    private String autor;
    private int liczbastron;
    private boolean dostepna;

    public książka(String tytul, String autor, int liczbastron, boolean dostepna) {
        this.tytul = tytul;
        this.autor = autor;
        this.liczbastron = liczbastron;
        this.dostepna = dostepna;
    }
    public void wypiszInfo(){
        System.out.print("Tytuł: " + this.tytul);
        System.out.print("Autor: " + this.autor);
        System.out.print("Liczba Stron: " + this.liczbastron);
        System.out.print("Dostępna: " + this.dostepna);
    }
    public void wypozycz(){

        if (this.dostepna) {
            this.dostepna = false;
            System.out.println("Książka została wypożyczona");
        } else {
        System.out.println("Książka nie jest dostępna");
        }
    }

    public void zwroc(){
        if (this.dostepna) {
            this.dostepna = true;
            System.out.println("Zwrócono książkę: " + this.tytul);
        }
        else {
            System.out.print("Książka: " + this.tytul + "jest dostepna");
    }



}}
