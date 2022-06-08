import java.io.*;

class Solution{
	public static void main (String[] args) {
	    String s="784584658465984568456";
    System.out.println(round(s));
}
public static String round(String s){
    char[] c = s.toCharArray(); // beacuse we have to update the character while rounding them off
    int n=s.length();
    if(c[n-1]=='0'){
        return s;
    } else if(c[n-1] == '1' || c[n-1] == '2' || c[n-1] == '3' || c[n-1] == '4' || c[n-1] == '5'){
                c[n-1]='0';
                return new String(c);
    } else{
        c[n-1]='0'; // we have t0 make it nearest multiple of 10
        
    // carry process
      for(int i = n - 2 ; i >= 0 ; i--)
      {
        if(c[i] == '9')
          c[i]='0';
        else
        {
          int t= c[i] - '0' + 1;
          c[i]=(char)(48+t);
          break;
        }
      }
    }
       String s1=new String(c);
 
    if(s1.charAt(0) == '0')
      s1="1"+s1; //adding 1 to the 0 index if the number in case ending with 9
     
    return s1;     
}
}
