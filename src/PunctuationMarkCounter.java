public class PunctuationMarkCounter {
    public int count(String phrase) {
        char[] charArray = phrase.toCharArray();
        int k = 0;
        for(int i = 0; i < charArray.length; i++) {
            if(charArray[i] == '.' || charArray[i] == ',' || charArray[i] == '!' || charArray[i] == ':' || charArray[i] == ';') {
                k++;
            }
        }
        return k;
    }
}
