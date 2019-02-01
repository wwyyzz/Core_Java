package v2.ch1.parallel;

import com.sun.activation.registries.MailcapParseException;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.groupingByConcurrent;

/**
 * @program: Core_Java
 * @description: parallel
 * @author: Jun Wang
 * @create: 2019-01-31 10:22
 */
public class ParallelStreams {
    public static void main(String[] args) throws IOException {
        String contents = new String(Files.readAllBytes(
                Paths.get("src/alice30.txt")), StandardCharsets.UTF_8);

        List<String> wordList = Arrays.asList(contents.split("\\PL+"));

        int[] shortWords = new int[10];
        wordList.parallelStream().forEach(s ->
                {
                    if (s.length() < 10) shortWords[s.length()]++;
                }
        );
        System.out.println(Arrays.toString(shortWords));

        Arrays.fill(shortWords, 0);
        wordList.parallelStream().forEach(s ->
        {
            if (s.length() < 10) shortWords[s.length()]++;
        });
        System.out.println(Arrays.toString(shortWords));

        Map<Integer, Long> shortWordCounts = wordList.parallelStream()
                .filter(s -> s.length() < 10)
                .collect(groupingBy(String::length, counting()));

        System.out.println(shortWordCounts);

        Map<Integer, List<String>> result = wordList.parallelStream().collect(
                Collectors.groupingByConcurrent(String::length)
        );

        System.out.println(result.get(14));

        result = wordList.parallelStream().collect(
                Collectors.groupingByConcurrent(String::length)
        );

        System.out.println(result.get(14));

        Map<Integer, Long> wordCounts = wordList.parallelStream().collect(
                groupingByConcurrent(String::length, counting())
        );
        System.out.println(wordCounts);
    }
}
