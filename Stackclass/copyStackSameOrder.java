import java.util.Stack;
import java.util.Scanner;
public class copyStackSameOrder {
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
        Stack<Integer> gt=new Stack<>();
        while(st.size()>0){
            gt.push(st.pop());
        }
        Stack<Integer> rt=new Stack<>();
        while(gt.size()>0){
            rt.push(gt.pop());
        }
        System.out.println("Copied stack: " + rt);
    }
}
