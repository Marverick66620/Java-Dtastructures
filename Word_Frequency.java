import java.io.*;
import java.util.*;
public class Word_Frequency {
    public static void main(String[] args) throws IOException {
        String fileName = "input.txt";
        Map<String, Integer> wordCount = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] words = line.toLowerCase().split("\\W+");
            for (String word : words) {
                if (!word.isEmpty()) {
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }
        }
        reader.close();
        List<Map.Entry<String, Integer>> wordList = new ArrayList<>(wordCount.entrySet());
        Collections.sort(wordList, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                if (!a.getValue().equals(b.getValue())) {
                    return b.getValue() - a.getValue();
                }
                return a.getKey().compareTo(b.getKey());
            }
        });
        for (Map.Entry<String, Integer> entry : wordList) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
