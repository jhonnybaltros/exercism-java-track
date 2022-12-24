import java.util.HashSet;
import java.util.Set;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        Set<Character> charSet = new HashSet<>();
        String concatenatedPhrase = phrase.replaceAll("[- ]", "");
        concatenatedPhrase = concatenatedPhrase.toLowerCase();

        for (int i = 0; i < concatenatedPhrase.length(); i++) {
            if (charSet.contains(concatenatedPhrase.charAt(i))) {
                return false;
            }
            charSet.add(concatenatedPhrase.charAt(i));
        }
        return true;
    }
}