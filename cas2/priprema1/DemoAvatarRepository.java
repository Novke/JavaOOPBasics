package org.example.cas2.priprema1;

public class DemoAvatarRepository extends AvatarRepository{

    private int broj =1;
    private String pocetak;
    private static int nnn = 1;

    public DemoAvatarRepository(String pocetak) {
        this.pocetak = pocetak;
    }

    @Override
    public Avatar getRandomAvatar() {


        Avatar avatar = new Avatar(pocetak + "/" + nnn + ".png", "Avatar " + nnn, izracunajBoju(nnn));

        nnn = nnn + 33;

        return avatar;
    }

    @Override
    public Avatar getAvatarByName(String name) {

        Avatar avatar = new Avatar(pocetak + "/" + nnn +".png", "naziv ", izracunajBoju(broj));

        nnn = nnn + 33;
        return avatar;
    }

    private String izracunajBoju(int n){
        int ost = n % 10;
        switch (ost){
            case 0: return "crvena";
            case 1: return "plava";
            case 2: return "zelena";
            case 3: return "zuta";
            case 4: return "ljubicasta";
            case 5: return "narandzasta";
            case 6: return "bela";
            case 7: return "crna";
            case 8: return "siva";
//            case 9: return "tirkizna";
            default: return "tirkizna";
        }
    }

}
