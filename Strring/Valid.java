
import java.util.Arrays;

class Valid {
    // // static {
    // //     for (int i = 0; i < 500; i++) {
    // //         isAnagram("a", "");
    // //     }
    // // }

    // public static boolean isAnagram(String s, String t) {
    //     // if(s.length() != t.length()) return false;
    //     // s = s.toLowerCase();
    //     // t = t.toLowerCase();

    //     // int count[] = new int[26];
    ///  100% beat
    //     // for(int i=0; i<s.length(); i++){
    //     //     count[s.charAt(i) - 'a']++;
    //     //     count[t.charAt(i) - 'a']--;
    //     // }

    //     // for(int i=0; i<26; i++){
    //     //     if(count[i] != 0){
    //     //         return false;
    //     //     }
    //     // }

    //     // return true;


    //     if(s.length()!=t.length()){
    //         return false;
    //     }
    //     s=s.toUpperCase();
    //     t=t.toUpperCase();
    //     int [] f=new int[26];
    //     for(int i=0;i<s.length();i++){
    //         f[s.charAt(i)-'A']++;
    //     }
    //     for(int i=0;i<t.length();i++){
    //         f[t.charAt(i)-'A']--;
    //     }
    //     for(int i=0;i<26;i++){
    //         if(f[i]!=0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }



    public static String sorts(String s){
        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        s=sorts(s);
        t=sorts(t);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=t.charAt(i)){
                return false;
            }
        }
        return true;
        
    }
    public static void main(String args[]) {
    String Str1 = "INTEGER";
    String Str2 = "TEGERNI";
    System.out.println("result: " + isAnagram(Str1, Str2));
  }
}
