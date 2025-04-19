public class MaxWealth {
    public static void main(String[] args) {
        int [][] accounts={
            {1,2,3},
            {3,2,1},
            {4,5,6}
        };
        int res=maximumWealth(accounts);
        System.out.println("Maximum Wealth: " + res);
    }
    static int maximumWealth(int [][] accounts){
        int ans=Integer.MIN_VALUE;
        for(int[] person:accounts){
            int sum=0;
            for(int account : person){
                sum+=account;
            }
            ans=Math.max(ans, sum);
        }
        return ans;
    }
}
