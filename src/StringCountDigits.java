// Capagimini
// Java Program To Count String Whose Length is Greater Than 5 in the given List

import java.util.Arrays;
import java.util.List;

public class StringCountDigits {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("welcome","to","cloudtect","for","java","Interview","coding","questions");
        long count = stringList.stream().filter(str->str.length()>5).count();
        System.out.println("String Count with Greater Than 5 characters : "+count);
    }
}
