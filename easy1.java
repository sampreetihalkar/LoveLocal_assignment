package lovelocal;

import java.util.Scanner;
/*Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal
substring consisting of non-space characters only.*/

public class easy1 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String s=in.nextLine();
        System.out.println(lastword(s));
    }
    static int lastword(String str){
        int w_len=0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)==' '){
                if(w_len!=0){
                    return w_len;
                }
            }
            else{
                w_len++;
            }
        }
        return w_len;
    }
}
