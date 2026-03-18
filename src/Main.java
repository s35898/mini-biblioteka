public class Main {
    public static void main(String[] args) {

        książka harryPotter =
        new książka("Harry potter", "J.K. Rowling", 300, true);

        System.out.println(harryPotter);

        książka władcaPierścieni =
                new książka("Władca Pierścieni", "J.R.R. Tolkien", 368, true);

        książka rok1984 =
                new książka("Rok 1984", "George Orwell", 236, false);

        harryPotter.wypozycz();
    }


}
