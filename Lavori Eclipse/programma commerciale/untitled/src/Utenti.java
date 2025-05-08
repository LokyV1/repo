public class Utenti {
    private String username;
    private String password;

    public Utenti(String username, String password){
        this.password = password;
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
    public boolean verificapassword(String password){
        return this.password.equals(password);
    }
}
