package ObiectCobstructor;

    public class Avion {

        //    class = sablon care defineste propr si comportamentul unei entitati specifice
        //    Intr-un fisier java putem avea mai multe clase diferentiate  pe baza numelui ( nu e practice buns a avem mai multe clase cu acelais nume)
        //   intr-o clasa putem defini toate proprietatile si actiunie unei entitati
        //    varabila = proprietatea unei clase
        //    variabilele sunt de 2 feluri : Globale si Locale
        //    variabila globala = vizibile peste tot in proeict
        //    variabila locala = vizibila doar unde e declarata
        //    Ca sa definim o variablia globala ne trebuie: accescontrol(public) tip variablila nume variabila
        //    metoda = actiunea unei clase
        //    exsita 2 tipuri metode: void si return
        //

        public String tip;
        public String marca;
        public String model;
        public Integer capacitatePasageri;
        public String combustibil;
        public Integer numbarBagaje;

        public Avion(String tip, String marca, String model, Integer capacitatePasageri, String combustibil) {
            this.tip = tip;
            this.marca = marca;
            this.model = model;
            this.capacitatePasageri = capacitatePasageri;
            this.combustibil = combustibil;
        }

        public Avion(String tip, String marca, String model, Integer capacitatePasageri, String combustibil, Integer numbarBagaje) {
            this.tip = tip;
            this.marca = marca;
            this.model = model;
            this.capacitatePasageri = capacitatePasageri;
            this.combustibil = combustibil;
            this.numbarBagaje = numbarBagaje;
        }

        public void prezentareAvion() {

            System.out.println("Tipul avionului este: " + tip);
            System.out.println("Marca este: " + marca);
            System.out.println("Modelul este: " + model);
            System.out.println("Capacitate este: " + capacitatePasageri);
            System.out.println("Combustibil este: " + combustibil);
            if (numbarBagaje != null) {
                System.out.println("NumbarBagaje este: " + numbarBagaje);
            } else {
                System.out.println("Nu are bagaje ");

            }

        }
}
