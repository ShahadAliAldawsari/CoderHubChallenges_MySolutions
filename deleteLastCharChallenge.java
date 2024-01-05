
public class deleteLastCharChallenge {
    public static void main(String[] args) {
        System.out.println(deleteLastChar("CoderHub"));

    }

    public static String deleteLastChar(String word) {
        String new_word = "";
        for (int i = 0; i < word.length() - 1; i++) {
            new_word += word.charAt(i);
        }
        return new_word;
    }

}
