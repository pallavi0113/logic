public class Remove{
    public static void main(String [] arg){
        String s="(()())(())";
        System.out.println("Removed outermost:" + removeout(s));
    }
    public static String removeout(String s){
        StringBuilder sb=new StringBuilder();
        int bal=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                if(bal>0){
                    sb.append(ch);
                }
                bal++;
            }
            else{
                bal--;
                if(bal>0){
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}