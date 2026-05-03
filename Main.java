public class Main{

    public static void main(String[] args) {
        Gestione gestione = new Gestione();

        gestione.aggiungiPresenza("zak");
        gestione.aggiungiPresenza("dadi");
        gestione.aggiungiPresenza("rota");
        // gestione.aggiungiPresenza("zak");

        gestione.incrementaPresenza("zak");
        gestione.incrementaPresenza("zak");
        gestione.incrementaPresenza("dadi");
    }


}