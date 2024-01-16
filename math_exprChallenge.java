// Challenge Link: https://coderhub.sa/challenges/eee774ad-b85b-4ab1-957b-11de84a5ac8b/view?language=Java
public class math_exprChallenge {
    public static void main(String[] args) {
        System.out.println(math_expr("6-1"));
    }

    public static boolean math_expr(String expr) {
        // write your code here
        String[] arr_expr = expr.split("[*+/-]");
        int expr_values;
        for (int i = 0; i < arr_expr.length; i++) {
            try {
                expr_values = Integer.valueOf(arr_expr[i]);
            } catch (Exception e) {
                return false;
            }

        }
        return true;
    }
}
