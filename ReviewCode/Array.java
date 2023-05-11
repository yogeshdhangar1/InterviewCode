import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int arr[] = new int[] {45,56,33,40,56};
        List<Integer> divisibleByFive = new ArrayList<>();
        for(int i =0;i<arr.length;i++){
            if(arr[i]%5==0){
                divisibleByFive.add(arr[i]);
            }
        }
        System.out.println("Element Divisible By 5:"+divisibleByFive);

        // Take Input From User
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of Array");
        int num = sc.nextInt();
        int array[] = new int[num];
        for(int i =0;i<num;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Element Of Array ");
        for(int i =0;i<num;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println("Element Are Divisible By 5");
        ArrayList<Integer> divisibleFive = new ArrayList<>();
        for(int i =0;i< arr.length;i++){
            if(arr[i]%5==0){
                divisibleFive.add(arr[i]);

            }
        }
        System.out.println("Element Divisible By 5 :"+divisibleByFive);
    }
}
