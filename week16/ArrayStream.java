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
//stream()메소드로 스트림 객체를 얻은 후 
//foreach(num->System.out.println(num));에서 ArrayList에있는 요소들을 하나씩 출력합니다. 
//람다식 기술
//람다식이란 "식별자없이 실행가능한 함수"

함수인데 함수를 따로 만들지 않고 코드한줄에 함수를 써서 
그것을 호출하는 방식
