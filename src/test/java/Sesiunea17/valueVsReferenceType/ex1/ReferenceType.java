package Sesiunea17.valueVsReferenceType.ex1;

public class ReferenceType {
    public static void main(String[] args) {
        String st1 = new String("hello");
        String st2 = st1;

        int integer1 = 2;
        int integer2 = 2;

        if (integer1 == integer2) {
            System.out.println("integer == integer2");
        } else {
            System.out.println("integer != integer2");
        }

        System.out.println("--------------------------------------------------");

        // mai in jos se compara referintele de alocare in string si nu continutul lor. Drept urmare aceasta comparatie nu este adevarata deoarece sunt diferite referintele

        if (st1==st2) {
            System.out.println("Valorile sunt la fel");

    } else {
            System.out.println("Valorile nu sunt la fel");
        }

    }



}
