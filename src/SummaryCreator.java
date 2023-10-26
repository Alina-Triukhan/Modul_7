public class SummaryCreator {
    public String create(String text) {
        String res = "";
        if (text.length() <= 15) {
            res = text;
        }
        if(text.length() >= 16 && text.charAt(15) == ' ') {
            res = text.substring(0, 15);
        }
        if(text.length() >= 16 && text.charAt(15) != ' ') {
            res = text.substring(0, 15) + "...";
        }
        return res;
    }
}
