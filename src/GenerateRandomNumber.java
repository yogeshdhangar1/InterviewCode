
// capagimini
// Generate Nth Number Of Random Number To User
import java.util.Random;
import java.util.Scanner;

public class GenerateRandomNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number of random number to be generate ");
        int n = sc.nextInt();
        Random random = new Random();
        random.ints(1,100).limit(n).forEach(System.out::println);
    }
}
