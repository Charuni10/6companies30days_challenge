// Question no:1358
// QUestion name: Number of Substrings Containing All Three Characters
class Solution {
    public int numberOfSubstrings(String s) {
        int a=0;
        int b=0;
        int c=0;
        int ind=0;
        int res=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                a++;
            }
            else if(s.charAt(i)=='b'){
                b++;
            }
            else{
                c++;
            }
           
            while(a>=1 && b>=1 && c>=1){
                if(s.charAt(ind)=='a'){
                    a=a-1;
                    ind++;
                }
                else if(s.charAt(ind)=='b'){
                    b=b-1;
                    ind++;
                }
                else if(s.charAt(ind)=='c'){
                    c=c-1;
                    ind++;
                }
               
            }
            res+=ind;
        }
        return res;
    }
}
