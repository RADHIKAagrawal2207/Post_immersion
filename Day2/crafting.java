import java.util.*;
public class crafting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();   //3
        while (t-- > 0) {
            int n = sc.nextInt(); //4
            int[] a = new int[n]; // 0 5 5 1
            int[] b = new int[n]; // 1 4 4 0
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {           //O(n)=Time complexity
                b[i] = sc.nextInt();
            }
            boolean flag=true;
            for(int i=0;i<n;i++){
                if(a[i]<b[i]){
                    int r=b[i]-a[i];
                    for(int j=0;j<n;j++){
                        if(j==i) continue;
                        if(a[j]<b[j]+r){
                            flag=false;
                            break;
                        }
                    }
                }
                if(!flag) break;
            }
            System.out.println(flag?"YES":"NO");  // YES
        }
        sc.close();
    }
}

// 3
// 4
// 0 5 5 1
// 1 4 4 0
// 3
// 1 1 3
// 2 2 1
// 2
// 1 10
// 3 3
// Output
// YES
// NO
// YES
