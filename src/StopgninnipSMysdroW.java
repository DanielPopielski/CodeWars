import java.util.Arrays;

public class StopgninnipSMysdroW {
    public String spinWords(String sentence) {
        String[] words = sentence.replaceAll(",", "").split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        System.out.println(Arrays.toString(words));

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() >= 5) {
                reversedSentence.append(new StringBuilder(word).reverse());
            } else {
                reversedSentence.append(word);
            }

            if (i < words.length - 1) {
                reversedSentence.append(" ");
            }
        }

        return reversedSentence.toString();
    }
}
