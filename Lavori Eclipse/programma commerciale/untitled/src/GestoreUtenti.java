import java.util.HashMap;
public class GestoreUtenti {
    private HashMap<String, Utenti> utenti = new HashMap<>();

    public boolean registrautenti(String username, String password){
        if (utenti.containsKey(username)){
            return false; //nel caso in cui l'utente esista già
        }
        utenti.put(username, new Utenti(username,password));
        return true;

    }

}
