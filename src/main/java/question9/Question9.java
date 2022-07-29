package main.java.question9;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question9 {
    /**
     * @param args
     */
    public static void main(final String[] args) {
        String input = "programming";
        System.out.println("Input = " + input);
        System.out.println("Characters and their corresponding frequencies");
        Stream.of(input.toLowerCase().split(""))
                .collect(Collectors.groupingBy(
                        e -> e, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .map(e -> e.getKey() + e.getValue() + " ")
                .forEach(System.out::print);
    }
}
