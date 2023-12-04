package lovelocal;

import java.util.Arrays;
import java.util.Scanner;
/*Return the max sliding window.
You are given an array of integers nums, there is a sliding window of size
k which is moving from the very left of the array to the very right. You can only see the k numbers in the window.
 Each time the sliding window moves right by one position.*/

public class hard1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int[] ar=new int[num];
        for(int i=0;i<ar.length;i++){
            ar[i]=in.nextInt();
        }
        int k=in.nextInt();
        int[] ans=max_slid(ar,k);
        System.out.println(Arrays.toString(ans));
    }
    static int[] max_slid(int[] ar, int k){
        int n=ar.length;
        int[] ans=new int[(ar.length-k)+1];
        for(int i=0;i<=n-k;i++){
            int max=ar[i];
            for(int j=i;j<i+k;j++){
                if(ar[j]>max){
                    max=ar[j];
                }
            }
            ans[i]=max;
        }
        return ans;
    }
}
