
import java.util.Stack;

public class basicOfStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        System.out.println("size is : " +st.size());
        st.push(1);
        st.push(23);
        st.push(90);
        st.push(5);
        st.push(34);
        //peek  but in c++ it is top
        System.out.println("peek is : " +st.peek());
        System.out.println(st);
        //pop
        // System.out.println("pop is : " +st.pop());
        // System.out.println(st);
        System.out.println("size is : " +st.size());
    }
}
