package org.example.cas1.klase;

public class SpecificnaKlasa extends Klasa{

    int privPolje;
    int protPolje;

    void ispisiPrivatnaPolja(){
        System.out.println("specificno polje: " + protPolje);
        System.out.println("ono iznad polje: " + super.protPolje); //pristup poljima klase iznad je preko SUPER
        //isto vazi i za metode, ako je ona iznad istog imena mora da se poziva preko SUPEr

    }

}
