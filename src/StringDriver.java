public class StringDriver {
    public static void main(String[] args) {
        String str1 = "Abc";    // String Literals And String Poll Created  Both str1 And str2
        String str2 = "Abc";
        String str3 = new String("abc");  // Created String In Heap Memory

       System.out.println(str1==str2); // Comparing two String Both Are Literals  Print is True

        System.out.println(str1==str3); // One Is String Literals And Another Is variable Created Is Heap Memory return is = False

        System.out.println(str1.equals(str3));// .equals To Check The Content Output will Be True

        System.out.println(str1.equalsIgnoreCase(str3));// For Ignoring The Case output will Be = true
    }
}
