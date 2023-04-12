import java.util.Arrays;
import java.util.List;

// TCS
// I Have List Of Integer and you have identify all the numbers to start with 1  using java 8 features
public class TcsProgram {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,23,45,45,89,16,19);
        numbers.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach(System.out::println);
    }
}
