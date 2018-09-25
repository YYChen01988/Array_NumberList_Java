public class WordCollection {

    //word is variable name
    private String[] words;

    public WordCollection(){
        // 5 is indicating how many items in array.
        this.words = new String[5];
    }

    public int getWordCount(){
        return this.words.length;
    }

    public void add(String word){
        this.words[0] = word;
    }
}
