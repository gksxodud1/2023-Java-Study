import java.util.Arrays;
import java.util.List;


public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 짝수만 필터링하여 총합 계산
        for (Integer number : numbers) {
            if (((number % 2) == 0)) {
                System.out.println(number);
            }
        }


    }
}