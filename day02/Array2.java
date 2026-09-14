// package day02;

import java.util.Scanner;

public class Array2 {
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
        System.out.println("Enter the key :");
        int key =sc.nextInt();
        int c=0;

        
        for (int i=0;i<l;i++){
            System.out.println(b[i]);
            if(key==b[i]){
                System.out.println("key founded at:"+(i+1));
                c=1;
                break;

            }
        }

if(c==0){
    System.out.print("The sum of two array:"+sum);
}
    
    }
}




    