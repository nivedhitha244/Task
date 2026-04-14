package textindexer;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class IndexBuilder {

    private Map<String, List<Integer>> index = new HashMap<>();

    public void buildIndex(String filePath) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filePath));

        for (int i = 0; i < lines.size(); i++) {
            String[] words = lines.get(i).toLowerCase().split("\\W+");

            for (String word : words) {
                if (!word.isEmpty()) {
                    index.putIfAbsent(word, new ArrayList<>());
                    index.get(word).add(i + 1); // line number
                }
            }
        }
    }

    public Map<String, List<Integer>> getIndex() {
        return index;
    }
}