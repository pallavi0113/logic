

public class Remove{
    public static void main(String[] args) {
        int [] a={1,1,2,2,2,3,3};
        int k=removeDup(a);
        for(int i=0;i<k;i++){
            System.out.print(a[i] + " ");
        }
    }

    //Brute force TC:  o(n*log(n))+o(n)


    // public static int removeDup(int [] arr){         
    //     HashSet <Integer> set = new HashSet<>();
    //     for(int i=0;i<arr.length;i++){
    //         set.add(arr[i]);
    //     }
    //     int k=set.size();
    //     int j=0;
    //     for(int x:set){
    //         arr[j++]=x;
    //     }
    //     return k;
    // }

    ///optimal       TC: o(n)
    
    public static int removeDup(int [] arr){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
    
}