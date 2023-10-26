public class PhraseMaker {
    public String join(String[] words) {
        //String result = "";
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() <= 3) {
                word = word.toUpperCase();
            } else {
                word = word.toLowerCase();
            }
            sb.append(word);
            if (i != words.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
