public class Cound_Random_array {
    public static void main(String[] args) {
        int[] arr=new int[]{2,7,3,8,9};
        int result=0;
         for(int i=1;i<arr.length;i++){
           arr[i]=arr[i-1]+arr[i];
           result=arr[i];
         }
        System.out.println(result);
    }
}
