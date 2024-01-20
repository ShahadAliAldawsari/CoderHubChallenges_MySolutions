
// Challenge Link: https://coderhub.sa/challenges/a25be439-0887-4775-9498-ec36eb413888/view?language=Java

public class first_n_vowelsChallenge {
    public static void main(String[] args) {
        System.out.println(first_n_vowels("ShahadAli", 4));
    }

    public static String first_n_vowels(String phrase, int n) {
        String vowels = "";
        for (int i = 0; i < phrase.length(); i++) {
            if (n == 0)
                break;
            if ("aeiou".contains(phrase.toLowerCase().charAt(i) + "")) {
                vowels += phrase.charAt(i);
                n -= 1;
            }
        }
        if (n > 0)
            return "invalid";
        return vowels;
    }
}
