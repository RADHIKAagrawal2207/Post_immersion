// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();  //3
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();  // 1 3 2
        }
        int sum=0;
        for(int i=0;i<n;i++){
            int max=arr[i];
            for(int j=i;j<n;j++){
                max=Math.max(max,arr[j]);
                sum+=max;
            }
            
        }
        System.out.print(sum);   // 15
    } 
}
