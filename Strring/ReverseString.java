// public class ReverseString{
//     public static String result(String s){
//         int l=0;
//         int r=s.length()-1;
//         String temp="";
//         String ans="";
//         while(l<=r){
//             char ch=s.charAt(l);
//             if(ch!=' '){
//                 temp+=ch;
//             }
//             else if(ch==' '){
//                 if(!ans.equals("")){
//                     ans=temp+" "+ans;
//                 }
//                 else{
//                     ans=temp;
//                 }
//                 temp="";
//             }
//             l++;
//         }
//         if(!temp.equals("")){
//             if(!ans.equals("")){
//                 ans=temp+ " "+ans;
//             }
//             else{
//                 ans=temp;
//             }
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         String st="Tuf is for great";
//         System.out.println(result(st));
//     }
// }




// public class ReverseString {
//     public static String result(String s) {
//         int l = 0;
//         int r = s.length() - 1;

//         StringBuilder temp = new StringBuilder();
//         StringBuilder ans = new StringBuilder();

//         while (l <= r) {
//             char ch = s.charAt(l);
//             if (ch != ' ') {
//                 temp.append(ch); // build current word
//             } else if (ch == ' ') {
//                 if (temp.length() > 0) { // only if temp has a word
//                     if (ans.length() > 0) {
//                         ans.insert(0, " "); // add space before current ans
//                     }
//                     ans.insert(0, temp); // prepend current word
//                     temp.setLength(0);   // reset temp
//                 }
//             }
//             l++;
//         }

//         // Add last word if temp is not empty
//         if (temp.length() > 0) {
//             if (ans.length() > 0) {
//                 ans.insert(0, " ");
//             }
//             ans.insert(0, temp);
//         }

//         return ans.toString();
//     }

//     public static void main(String[] args) {
//         String st = "Tuf is for great";
//         System.out.println("Before reversing words: " + st);
//         System.out.println("After reversing words: " + result(st));
//     }
// }




public class ReverseString{
    public static String result(String s){
        if(s==null) return null;
        char[] str=s.toCharArray();
        char[] rev=new char[str.length];
        int idx=reverse(str,rev,0);
        return new String(rev,0,idx);
    }
    public static int reverse(char[] str,char [] rev,int start){
        while(start<str.length && str[start]==' '){
            start++;
        }
        int end=start;
        while(end<str.length && str[end]!=' '){
            end++;
        }
        if(start==end){
            return 0;
        }
        int revl=reverse(str,rev,end);
        if(revl!=0){
            rev[revl++]=' ';
        }
        while(start<end){
            rev[revl++]=str[start++];
        }
        return revl;
    }
    public static void main(String[] args) {
        String st="Tuf is for great";
        System.out.println("after reverse: " + result(st));
    }
}