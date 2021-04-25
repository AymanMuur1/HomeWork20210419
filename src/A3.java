import java.util.Arrays;

public class A3 {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(array));
        for(int i = 0; i < array.length; i++){
            int a = array[i];
            if (a < 6){
            /*    System.out.print(array[i] * 2 + " ");*/
                array[i] = array[i] * 2;
            }
        }System.out.println(Arrays.toString(array));
    }
}
