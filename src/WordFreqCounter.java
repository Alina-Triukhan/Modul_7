public class WordFreqCounter {
    private String phrase;
    private String word;

    public float countFreq(String phrase, String word) {
        float k = 0;
        String[] arr = phrase.toLowerCase().split(" ");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(word.toLowerCase())) {
                k++;
            }
        }

        return k / arr.length;
    }
}
