package lectia7datastructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;

public class Multimi {
//    Multimi: array, list, map
    @Test
    public void multimiExemple() {
//        colegiCursArray();
//        colegiCursLista();
//        colegiCursMap();
        tariOrase();
    }
//  Exemplu Array
    public void colegiCursArray() {
        String[] colegi = new String[6];
        colegi[0] = "Coleg1";
        colegi[1] = "Coleg2";
        colegi[2] = "Coleg3";
        colegi[3] = "Coleg4";
        colegi[4] = "Coleg5";
        colegi[5] = "Coleg6";
        for (int index = 0; index < colegi.length; index++) {
            System.out.println("Numele colegilor este: " + colegi[index]);
        }
    }
//    Exemplu Lista
    public void colegiCursLista() {
        List<String> colegi = new ArrayList<String>();
        colegi.add("Coleg1");
        colegi.add("Coleg2");
        colegi.add("Coleg3");
        colegi.add("Coleg4");
        colegi.add("Coleg5");
        colegi.add("Coleg6");
        colegi.add("Coleg7");
//        for (int index = 0; index < colegi.size(); index++) {
//            System.out.println("Numele colegilor este: " + colegi.get(index));
//        }
        int index = 0;
        while (index < colegi.size()) {
            System.out.println("Numele colegilor este: " + colegi.get(index));
            index++;
        }

    }

//    Exemplu Map
//    map - cheie = valoare
    public void colegiCursMap() {
        HashMap<String, String> colegi = new HashMap();
        colegi.put("NumeColeg1", "Coleg1");
        colegi.put("NumeColeg2", "Coleg2");
        colegi.put("NumeColeg3", "Coleg3");
        colegi.put("PrenumeColeg1", "Coleg1Prenume");
        colegi.put("PrenumeColeg2", "Coleg2Prenume");
        colegi.put("PrenumeColeg3", "Coleg3Prenume");
        for (String key : colegi.keySet()) {
            System.out.println("Cheia este: " + key);
            System.out.println("Valoarea cheilor este: " + colegi.get(key));
        }
    }

    public void tariOrase(){
        HashMap<String, List<String>> clasificare = new HashMap<>();

        List<String> oraseRomania = new ArrayList<>();
        oraseRomania.add("Cluj");
        oraseRomania.add("Mures");
        oraseRomania.add("Brasov");

        List<String> oraseItalia = new ArrayList<>();
        oraseItalia.add("Roma");
        oraseItalia.add("Palermo");
        oraseItalia.add("Catania");

        List<String> oraseSpania = new ArrayList<>();
        oraseSpania.add("Malaga");
        oraseSpania.add("Valencia");
        oraseSpania.add("Sevillia");

        clasificare.put("Romania", oraseRomania);
        clasificare.put("Italia", oraseItalia);
        clasificare.put("Spania", oraseSpania);

        for (String key : clasificare.keySet()) {
            System.out.println("Tara este este: " + key);
            System.out.println("Orasele sunt : " + clasificare.get(key));
        }

    }

}
