
// import java.util.Arrays;

// class Largets{
//     public static void main(String[] args) {
//         int [] arr1={2,5,3,7,4};
//         System.out.println("Largest number : " + sort(arr1));
//         int [] arr2={8,9,5,10,3};
//         System.out.println("Largest number is:" + sort(arr2));

//     }
//     static int sort(int[] arr){
//             Arrays.sort(arr);
//             return arr[arr.length-1];
//         }
// }

// ?using max 
class Largets{
    public static void main(String[] args) {
        int [] arr1={2,5,3,7,4};
        System.out.println("Largest number : " + sort(arr1));
        int [] arr2={8,9,5,10,3};
        System.out.println("Largest number is:" + sort(arr2));

    }
    static int sort(int[] arr){
          int max=arr[0];
          for(int i=1;i<arr.length;i++){
            if(arr[i]>max)
            max=arr[i];
          }
          return max;
        }

}

