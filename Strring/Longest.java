
import java.util.Arrays;

class Longest {
    public static String longestCommonPrefix(String[] str) {
        //  if(strs.length==0 || strs==null)
        // {
        //     return " ";

        // }
        // String prefix=strs[0];
        // for(int i=1;i<strs.length;i++)
        // {
        //     while(strs[i].indexOf(prefix)!=0)
        //     {
        //         prefix=prefix.substring(0,prefix.length()-1);
            
        //     }
        // }
        // return prefix;


        //  if (strs==null || strs.length==0) return "";
        // for(int i=0;i<strs[0].length();i++){
        //     char c=strs[0].charAt(i);
        //     for(int j=1;j<strs.length;j++){
        //         if(i>=strs[j].length() || strs[j].charAt(i)!=c){
        //             return strs[0].substring(0,i);
        //         }
        //     }
        // }
        // return strs[0];

        StringBuilder res=new StringBuilder();
        Arrays.sort(str);
        char [] first=str[0].toCharArray();
        char[]last=str[str.length-1].toCharArray();
        for(int i=0;i<first.length;i++){
            if(first[i]!=last[i]){
                break;
            }
            res.append(first[i]);
        }
        return res.toString();
        

    }
    public static void main(String[] args) {
        String [] s={"flower","flow","flight"};
        System.out.println("Prefix: " + longestCommonPrefix(s));
    }
}