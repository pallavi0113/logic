import java.util.Scanner;
import java.util.Stack;

public class insertionInStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n;
        System.out.println("Enter the number of elements in the stack:");
        n = sc.nextInt();
        System.out.println("Enter the elements of the stack:");
        for (int i = 1; i <= n; i++) {
            st.push(sc.nextInt());
        }
        System.out.println("Original Stack: " + st);
        int idx=3;
        int x=12;
        Stack<Integer> gt=new Stack<>();
        while(st.size()>idx){
            gt.push(st.pop());
        }
        st.push(x);
        while(gt.size()>0){
            st.push(gt.pop());
        }
        System.out.println("Stack after inserting " + x + " at index " + idx + ": " + st);
    }
}
