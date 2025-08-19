

public class LeftArray{
    public static void main(String [] arg){
        int [] a={1,2,3,4,5};
        int n=a.length;
        solve(a,n);
    }
    public static void solve (int [] arr,int n){
        
        //Brute force   TC:o(n)   SC: O(n)
        
        // int [] temp=new int [n];
        // for(int i=1;i<n;i++){
        //     temp[i-1]=arr[i];
        // }
        // temp[n-1]=arr[0];
        // for(int i=0;i<n;i++){
        //     System.out.print(temp[i] + " ");
        // }
        

        //optimal solution    TC:O(n)  SC: O(1)

        int temp=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

        


    }
}