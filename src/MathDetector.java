public class MathDetector {
    public boolean isMath(String text) {
        char[] arr = text.toCharArray();
        int k = 0;
        boolean isM = false;
        boolean isHavaSign = false;
        boolean isHaveResult = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= '0' && arr[i] <= '9') {
                k++;
            }
            if(arr[i] == '+' || arr[i] == '-' || arr[i] == '*' || arr[i] == '/') {
                isHavaSign = true;
            }
            if(arr[i] == '=') {
                isHaveResult = true;
            }
        }

        if(isHavaSign && isHaveResult && (k > 1)) {
            isM = true;
        }
        return isM;
    }
}
