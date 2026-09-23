package day08;

import java.util.*;

public class Stringreverse {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String:");
    String ob = sc.nextLine();
    char[] arr = ob.toCharArray();
    System.out.println("reverse:");
    for (int i = arr.length -1;i>=0;i--){
      System.out.print(arr[i]+" ");
    }
  }
}