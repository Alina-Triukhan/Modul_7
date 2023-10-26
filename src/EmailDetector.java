public class EmailDetector {
    public boolean isPresent(String text) {
        boolean isHave = false;
        if(text.contains("@") && (text.charAt(text.indexOf("@")-1) != ' ') && (text.charAt(text.indexOf("@")+1) != ' ') && (text.charAt(text.indexOf("@")-2) != ' ') && (text.charAt(text.indexOf("@")+2) != ' ')) {
            isHave = true;
        }
        return isHave;
    }
}
