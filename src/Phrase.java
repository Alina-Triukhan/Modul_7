public final class Phrase {
    private final String[] words;

    public Phrase (String[] words) {
        this.words = words.clone();
    }
    @Override
    public String toString() {
        return String.join(" ", words);
    }
}

//Вызов arr.join(glue) делает в точности противоположное split .
// Он создаёт строку из элементов arr , вставляя glue между ними.
