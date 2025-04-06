

public class Sentence {
    public static void main(String[] args) {
        String sen="A man, a plan, a canal: panama";
        System.out.println(isPalindrome(sen));
    }
    static boolean isPalindrome(String str){
        if(str==null) return true;
        str=str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for(int i=0;i<=str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
