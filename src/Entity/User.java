package Entity;

public class User {
    private Integer user_id;
    private String meno;
    private String priezvisko;
    private String email;
    private String heslo;
    private Integer skore;
    private Integer je_admin; // hodnota 1 alebo 0

    public User(String meno, String priezvisko, String email, String heslo) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.email = email;
        this.heslo = heslo;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public String getMeno() {
        return meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public String getEmail() {
        return email;
    }

    public Integer getSkore() {
        return skore;
    }

    public Integer getJe_admin() {
        return je_admin;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSkore(Integer skore) {
        this.skore = skore;
    }

    public void setJe_admin(Integer je_admin) {
        this.je_admin = je_admin;
    }

}
