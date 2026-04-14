package textindexer;

import java.util.*;

public class SearchEngine {

    private Map<String, List<Integer>> index;

    public SearchEngine(Map<String, List<Integer>> index) {
        this.index = index;
    }

    public void searchWord(String word) {
        word = word.toLowerCase();

        if (index.containsKey(word)) {
            List<Integer> lines = index.get(word);
            System.out.println("✅ Found " + word + " " + lines.size() + " times");
            System.out.println("📍 Appears in lines: " + lines);
        } else {
            System.out.println("❌ Word not found");
        }
    }
}