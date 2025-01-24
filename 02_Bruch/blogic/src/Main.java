public class Main {
    public static void main(String[] args) {
        Bruch b = new Bruch(105, 10);
        System.out.println(b.getZaehler());
        System.out.println(b.getNenner());
        System.out.println(b.getDezimal());
        b.kuerzen();
        System.out.println(b.getZaehler());
        System.out.println(b.getNenner());
        System.out.println(b.getDezimal());
    }
}