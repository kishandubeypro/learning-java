// package day02;
import java.util.*;
public class Array {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the length");
        int l = sc.nextInt();
        int[] b =new int[l];
        int sum=0;

        for(int i=0;i<l;i++){
            b[i] =sc.nextInt();
            sum=sum+b[i];

        }
        
        for (int i=0;i<l;i++){
            System.out.println(b[i]);
        }
        System.out.print("The sum of two array:"+sum);
    }
}