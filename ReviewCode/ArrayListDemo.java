import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(65);
        list.add(60);
        list.add(75);
        list.add(34);
        list.add(87);

        ArrayList<Integer> divisibleByFive = new ArrayList<>();
        for(int i = 0;i<list.size();i++){
            if(list.get(i)%5==0){
                divisibleByFive.add(list.get(i));

            }
        }
        System.out.println("Divisible By 5:"+divisibleByFive);
    }
}
