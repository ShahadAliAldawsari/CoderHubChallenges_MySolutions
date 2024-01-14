
// Challlenge Link: https://coderhub.sa/challenges/e35bb082-6cc1-4aa9-89f5-03077f5ab9f3/view?language=Java

public class cap_spaceChallenge {
    public static void main(String[] args) {
        System.out.println(cap_space("thankYou"));
    }

    public static String cap_space(String txt) {
        // write your code here
        for (int i = 0; i < txt.length(); i++) {
            if (Character.isUpperCase(txt.charAt(i))) {
                txt = txt.replace(txt.charAt(i) + "", (" " + txt.charAt(i)).toLowerCase());
            }

        }
        return txt;
    }
}