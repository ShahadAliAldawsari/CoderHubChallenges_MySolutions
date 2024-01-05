// Challenge link: https://coderhub.sa/challenges/033163c2-91be-4f1b-b0c0-01aff0811448/view?language=Java
public class addStrNumsChallenge {
    public static void main(String[] args) {
        System.out.println(addStrNums("a", "1"));
    }

    public static String addStrNums(String num1, String num2) {
        // write your code here
        try {
            int int_num1 = Integer.valueOf(num1);
            int int_num2 = Integer.valueOf(num2);

            return Integer.toString(int_num1 + int_num2);
        } catch (Exception e) {
            return "-1";
        }
    }
}