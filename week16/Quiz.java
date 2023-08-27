package week16;

import java.util.*;

import java.util.????;
import java.util.????;

public class Quiz {
    public static void main(String[] args) {


        //String 배열
        String[] strArray = {"박준수", "장대현", "휴학생"};
        Stream<String> strStream = Arrays.stream(???);
        strStream.forEach(a -> System.out.print(a + ","));
        System.out.println();

        //int 배열
        int[] intArray = {1, 2, 3, 4, 5};
        IntStream intStream = Arrays.stream(???);
        intStream.forEach(a -> System.out.print(a + ","));
        System.out.println();

    }
}
