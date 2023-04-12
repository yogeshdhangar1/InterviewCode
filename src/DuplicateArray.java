public class DuplicateArray {
    public static void main(String[] args) {
        int arr[] = new int[]{23,3,34,3,4,67,3,23,45};
        System.out.println("Duplicate Array In Given Array :");
        for(int i = 0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
