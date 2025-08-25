public class Consecutive{
    public static int find(int[] nums){
        int cnt=0,maxi=0;
        for(int num:nums){
            cnt=(num==1) ? cnt+1:0;
            maxi=Math.max(maxi, cnt);
        }
        return maxi;
    }
    public static void main(String[] args) {
        int [] nums={1,0,1,1,1,1,1};
        System.out.println("The maximum consecutive 1's are:" +find(nums));
    }
}