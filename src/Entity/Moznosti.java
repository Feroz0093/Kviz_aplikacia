package Entity;

public class Moznosti {
    private String text_moznosti;
    private Boolean je_spravna;

    public Moznosti(String text_moznosti, Boolean je_spravna) {
        this.text_moznosti = text_moznosti;
        this.je_spravna = je_spravna;
    }

    public String getText_moznosti() {
        return text_moznosti;
    }

    public void setText_moznosti(String text_moznosti) {
        this.text_moznosti = text_moznosti;
    }

    public Boolean getJe_spravna() {
        return je_spravna;
    }

    public void setJe_spravna(Boolean je_spravna) {
        this.je_spravna = je_spravna;
    }
}
