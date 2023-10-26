public class NameParser {
    public String parse(String[] names) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < names.length; i++) {
            String firstName = names[i].split(" ")[0];

            sb.append(firstName);
            if (i != names.length - 1) {
                sb.append(", ");
            }
        }

        return sb.toString();
    }
}
