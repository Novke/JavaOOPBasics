package org.example.cas5;

public class Pandur {
    private String ime;
    private String prezime;

    private static String drzava = "SRBIJA";

    public Pandur(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    static void deriSe(){
        System.out.println("ALO TI STA RADIS TO OVO JE " + drzava);
    }

    void predstaviSe(){
        System.out.println("Ja sam :" + ime + prezime);
    }

    public static void main(String[] args) {
        Pandur.deriSe();

        Pandur pandur = new Pandur("Mirko ", "Mirkovic");
        Pandur pandur1 = new Pandur("a", "b");
        pandur.deriSe();
        pandur.predstaviSe();
    }
}
