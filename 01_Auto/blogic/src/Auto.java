public class Auto {
    private double tankvolumen = 20;
    private double tankinhalt = 10;
    private double verbrauchPro100km = 6;
    public Auto(double tankvolumen, double tankinhalt, double verbrauchPro100km){
        this.tankinhalt = tankinhalt;
        this.tankvolumen = tankvolumen;
        this.verbrauchPro100km = verbrauchPro100km;
    }
    public double getTankinhalt(){
        return this.tankinhalt;
    }

    public double getTankvolumen(){
        return this.tankvolumen;
    }

    public double getVerbrauchPro100km(){
        return this.verbrauchPro100km;
    }

    public boolean istErreichbar(double kilometer){
            return this.tankinhalt >= kilometer * this.verbrauchPro100km / 100;
    }

    public boolean tanken(double liter){
        if(liter < 0 || this.tankinhalt + liter > this.tankvolumen){
            return false;
        }

        this.tankinhalt += liter;
        return true;
    }

    public boolean fahren(double kilometer){
            if(kilometer < 0 || !this.istErreichbar(kilometer)){
            return false;
        }

        this.tankinhalt -= kilometer * this.verbrauchPro100km / 100;
        return true;
    }
}
