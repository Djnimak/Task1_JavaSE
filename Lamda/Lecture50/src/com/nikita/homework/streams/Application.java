package com.nikita.homework.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Application {
    public static void main(String[] args) throws IOException {

        //1
        IntStream
                .range(1, 10)
                .forEach((x) -> System.out.print(x));
        System.out.println();

        //2
        IntStream
                .range(1, 10)
                .skip(5)
                .forEach((x) -> System.out.print(x));
        System.out.println();

        //3
        int val = IntStream
                .range(1, 10)
                .sum();
        System.out.println(val);

        //4
        Stream.of("Hello", "bottle", "Africa")
                .sorted()
                .findFirst()
                .ifPresent((x) -> System.out.println(x));

        //5
        String[] items = {"car", "computer", "toothpaste", "box", "pencil", "tent", "door", "toy"};
        Stream.of(items)
                .filter((x) -> x.startsWith("t"))
                .sorted()
                .forEach(x -> System.out.print(x + ", "));
        System.out.println();

        //6
        Arrays.stream(new int[] {2, 4, 6, 8, 10})
                .map(x -> x*x)
                .average()
                .ifPresent(n -> System.out.print(n));
        System.out.println();

        //7
        List<String> listOfItems = Arrays.asList("Computer", "Toothpaste", "Box", "Pencil", "Car", "Tent", "Door", "Toy");
        listOfItems.stream()
                .map(x -> x.toLowerCase())
                .filter(x -> x.startsWith("c"))
                .sorted()
                .forEach(x -> System.out.print(x + ", "));

        //8
        Stream<String> lines = Files.lines(Paths.get("files/wordFile.txt"));
        lines.sorted()
                .filter(l -> l.length() > 6)
                .forEach(x -> System.out.print(x + ", "));
        lines.close();

        //9
        List<String> words = Files.lines(Paths.get("files/wordFile.txt"))
                .filter(x -> x.contains("th"))
                .collect(Collectors.toList());
        words.forEach(x -> System.out.print(x + ", "));

        //10
        Stream<String> rows = Files.lines(Paths.get("files/stockDataCsv.txt"));
        int rowCount = (int) rows
                .map(x -> x.split(","))
                .filter(x -> x.length > 3)
                .count();
        System.out.println(rowCount + " good rows.");
        rows.close();

        //11
        Stream<String> rows2 = Files.lines(Paths.get("files/stockDataCsv.txt"));
        rows2.map(x -> x.split(","))
                .filter(x -> x.length > 3)
                .filter(x -> Integer.parseInt(x[1].trim()) > 15)
                .forEach(x -> System.out.println(x[0].trim() + " " + x[2].trim() + " " + x[3].trim()));
        rows2.close();

    }
}
