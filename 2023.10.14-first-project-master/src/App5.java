public class App5 {
    public static void main(String[] args) {
        /*int a = 7;
        if(a == 7) {
            System.out.println("To jest liczba 7 !!!");
            //???
            //??
            //??
        } else if(a > 5) {
            System.out.println("To jest liczba 8 !!!");
        } else if(a == 9) {
            System.out.println("To jest liczba 9 !!!");
        } else {
            System.out.println("Nie wiadomo co to jest !!!");
        }*/

        int x;
        int zmienna = 8;
        switch(zmienna) {
            case 1:
                System.out.println("To jest 1 !!");
                break;
            case 2:
                System.out.println("To jest 2 !!");
                break;
            case 3:
                System.out.println("To jest 3 !!");
                break;
            default:
                System.out.println("Nie wiadomo co to jest !!");
                break;
        }

        if(zmienna == 1) {
            System.out.println("To jest 1 !!");
        } else if(zmienna == 2) {
            System.out.println("To jest 2 !!");
        } else if(zmienna == 3) {
            System.out.println("To jest 3 !!");
        } else {
            System.out.println("Nie wiadomo co to jest !!");
        }

        /*int krok = 2;
        switch (krok) {
            case 1:
                System.out.println("1 krok !!");
            case 2:
                System.out.println("2 krok !!");
            case 3:
                System.out.println("3 krok !!");
            case 4:
                System.out.println("4 krok !!");
            case 5:
                System.out.println("5 krok !!");
        }*/

        System.out.println("Koniec programu !!");
    }
}
