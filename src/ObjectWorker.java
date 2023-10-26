public class ObjectWorker {
    public String join(Object[] objects) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < objects.length; i++) {
            sb.append(objects[i]);
            if (i != objects.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
