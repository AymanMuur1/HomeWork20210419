import java.util.Arrays;

public class A5 {
    public static void main(String[] args) {
        int len = 5;
        int initialValue = 6;
       int[] a = two(11,12);
        System.out.println(Arrays.toString(a));
    }

    private static int[] two(int len, int initialValue) {
        int[] a = new int[len];
        for(int i = 0; i < a.length; i++){
            a[i] = initialValue;
        }
        return a;
    }
    }
