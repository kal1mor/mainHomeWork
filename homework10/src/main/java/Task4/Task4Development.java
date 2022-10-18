package Task4;


public class Task4Development {

    void massiveInitialization() {

        int masDepth = 2 + (int) (Math.random() * 3);
        int masLines = 2 + (int) (Math.random() * 3);
        int masColumns = 2 + (int) (Math.random() * 3);

        int[][][] massive = new int[masDepth][masLines][masColumns];

        for (int massive3D = 0; massive3D < massive.length; massive3D++) {
            for (int massive2D = 0; massive2D < massive[massive3D].length; massive2D++) {
                for (int massive1D = 0; massive1D < massive[massive3D][massive2D].length; massive1D++) {
                    massive[massive3D][massive2D][massive1D] = 10 + (int) (Math.random() * 89);
                    System.out.print(massive[massive3D][massive2D][massive1D] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

}
