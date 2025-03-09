

import java.util.*;
public class hollowpyramid {
    public static void main(String arg[]){
        int n;
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the number of rows:");
        n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                if(i==n||k==1||k==2*i-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}