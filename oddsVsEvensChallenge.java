
// Challenge link: https://coderhub.sa/challenges/3e97adbc-137b-46c2-9ec4-2532cebacbdf/view?language=Java
public class oddsVsEvensChallenge {

    public static void main(String[] args) {
        System.out.println(oddsVsEvens(26341));

    }

    public static String oddsVsEvens(int num) {
        // write your code here
        int digit, oddSum = 0, evSum = 0;
        String result = "";
        while (num > 0) {
            digit = num % 10;
            // System.out.println("digit " + digit);
            if (digit % 2.0 == 0.0) {
                evSum += digit;
                // System.out.println("evSum " + evSum);
            } else {
                oddSum += digit;
                // System.out.println("oddSum " + oddSum);
            }
            num /= 10;
        }
        if (evSum > oddSum)
            result = "even";

        else if (evSum < oddSum)
            result = "odd";

        else
            result = "equal";

        return result;

    }

}
