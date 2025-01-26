package lectia5variabilealternative;

import org.testng.annotations.Test;

public class StructuriAlternative {

    //    StucturiAlternative = if-then-else; switch-case

    @Test
    public void metodaTest() {
        metodaVerificareNumar(7);
        metodaVerificareNumar(3);
        metodaVerificareNumar(5);

        metodaVerificareNumarParPozitiv(8);
        metodaVerificareNumarParPozitiv(3);
        metodaVerificareNumarParPozitiv(-5);
        metodaVerificareNumarParPozitiv(-6);
        metodaVerificareNumarParPozitiv(0);
        zileSaptmana(3);
    }

    //    verificam un numar mai mare decat 5
    public void metodaVerificareNumar(int numar) {

        if (numar > 5) {
            System.out.println("Numarul " + numar + " e mai mare decat 5");
        } else if (numar < 5) {
            System.out.println("Numarul " + numar + " e mai mic decat 5");
        } else {
            System.out.println("Numarul " + numar + " e egal cu 5");
        }
    }

    //    verificam daca un numar este par pozitiv sau par negativ
    public void metodaVerificareNumarParPozitiv(int numar2) {
        if (numar2 > 0) {
            if (numar2 % 2 == 0) {
                System.out.println("Numarul " + numar2 + " e numar par pozitiv");
            } else {
                System.out.println("Numarul " + numar2 + " e numar impar pozitiv");
            }
        } else if (numar2 < 0) {
            if (numar2 % 2 == 0) {
                System.out.println("Numarul " + numar2 + " e numar par negativ");
            } else {
                System.out.println("Numarul " + numar2 + " e numar impar negativ");
            }
        } else if (numar2 == 0) {
            System.out.println("Numarul " + numar2 + " e egal cu 0");
        }
    }

    //    Exemplu switch case
    public void zileSaptmana(Integer zi) {
        switch (zi) {
            case 1:
                System.out.println("Azi e Luni");
                break;
            case 2:
                System.out.println("Azi e Marti");
                break;
            case 3:
                System.out.println("Azi e Miercuri");
                break;
            case 4:
                System.out.println("Azi e Joi");
                break;
            case 5:
                System.out.println("Azi e Vineri");
                break;
            case 6:
                System.out.println("Azi e Sambata");
                break;
            case 7:
                System.out.println("Azi e Duminica");
                break;
            default:
                System.out.println("Nu mai sunt cazuri de zile ale saptamanaii");
        }

    }

}
