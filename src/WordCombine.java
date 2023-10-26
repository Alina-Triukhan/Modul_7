public class WordCombine {
    public boolean canCombine(String sourceWord, String targetWord) {
        char[] arrTargetWord = targetWord.toLowerCase().toCharArray();
        char[] arrSourceWord = sourceWord.toLowerCase().toCharArray();
        boolean isCan = false;
        for (int i = 0; i < arrTargetWord.length; i++) {
            for (int j = 0; j < arrSourceWord.length; j++) {
                if(arrTargetWord[i] == arrSourceWord[j]) {
                    isCan = true;
                }
            }
        }
        return isCan;
    }
}
//виконання коду new WordCombine().canCombine("Forest", "tor") повертає true;
//виконання коду new WordCombine().canCombine("Magic", "Mama") повертає true;
//виконання коду new WordCombine().canCombine("War", "Piece") повертає false.