package main.java.question9;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question9 {
    public static void main(String[] args) {
        String str = "programming";
        System.out.println("Characters and their corresponding frequencies");
        Stream.of(str.toLowerCase().split(""))
                .collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .map(e -> e.getKey() + e.getValue() + " ")
                .forEach(System.out::print);
        //Displays the character and their corresponding frequency}
    }
}
