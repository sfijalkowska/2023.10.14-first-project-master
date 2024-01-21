public class App6 {
    public static void main(String[] args) {
        int[] tab = new int[5000];
        for(int i = 0; i < 5000; i++) {
            tab[i] = i;
        }

        /*for(int liczba : tab) {
            liczba = 5;
        }*/

        for(int i = 0; i < 5000; i++) {
            System.out.println("Element pod indeksem " + i + ": " + tab[i]);
        }

        /*for(int liczba : tab) {
            System.out.println(liczba);
        }*/

        /*int[][] tab2D = new int[10][10];
        for(int row = 0; row < 10; row++) {
            for(int col = 0; col < 10; col++) {
                tab2D[row][col] = 5;
            }
        }

        for(int row = 0; row < 10; row++) {
            for(int col = 0; col < 10; col++) {
                System.out.print(tab2D[row][col] + " ");
            }
            System.out.println();
        }*/

        //System.out.println("Koniec programu !!");

        /*int[][] tablica2D = new int[10][10];

        for(int[] innerTab : tablica2D) {
            for(int liczba : innerTab) {

            }
        }*/
    }
}
