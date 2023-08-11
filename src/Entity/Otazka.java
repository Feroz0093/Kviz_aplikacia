package Entity;

import java.util.ArrayList;

public class Otazka {
    private String text_otazky;
    private ArrayList<Moznosti> moznosti;

    public Otazka(String text_otazky, ArrayList<Moznosti> moznosti) {
        this.text_otazky = text_otazky;
        this.moznosti = moznosti;
    }

    public String getText_otazky() {
        return text_otazky;
    }

    public void setText_otazky(String text_otazky) {
        this.text_otazky = text_otazky;
    }

    public ArrayList<Moznosti> getMoznosti() {
        return moznosti;
    }

    public void setMoznosti(ArrayList<Moznosti> moznosti) {
        this.moznosti = moznosti;
    }
}
