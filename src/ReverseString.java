public class ReverseString {
    public static void main(String[] args) {
        String str = "India",nstr="";
        char ch;
        for(int i =0; i<str.length();i++){
            System.out.println("Original String is:");
            System.out.println("India");
            ch = str.charAt(i);
            nstr = ch+nstr;
        }
        System.out.println("Reversed String Is:"+nstr);
    }
}
