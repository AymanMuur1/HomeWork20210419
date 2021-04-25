import java.util.Arrays;

public class A2 {
    public static void main(String[] args) {

        int a = 1;
        int[] number = new int[100];
        for (int i = 0; i < 100; i++) {
            number[i] = a;
            a++;
        }

            System.out.println(Arrays.toString(number));
        }



}




