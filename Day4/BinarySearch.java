public class BinarySearch {
    public static void main(String[] args){
        int[] arr={1,2,4,6,8,10,14};
        int target=4;
        int low=0;
        int high=arr.length;
        for(int i=0;i<arr.length;i++){
            int mid=low+(low+high)/2;
            if(target==arr[mid]){
                System.out.print(mid);
            }
            else if(target<arr[mid]){
                high=mid-1;
            }
            else{
                low=mid=1;
            }
        }
    }
}
