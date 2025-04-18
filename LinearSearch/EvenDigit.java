public class EvenDigit {
    public static void main(String[] args) {
        int[] num = {12, 345, 2, 6, 7896};
        System.out.println(findNumber(num));
    }

    static int findNumber(int[] num){
        int count = 0;
        for(int nums : num){
            if(even(nums)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int numberOfDigit = digits(num);
        return numberOfDigit % 2 == 0;
    }

    static int digits(int num){
        if(num < 0){
            num = num * -1;
        }
        if(num == 0){
            return 1;
        }
        int count = 0;
        while(num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }
}
