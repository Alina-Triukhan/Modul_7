public class DigitText {
    private String text;
    public boolean detect(String text) {
        boolean isHave = true;
        for(int i=0; i<text.length(); i++) {
            if((text.charAt(i)>='A' && text.charAt(i)<='Z') || (text.charAt(i)>='a' && text.charAt(i)<='z')) {
                isHave = false;
            }
        }
        return isHave;
    }
}
