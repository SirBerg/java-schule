public class Bruch {
    double zaehler;
    double nenner;
    public Bruch(double zaehler, double nenner){
        this.zaehler = zaehler;
        this.nenner = nenner;
    }
    public double getZaehler(){
        return zaehler;
    }
    public double getNenner(){
        return nenner;
    }
    public double getDezimal(){
        return zaehler/nenner;
    }

    public void kuerzen(){
        double a = zaehler;
        double b = nenner;
        while (b != 0){
            double h = a % b;
            a = b;
            b = h;
        }
        this.zaehler = zaehler/a;
        this.nenner = nenner/a;
        System.out.println("Ggt: " + a);
        return;
    }
}
