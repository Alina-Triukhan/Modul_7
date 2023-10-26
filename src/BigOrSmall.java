public class BigOrSmall {
    public String calculate(String text) {
        char[] arrText = text.toCharArray();
        int s = 0;
        int b = 0;
        String res = "";
        for (int i = 0; i < arrText.length; i++) {
            if (arrText[i] >= 'a' && arrText[i] <= 'z') {
                s++;
            }
            if (arrText[i] >= 'A' && arrText[i] <= 'Z') {
                b++;
            }
        }
        if(s > b) {
            res = "Small";
        }
        if(s < b) {
            res = "Big";
        }
        if(s == b) {
            res = "Same";
        }
        return res;
    }
}
