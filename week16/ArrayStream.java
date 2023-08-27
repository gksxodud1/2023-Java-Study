package week16;
import java.util.*;

import java.util.stream.Stream;
import java.util.stream.IntStream;

public class ArrayStream {
    public static void main(String[] args) {


        //String 배열
        String[] strArray = {"박준수", "장대현", "휴학생"};
        Stream<String> strStream = Arrays.stream(strArray);
        strStream.forEach(a -> System.out.print(a + ","));
        System.out.println();

        //int 배열
        int[] intArray = {1, 2, 3, 4, 5};
        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(a -> System.out.print(a + ","));
        System.out.println();

    }
}

