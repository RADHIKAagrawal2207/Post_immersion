//import java.util.*;
public class LinearSearch{
    public static void main(String[] args){
        //Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,67,55};
        int target=67;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.print(i);
            }
        }
    }
}