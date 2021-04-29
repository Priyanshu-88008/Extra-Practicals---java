import java.io.*;
public class Prog1{
   public static void main(String args[]){
      int num, sum = 0;
      System.out.println("This is command line argument 10, 20, 30");
      for(int i = 0; i<args.length;i++)
      { 
         num = Integer.parseInt(args[i]);
         sum = sum+num;
      }
      System.out.println("Sum of element is "+sum);
   }
}
