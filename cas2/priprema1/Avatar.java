package org.example.cas2.priprema1;

public class Avatar {
    private final String link;
    private final String naziv;
    private final String boja;

    public Avatar(String link, String naziv, String boja) {
        this.link = link;
        this.naziv = naziv;
        this.boja = boja;
    }

    public String getLink() {
        return link;
    }

    public String getNaziv() {
        return naziv;
    }

    public String getBoja() {
        return boja;
    }
}
