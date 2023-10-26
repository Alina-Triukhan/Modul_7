public class NumberJoiner {
    public String join(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        for(int number: numbers) {
            sb.append(number);
        }
        return sb.toString();
    }
}
