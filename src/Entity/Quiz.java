package Entity;

import java.util.ArrayList;

public class Quiz {
    //nazov kvizu
    private String nazov_kvizu;
    //kategoria kvizu
    private Kategorie kategoria_kvizu;
    //obtiaznost 1..5
    private Integer obtiaznost_kvizu;
    //AL na ukladanie otazok
    private ArrayList<Otazka> otazky;

    //defaultny konstruktor

    public String getNazov_kvizu() {
        return nazov_kvizu;
    }

    public void setNazov_kvizu(String nazov_kvizu) {
        this.nazov_kvizu = nazov_kvizu;
    }

    public Kategorie getKategoria_kvizu() {
        return kategoria_kvizu;
    }

    public void setKategoria_kvizu(Kategorie kategoria_kvizu) {
        this.kategoria_kvizu = kategoria_kvizu;
    }

    public Integer getObtiaznost_kvizu() {
        return obtiaznost_kvizu;
    }

    public void setObtiaznost_kvizu(Integer obtiaznost_kvizu) {
        this.obtiaznost_kvizu = obtiaznost_kvizu;
    }

    public ArrayList<Otazka> getOtazky() {
        return otazky;
    }

    public void setOtazky(ArrayList<Otazka> otazky) {
        this.otazky = otazky;
    }

    /**
     * metoda, ktora do AL otazok kvizu pridu novu otazku, ktora je vstupnym parametrom
     * v pripade ze AL otazok nieje inicializovany, vytvori sa a az potom sa do AL vlozi otazka
     * @param nova_otazka
     */
    public void pridaj_otazku(Otazka nova_otazka){
        if (this.otazky == null){
            this.otazky = new ArrayList<>();
        }
        this.otazky.add(nova_otazka);
    }


}
