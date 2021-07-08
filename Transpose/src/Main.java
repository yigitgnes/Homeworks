public class Main {
    public static void main(String args[]) {

        int original[][] = {{1, 3, 4}, {2, 4, 3}};


        int transpose[][] = new int[3][2];


        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[i].length; j++) {
                transpose[j][i] = original[i][j];
            }
        }

        System.out.println("Printing Matrix without transpose:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(original[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Printing Matrix After Transpose:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}