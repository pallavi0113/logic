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




public class ReverseString {
    public static String result(String s) {
        int l = 0;
        int r = s.length() - 1;

        StringBuilder temp = new StringBuilder();
        StringBuilder ans = new StringBuilder();

        while (l <= r) {
            char ch = s.charAt(l);
            if (ch != ' ') {
                temp.append(ch); // build current word
            } else if (ch == ' ') {
                if (temp.length() > 0) { // only if temp has a word
                    if (ans.length() > 0) {
                        ans.insert(0, " "); // add space before current ans
                    }
                    ans.insert(0, temp); // prepend current word
                    temp.setLength(0);   // reset temp
                }
            }
            l++;
        }

        // Add last word if temp is not empty
        if (temp.length() > 0) {
            if (ans.length() > 0) {
                ans.insert(0, " ");
            }
            ans.insert(0, temp);
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String st = "Tuf is for great";
        System.out.println("Before reversing words: " + st);
        System.out.println("After reversing words: " + result(st));
    }
}
