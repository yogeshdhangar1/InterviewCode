import java.util.Arrays;
import java.util.List;

//practically Use case of sequential stream and parallel system we are going to show how practically sequential Strip is going to differ
// or behave differently from parallel stream
public class SequentialAndParallelStrip {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4);

        // For Parallel Strip
        numbers.parallelStream().forEach(e->{
            System.out.println(e + " "+Thread.currentThread().getName());
        });
    }
}
