package Jan_Pac1;

import java.util.Scanner;

public class TC005_PositiveNegative {
   public static void main(String args[]){
      int num;
      System.out.println("Enter a number ::");
      Scanner sc = new Scanner(System.in);
      num = sc.nextInt();

      if (num > 0){
         System.out.println("number is a positive integer");
      } else if(num < 0){
         System.out.println("number is a negative integer");
      } else {
         System.out.println("number is neither positive nor negative integer");
      }
   }
}
