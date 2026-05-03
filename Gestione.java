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


public void incrementaPresenza(String nome) {
        if (presenza.containsKey(nome)) {
            int count = presenza.get(nome);
            presenza.put(nome, count + 1);
        } else {
            throw new IllegalArgumentException("Nessuna presenza registrata per " + nome);
        }
    }

     public String visualizzaPresenze() {
        StringBuilder sb = new StringBuilder();
         for (Map.Entry<String, Integer> entry : presenza.entrySet()) {
            sb.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }



}