public class DigitExtracter {
    private String text;
    public int[] extract(String text) {
        char[] arr = text.toCharArray();
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= '0' && arr[i] <= '9') {
                k++;
            }
        }
        int[] numbers = new int[k];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= '0' && arr[i] <= '9') {
                numbers[j] = (int) arr[i] - 48;
                j++;
            }
        }
        return numbers;
    }
}
//int[] extracted = digitExtracter.extract("april 5, year 2000");
// виводить у консоль [5, 2, 0, 0, 0].
