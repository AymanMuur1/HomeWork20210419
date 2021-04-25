import java.util.Arrays;

public class Lesson3 {
    public static void main(String[] args) {

        twoNumber();
    }
        private static void twoNumber() {
        int[] mass = {0, 0, 0, 1, 1, 1};
        System.out.println(Arrays.toString(mass));
        for (int i = 0; i < mass.length; i++){
            int replacement = mass[i];
            if (replacement >= 1){
                System.out.print(replacement - replacement + " ");
            }else{
                System.out.print((replacement - replacement) + 1 + " ");
            }




        }
    }
    }

