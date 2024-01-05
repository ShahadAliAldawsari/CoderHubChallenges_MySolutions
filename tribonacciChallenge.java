
// Challenge Link: https://coderhub.sa/challenges/fefdfb08-8157-4dfb-b467-3f924b11e42b/view?language=Java

public class tribonacciChallenge {
    public static void main(String[] args) {
        int input = 9;
        for (int i = 0; i < input; i++) {
            System.out.print(tribonacci(input)[i] + " ");
        }
    }

    public static int[] tribonacci(int num) {
        // write your code here
        int[] result = new int[num];
        for (int i = 0; i < num; i++) {
            if (i < 3) {
                result[i] = 1;
            } else if (i >= 3) {
                result[i] = result[i - 1] + result[i - 2] + result[i - 3];
            }
        }
        return result;
    }
}
