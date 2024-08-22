package org.example.cas4.ispit3;

public class StudentFactory {

    public static Student getInstance(String index, String ime, String prezime) throws Exception{
        char cifraStudija = index.charAt(4);

        String smer= "";
        char cifraSmer = index.charAt(5);

        switch (cifraStudija) {

            case '1', '2', '3', '4', '5':{
                //OSNOVNE STUDIJE
                switch (cifraSmer) {
                    case '0':
                        smer = "Informatika i racunarstvo";
                        break;
                    case '1':
                        smer = "Posl Ekon";
                        break;
                    case '2':
                        smer = "Inform i Rac";
                        break;
                    case '3':
                        smer = "Informacione tehn";
                        break;
                    case '4':
                        smer = "Turizam";
                        break;
                    case '5':
                        smer = "Softversko";
                        break;
                    case '6':
                        smer = "Menadzmnent sport";
                        break;
                    case '7':
                        smer = "Fizicko";
                        break;
                    case '8':
                        smer = "Turizam";
                        break;
                    case '9':
                        smer = "Grupa smerova";
                        break;
                }

                return new StudentOsnovne(ime, prezime, smer, index);

//                break; //ne treba jer ima return gore
            }

            case '6', '7':{
                //MASTER

                switch (cifraSmer) {
                    case '0','1','2':
                        smer = "m1";
                        break;
                    case '3':
                        smer = "m2";
                        break;
                    case '4':
                        smer = "m3";
                        break;
                    case '5', '6', '7': smer = "m4";
                        break;
                    case '8':
                        smer = "m5";
                        break;
                    case '9':
                        smer = "m6";
                        break;
                }

                return new StudnetMaster(ime, prezime, smer, index);

//                break;
            }

            case '8', '9':{
                switch (cifraSmer) {
                    case '0':
                        smer = "Informatika i racunarstvo";
                        break;
                    case '1':
                        smer = "Posl Ekon";
                        break;
                    case '2':
                        smer = "Inform i Rac";
                        break;
                    case '3', '4':
                        smer = "Napredni";
                        break;
                    case '5', '6':
                        smer = "Softversko";
                        break;
                    case '7', '8', '9':
                        smer = "Fizicko";
                        break;
                }

                return new StudentDoktorske(ime, prezime, smer, index);
            }

            default: return new StudentDoktorske(ime, prezime, smer, index);

        }

    }

}
