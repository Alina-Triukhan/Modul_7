public class NameCounter {
    public int count(String text) {
        int k = 0;
        String[] arrText = text.split(" ");

        for (int i = 0; i < arrText.length; i++) {
            char[] arrWords = arrText[i].toCharArray();

            for (int j = 1; j < arrWords.length; j++) {
                if ((arrWords[j - 1] >= 'A' && arrWords[j - 1] <= 'Z') && (arrWords[j] >= 'a' && arrWords[j] <= 'z')) {
                    k++;
                }
            }
        }
        return k;
    }
}
//виконання коду new NameCounter().count("Mars is great planet") повертає 1;
//виконання коду new NameCounter().count("Moon is near Earth") повертає 2;
//виконання коду new NameCounter().count("SPACE IS GREAT") повертає 0.
