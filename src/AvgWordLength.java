public class AvgWordLength {
    public double count(String phrase) {
        String[] arr = phrase.split(" ");
        double len = 0;
        for (int i = 0; i < arr.length; i++) {
            len += arr[i].length();
        }

        return len / arr.length;
    }
}
