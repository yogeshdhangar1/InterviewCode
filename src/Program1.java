public class Program1 {
    // lets Consider Nth natural Number Of Array
    public static void main(String[] args) {
        int arr1[] = new int[]{1,2,3,4,5,6,7,9,10};
        // Find Missing Number Of An Array
        // Usin Formula n = n+n\2;   n =10;
        int sum = (10*11)/2;
        // consider The Actualsum is The Input Array
        int actualSum = 0;
        for(int i=0;i<arr1.length;i++){
            actualSum = actualSum+arr1[i];
        }
        System.out.println("Missing Number IS :"+(sum-actualSum));
    }
}
