
public class Main {
    public static void main(String[] args) {

        // Задача 1
        int [] ints = {1, 2, 3};
        double [] doubles = {1.57, 7.654, 9.986};
        boolean [] booleans = new boolean[2];

        // Задача 2
        for (int i = 0; i < ints.length; i++) {
            if (i == ints.length - 1) {
                System.out.print(ints[i] + "");
                break;
            }
            System.out.print(ints[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < doubles.length; i++) {
            if (i == doubles.length - 1) {
                System.out.print(doubles[i] + "");
                break;
            }
            System.out.print(doubles[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < booleans.length; i++) {
            if (i == booleans.length - 1) {
                System.out.print(booleans[i] + "");
                break;
            }
            System.out.print(booleans[i] + ", ");
        }
        System.out.println();

        // Задача 3
        for (int i = ints.length -1; i != -1; i--) {
            if (i == 0) {
                System.out.print(ints[i] + "");
                break;
            }
            System.out.print(ints[i] + ", ");
        }
        System.out.println();
        for (int i = doubles.length -1; i != -1; i--) {
            if (i == 0) {
                System.out.print(doubles[i] + "");
                break;
            }
            System.out.print(doubles[i] + ", ");
        }
        System.out.println();
        for (int i = booleans.length - 1; i != -1; i--) {
            if (i == 0) {
                System.out.print(booleans[i] + "");
                break;
            }
            System.out.print(booleans[i] + ", ");
        }
        System.out.println();

        // Задача 4
        for (int i = 0; i < ints.length; i++) {

            if (ints[i] % 2 != 0) {
                ints[i] += 1;
            }

            if (i == ints.length - 1) {
                System.out.print(ints[i] + "");
                break;
            }

            System.out.print(ints[i] + ", ");
        }
        // Задача 5

        // Задача 6

        // Задача 7

        // Задача 8
    }
}

