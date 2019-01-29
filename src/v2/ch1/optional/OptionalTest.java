package v2.ch1.optional;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 * @program: Core_Java
 * @description: optional
 * @author: Jun Wang
 * @create: 2019-01-29 17:16
 */
public class OptionalTest {
    public static void main(String[] args) throws IOException {
        String contents = new String(Files.readAllBytes(
                Paths.get("src/alice30.txt")), StandardCharsets.UTF_8);

        List<String> wordList = Arrays.asList(contents.split("\\PL+"));

        System.out.println(wordList.stream().limit(100).toArray());

//        for (String s:wordList
//             ) {
//            System.out.println(s);
//        }

        Optional<String> optionalValue = wordList.stream()
                .filter(s -> s.contains("fred"))
                .findFirst();
        System.out.println(optionalValue.orElse("No word") + " contains fred");

        Optional<String> optionalString = Optional.empty();
        String result = optionalString.orElse("N/A");
        System.out.println("result: " + result);
        result = optionalString.orElseGet(()-> Locale.getDefault().getDisplayName());
        System.out.println("result: " + result);
        try
        {
            result = optionalString.orElseThrow(IllegalStateException::new);
            System.out.println("result: " + result);
        }
        catch (Throwable t)
        {
            t.printStackTrace();
        }

        optionalValue = wordList.stream()
                .filter(s -> s.contains("red"))
                .findFirst();

//        optionalValue = wordList.stream()
//                .filter(s -> s.contains("red"))
//                .findAny();

        System.out.println("is contain red: " + optionalValue);
        optionalValue.ifPresent(s -> System.out.println(s + " contains red"));

        Set<String> results = new HashSet<>();
        optionalValue.ifPresent(results::add);
        Optional<Boolean> added = optionalValue.map(results::add);
        System.out.println(added);

        System.out.println("4.0 " + inverse(4.0).flatMap(OptionalTest::squareRoot));
        System.out.println("-1.0 " + inverse(-1.0).flatMap(OptionalTest::squareRoot));
        System.out.println("0.0 " + inverse(0.0).flatMap(OptionalTest::squareRoot));
        Optional<Double> result2 = Optional.of(-4.0)
                .flatMap(OptionalTest::inverse).flatMap(OptionalTest::squareRoot);
        System.out.println(result2);



    }

    public static Optional<Double> inverse(Double x)
    {
        return x == 0 ? Optional.empty():Optional.of( 1 / x);
    }

    public static Optional<Double> squareRoot(Double x)
    {
        return x < 0 ? Optional.empty():Optional.of(Math.sqrt(x));
    }
}
