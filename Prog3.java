import java.util.Scanner;
public class Prog3{
    public static void main(String args[]){
        int a[] = new int[10], s;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of array");
        s = scan.nextInt();
        System.out.println("Enter the elements");
        for(int i = 0; i<s; i++){
            a[i] = scan.nextInt();  
        }
        
        for(int j =0; j<s; j++){
            a[j] = a[j]+5;
        }
        System.out.println("after adding 5 to each element");
        
        for(int k =0; k<s; k++){
            System.out.println(a[k]+"");
        }
    }
}