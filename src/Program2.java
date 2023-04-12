// Capagimini
public class Program2 {
    public static void main(String[] args) {
        // Consider The Two Parts Of Setence First Part Is UpperCase And @nd Part Is lower Case
        String str = "This Is India This is India";
        int mid = str.length()/2;
        String lowerCase = "";
        String upperCase = "";

        for(int i=0;i<str.length();i++){
            if(i<mid){
                lowerCase = lowerCase+Character.toLowerCase(str.charAt(i));
            }else{
                upperCase = upperCase+Character.toUpperCase(str.charAt(i));
            }
        }
        System.out.println(lowerCase+upperCase);

    }
}
