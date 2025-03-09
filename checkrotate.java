
// import java.util.*;
public class checkrotate {
    public static boolean arrotate(int[] a1,int[] a2){
        int n=a1.length;
        if(n!=a2.length){
            return false;
        }
        for(int i=0;i<n;i++){
            if(a1[i]==a2[0]){
                boolean isrotate=true;
                for(int j=0;j<n;j++){
                    if(a1[(i+j)%n]!=a2[j]){
                        isrotate=false;
                        break;
                    }
                }
                if(isrotate){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String arg[]){
           int a1[]={1,2,3,4,5};
           int a2[]={3,4,5,1,2};
           if(arrotate(a1, a2)){
            System.out.println("Yes, a2 is rotation of a1");
           }
           else{
            System.out.println("No,a2 is not rotation of a1");
           }
    }
}
