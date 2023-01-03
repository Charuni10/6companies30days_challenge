// Question number: 1392
// Question name: Longest Happy Prefix
import java.util.*;
class Solution {
    public String longestPrefix(String s) {
        int lps[]=new int[s.length()];
        int i=1;
        int len=0;
        int m=s.length();
        while(i<m){
            if(s.charAt(i)==s.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else{
                if(len!=0){
                    len=lps[len-1];
                }
                else{
                    lps[i]=0;
                    i++;
                }
            }
            
        }
        
        return s.substring(0,lps[m-1]);
    }
}