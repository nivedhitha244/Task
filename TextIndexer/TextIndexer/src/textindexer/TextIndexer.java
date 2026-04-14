package textindexer;

import java.util.*;

public class TextIndexer {

    public static void main(String[] args) {

        try {
            String filePath = "data/sample.txt";

            IndexBuilder builder = new IndexBuilder();
            builder.buildIndex(filePath);

            SearchEngine searchEngine = new SearchEngine(builder.getIndex());

            Scanner sc = new Scanner(System.in);

            System.out.println("📘 Text Indexer Ready!");

            while (true) {
                System.out.print("\nEnter word to search (or 'exit'): ");
                String input = sc.next();

                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                searchEngine.searchWord(input);
            }

            sc.close();

        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}