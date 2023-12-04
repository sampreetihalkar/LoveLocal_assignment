package lovelocal;

import java.util.Arrays;
import java.util.Scanner;
/*Given an integer numRows, return the first numRows of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:*/

public class easy3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int[][] ans=new int[num][num];
        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){
                if(i==j||j==0){
                    ans[i][j]=1;
                }
                else{
                    ans[i][j]=ans[i-1][j-1]+ans[i-1][j];
                }
            }
        }
        System.out.print("[");
        for(int i=0;i<num;i++){
            System.out.print("[");
            for(int j=0;j<=i;j++){
                System.out.print(ans[i][j]);
                if(j!=i){
                    System.out.print(",");
                }
            }
            System.out.print("]");
            if(i!=num-1){
                System.out.print(",");
            }
        }System.out.print("]");
    }
}
