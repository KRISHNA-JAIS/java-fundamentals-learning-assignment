package main.java.question2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question2 {
    /**
     * @param args
     */
    public static void main(final String[] args) {

        List<String> arrayList = new ArrayList<>(
                Arrays.asList("A", null, "B", null, "C", "", "D"));

        System.out.println("Input = " + arrayList);

        arrayList = arrayList.stream()
                .filter(x -> x != null)
                .filter(x -> !x.isEmpty())
                .collect(Collectors.toList());

        System.out.println("Output = " + arrayList);
    }

}
