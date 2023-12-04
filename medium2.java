package lovelocal;

import java.util.*;
/*Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.*/

public class medium2 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int num=in.nextInt();
        int[] ar=new int[num];
        int com=num/3;
        for(int i=0;i<num;i++){
            ar[i]=in.nextInt();
        }
        int[] ans= find_com(ar, com);
        System.out.println(Arrays.toString(ans));
    }
    static int[] find_com(int[] ar,int com){
        ArrayList<Integer> ans=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<ar.length;i++){
            if(map.containsKey(ar[i])){
                map.put(ar[i],map.get(ar[i])+1);

            }
            else{
                map.put(ar[i],1);
            }
        }
        for(int key:map.keySet()){
            if(map.get(key)>com){
                ans.add(key);
            }
        }
        int[] ans_ar=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            ans_ar[i]=ans.get(i);
        }
        return ans_ar;
    }
}
