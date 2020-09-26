package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hom", "nay", "troi", "dep");
        list.stream().forEach(System.out::println);
        list.stream().filter(i -> i.startsWith("n")).forEach(s -> System.out.println("loc: " + s));
        list.stream().limit(2).forEach(s -> System.out.println(s));
        list.stream().map(i -> i.toUpperCase()).forEach(s -> System.out.println(s));
        //sap xep
        list.stream().sorted((s1, s2) -> s1.compareTo(s2)).forEach(s -> System.out.println(s));

        List<Integer> list1 = Stream.of(1, 2, 3, 4).filter(integer -> integer % 2 != 0).collect(Collectors.toList());
        System.out.println(list1);

        long list2 = Stream.of(1, 2, 3, 4).filter(integer -> integer % 2 != 0).count();
        System.out.println(list2);

        IntStream range2 = IntStream.rangeClosed(1, 5);
        range2.parallel().forEach(System.out::println);
        IntStream range3 = IntStream.rangeClosed(1, 5);
        range3.parallel().forEach(x -> {
            System.out.println("Thread : " + Thread.currentThread().getName() + ", value: " + x);
        });
    }
}
