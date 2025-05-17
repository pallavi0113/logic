import java.util.Scanner;
import java.util.Stack;

public class displayStack {
    public static void displayReverse(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }
        int x = st.pop();
        System.out.print(x + " ");
         displayReverse(st);
        st.push(x);
    }
    public static void display(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }
        int x = st.pop();
         display(st);
        System.out.print(x + " ");
        st.push(x);
    }
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
        display(st);
        // System.out.println("Original Stack: " + st);
        // Stack<Integer> gt = new Stack<>();
        // while (st.size() > 0) {
        //     gt.push(st.pop());
        // }
        // while(gt.size()>0){
        //     int x=gt.pop();
        //     System.out.print(x+" ");
        //     st.push(x);
        // }
        // System.out.println();
        // System.out.println("Original Stack after displaying: " + st);

        // int size = st.size();
        // int [] arr = new int[size];
        // for(int i=size-1;i>=0;i--){
        //     arr[i]=st.pop();
        // }
        // for(int i=0;i<size;i++){
        //     System.out.print(arr[i]+" ");
        //     st.push(arr[i]);
        // }
    }
}
