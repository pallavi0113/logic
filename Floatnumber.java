import java.util.*;
public class Floatnumber {
    public static void main(String arg[]){
            float [] num = new float[5];
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the float number");
            for(int i=0;i<5;i++){
                num[i]=sc.nextFloat();
            }
            float sum=0;
            System.out.println("sum of the array:");
            for(float i: num){
                sum=sum+i;
            }
            System.out.println(sum);
            sc.close();
    }
}
