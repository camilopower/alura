public class testaarraymulti {
    public static void main(String[] args) {

        int[][] tabela;
        int[][] cubo;
        int[][] hipercubo[][];

        tabela = new int[10][5];
        cubo = new int[10][];

        int[][] teste = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};


        int[][] estranha = new int[2][];
        estranha[0] = new int[20];
        estranha[1] = new int[10];
        for (int i = 0; i < estranha.length; i++) {
            System.out.println(estranha[i].length); // imprime 20 e 10
        }
    }
}