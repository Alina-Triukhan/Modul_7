public class SensitiveDataSearcher {
    public boolean isSensitiveDataPresent(String phrase) {
        boolean isHave = false;
        if(phrase.toLowerCase().contains("pass") || phrase.toLowerCase().contains("key") || phrase.toLowerCase().contains("login") || phrase.toLowerCase().contains("email")) {
            isHave = true;
        }
        return isHave;
    }
}
