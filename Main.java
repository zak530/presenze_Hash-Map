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
        System.out.println("Presenze di rota: " + gestione.ricavaPresenza("rota"));
        System.out.println(gestione.visualizzaPresenze());
        System.out.println("Piu presente: " + gestione.ilPiuPresente());
    }


}