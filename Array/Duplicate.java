//?Floyd's Tortoise and Hare (cycle Detection)


public class Duplicate {
    public static void main(String[] args) {
        int [] arr={1,3,4,2,2};
        int slow=arr[0];
        int fast=arr[0];
        while(true){
            slow=arr[slow];
            fast=arr[arr[fast]];
            if(slow==fast){
                break;
            }
        }
        slow=arr[0];
        while(slow!=fast){
            slow=arr[slow];
            fast=arr[fast];
        }
        System.out.println("The duplicate : " + slow);
    }
}

