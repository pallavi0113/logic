public class LargeOdd{
    public static String result(String s){
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            if((s.charAt(i)-'0')%2==1){
                return s.substring(0,i+1);
            }
        }
        return "";
    }
    public static void main(String[] args) {
        String s="2468";
        System.out.println("odd:" + result(s));
    }
}