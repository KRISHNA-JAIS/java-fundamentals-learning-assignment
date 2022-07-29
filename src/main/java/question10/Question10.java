package main.java.question10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Question10 {
    /**
     * @param args
     */
    public static void main(final String[] args) {
        List<String> names =
                new ArrayList<>(Arrays.asList(
                        "Alok", "Harsh", "Shakti",
                        "Krishna", "Tanuj", "Anoop"));

        System.out.println("Input = " + names);

        List<String> output =
                names.stream().sorted(Comparator.comparing(
                        n -> n.toString())).collect(Collectors.toList());

        System.out.println("Output = " + output);
    }
}
