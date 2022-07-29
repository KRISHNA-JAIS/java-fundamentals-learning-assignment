package main.java.question10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Question10{
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(
                Arrays.asList("Alok", "Harsh", "Shakti", "Krishna", "Tanuj", "Anoop"));

        List<String> co = names.stream().sorted(
                Comparator.comparing(n->n.toString())).collect(Collectors.toList());

        System.out.println(co);
    }
}
