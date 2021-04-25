 public class A4 {
    public static void main(String[] args) {

        int a = 1;
        int[][] number = new int[5][5];
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length; j++) {
                if (i == j){
                    number[i][j] = 1;
            }else {
                }
                   System.out.print(number[i][j] + " ");
            }

            System.out.println();
        }}}