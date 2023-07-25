package programmer.zaman.now.kasus;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.function.BiConsumer;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> wordFrequencyMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan kalimat:");
        String sentence = scanner.nextLine();
//        String[] words = sentence.split(" ");

        StringTokenizer tokenizer = new StringTokenizer(sentence, " ");

        while(tokenizer.hasMoreTokens()){
            String token = tokenizer.nextToken();
            int frequency = wordFrequencyMap.getOrDefault(token, 0);
            wordFrequencyMap.put(token, frequency+1);
        }
//        for (String word : words) {
//            word = word.toLowerCase(); // Untuk mengabaikan perbedaan huruf besar dan kecil
//            int frequency = wordFrequencyMap.getOrDefault(word, 0);
//            wordFrequencyMap.put(word, frequency + 1);
//        }

        System.out.println("Frekuensi kemunculan kata:");


        wordFrequencyMap.forEach((s, integer) -> System.out.println(s + " : " + integer));

        scanner.close();
    }
}
