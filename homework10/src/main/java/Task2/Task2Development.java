package Task2;

public class Task2Development {

    void massiveInitialization() {

        int[][][] massive = new int[][][]{
                {
                        {1, 2, 3},
                        {4, 5},
                        {6, 7, 8, 9}
                },
                {
                        {10},
                        {11, 12, 13, 14, 15},
                        {16, 17, 18, 19, 20, 21}
                }
        };

        System.out.println("Line output:");

        for (int[][] massive2D : massive) {
            for (int[] massive1D : massive2D) {
                for (int element : massive1D) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Column output:");
        for (int[][] massive2D : massive) {
            for (int[] massive1D : massive2D) {
                for (int element : massive1D) {
                    System.out.println(element);
                }
                System.out.println();
            }

        }


    }
}
