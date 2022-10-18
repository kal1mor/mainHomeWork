package Task3;

import java.util.Arrays;

public class Task3Development {

    void massiveInitialization() {

        int[][] massive = new int[2][5];
        boolean isSorted = false;
        int buf;
        for (int massive2D = 0; massive2D < massive.length; massive2D++) {
            for (int massive1D = 0; massive1D < massive[massive2D].length; massive1D++) {
                massive[massive2D][massive1D] = (int) (Math.random() * 10);
            }
        }

        System.out.println("Unsorted massive:\n" + Arrays.deepToString(massive));

        System.out.println();

        while (!isSorted) {
            isSorted = true;
            for (int massive2D = 0; massive2D < massive.length; massive2D++) {
                for (int massive1D = 0; massive1D < massive[massive2D].length - 1; massive1D++) {
                    if (massive2D == 0) {
                        if (massive[massive2D][massive1D] > massive[massive2D][massive1D + 1]) {
                            isSorted = false;
                            buf = massive[massive2D][massive1D];
                            massive[massive2D][massive1D] = massive[massive2D][massive1D + 1];
                            massive[massive2D][massive1D + 1] = buf;
                        }
                    }

                    if (massive2D == 1) {
                        if (massive[massive2D][massive1D] < massive[massive2D][massive1D + 1]) {
                            isSorted = false;
                            buf = massive[massive2D][massive1D];
                            massive[massive2D][massive1D] = massive[massive2D][massive1D + 1];
                            massive[massive2D][massive1D + 1] = buf;
                        }
                    }

                }
            }
        }

        System.out.println("Sorted massive:");

        for (int massive2D = 0; massive2D < massive.length; massive2D++) {
            for (int massive1D = 0; massive1D < massive[massive2D].length; massive1D++) {
                System.out.println(massive[massive2D][massive1D]);
            }
            System.out.println();
        }
    }
}
