public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto(20, 10, 6);
        System.out.println(auto.getTankinhalt());
        System.out.println(auto.getTankvolumen());
        System.out.println(auto.getVerbrauchPro100km());
        System.out.println(auto.istErreichbar(100));
        System.out.println(auto.tanken(10));
        System.out.println(auto.getTankinhalt());
        System.out.println(auto.fahren(100));
        System.out.println(auto.getTankinhalt());
    }
}