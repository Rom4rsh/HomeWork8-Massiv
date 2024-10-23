import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1");

        int[] whole = new int[]{1, 2, 3};

        float[] fractional = {1.57f, 7.654f, 9.986f};

        int[] hi = new int[7];


        //Задача 2
        System.out.println("Задача 2");


        for (byte i = 0; i < whole.length; i++) {
            if (i == whole.length - 1) {
                System.out.println(whole[i]);
                break;
            }
            System.out.print(whole[i] + ",");
        }

        for (int i = 0; i < fractional.length; i++) {
            if (i == fractional.length - 1) {
                System.out.println(fractional[i]);
                break;
            }
            System.out.print(fractional[i] + ",");
        }

        for (int i = 0; i < hi.length; i++) {
            if (i == hi.length - 1) {
                System.out.println(hi[i]);
                break;
            }
            System.out.print(hi[i] + ",");
        }


        //Задача 3
        System.out.println("Задача 3");

        for (int i = whole.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(whole[i]);
                break;
            }
            System.out.print(whole[i] + ",");
        }

        for (int i = fractional.length - 1; i >= 0; i--) {
            {
                if (i == 0) {
                    System.out.println(fractional[i]);
                    break;
                }
                System.out.print(fractional[i] + ",");
            }

        }

        for (int i = hi.length - 1; i >= 0; i--) {
            {
                if (i == 0) {
                    System.out.println(hi[i]);
                    break;
                }
                System.out.print(hi[i] + ",");

            }

        }


        // Задача 4
        System.out.println("Задача 4");

        for (int i = 0; i < whole.length; i++) {
            if (whole[i] % 2 != 0) {
                whole[i] = whole[i] + 1;
            }
        }
        System.out.println(Arrays.toString(whole));
    }
}






















