public class App4 {
    public static void main(String[] args) {
        String[] imiona = new String[57];
        imiona[0] = "Janusz";
        imiona[1] = "Karol";
        imiona[2] = "Zbyszek";
        imiona[6] = "Wiesiek";

        System.out.println(imiona[0]);
        System.out.println(imiona[1]);
        System.out.println(imiona[2]);

        int[] liczby = {345,345,3421,7,536,23,76,23,356,23};

        System.out.println(liczby[0]);
        System.out.println(liczby[3]);
        System.out.println(liczby[6]);

        int a;
        int[] a2;
        int[][] tablica2D = new int[10][10];

        tablica2D[0][1] = 7;
        tablica2D[1][5] = 9;

        System.out.println(tablica2D[1][5]);

        int[][][] tablica3D = new int[3][3][3];
        tablica3D[0][1][2] = 19;

        int[] innerTab = tablica2D[0];

        String[] tab = {"mateusz", "janusz", "karol"};
        System.out.println(tab[0]);

        //String[] tab2 = "{mateusz, janusz}";

        //int[] tab3 = {5, 7, 8, "String"};

        int[][] tab4 = {
                {1,2,3},
                {2,3,4},
                {3,4,5}
        };

        int[][][] tab5 = {
                {{1,2,3},{2,3,4}},
                {{3,4,5},{4,5,6}}
        };

        String imie = tab[1];
    }
}
