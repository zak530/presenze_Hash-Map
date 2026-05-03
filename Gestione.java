import java.util.*;

public class Gestione {
    private HashMap<String, Integer> presenza;

    public Gestione() {
        presenza = new HashMap<>();
    }


    public void aggiungiPresenza(String nome) {
    if (presenza.containsKey(nome)) {
       throw new IllegalArgumentException("Presenza già registrata per " + nome);
    } else {
        presenza.put(nome, 0);      
    }
}



}