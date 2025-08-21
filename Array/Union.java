
import java.util.ArrayList;

public class Union{
    public static ArrayList<Integer> Find(int a1[],int [] a2, int n, int m){
        // HashSet<Integer> s=new HashSet<>();
        // ArrayList<Integer> union =new ArrayList<>();
        // for(int i=0;i<n;i++){       ///  TC:o(n1logn +n2logn)+o(n1+n2)
        //                             ///Sc: o(n1+n2) + o(n1+n2)
        //     s.add(a1[i]);
        // }
        // for(int i=0;i<m;i++){
        //     s.add(a2[i]);
        // }
        // for(int it:s){
        //     union.add(it);
        // }
        // return union;



        int i=0,j=0;
        ArrayList<Integer> union=new ArrayList<>();
        while(i<n&&j<m){
            if(a1[i]<=a2[j]){
                if(union.size()==0 || union.get(union.size()-1)!=a1[i]){
                    union.add(a1[i]);
                }
                i++;
            }
            else{
                if(union.size()==0 || union.get(union.size()-1)!=a2[j]){
                    union.add(a2[j]);

                }
                j++;
            }
        }
        while(i<n){
            if(union.get(union.size()-1)!=a1[i]){
                union.add(a1[i]);
            }
            i++;
        }
        while(j<m){
            if(union.get(union.size()-1)!=a2[j]){
                union.add(a2[j]);
            }
            j++;
        }
        return union;
    }
    public static void main(String arg[]){
        int n=10,m=7;
        int a1[]={1,2,3,4,5,6,7,8,9,10};
        int a2[]={2,3,4,5,5,11,12};
        ArrayList<Integer> union=Find(a1,a2,n,m);
        System.out.println("Union of a1,a2");
        for(int val:union){
            System.out.print(val + " ");
        }
    }
}