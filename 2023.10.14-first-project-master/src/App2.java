public class App2 {
    public static void main(String[] args) {
        double x = 13.0;
        double y = 5.0;

        System.out.println(x);
        System.out.println(y);
        System.out.println(x % y);

        System.out.println((x - (x % y)) / y);

        //czesc calkowita z dzielenia
        int wynik = (int) (x / y);
        System.out.println(wynik);

        String imie = "Mateusz";
        String nazwisko = "Bereda";

        String wynik2 = imie + " " + nazwisko;
        System.out.println(wynik2);

        int a = 7;
        int b = 7;
        System.out.println(a >= b);

        boolean b1 = true;
        boolean b2 = false;

        System.out.println(!b1);
    }
}
