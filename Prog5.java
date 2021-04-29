import java.util.Scanner;
public class Prog5{
    public static void main(String args[]){
        int binary[] = new int[20], i =0;
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number you want to convert into binary");
        num = scan.nextInt();
        while(num!=0){
            binary[i] = num%2;
            num/=2;
            i++;
        }
        System.out.println("Binary value is : ");
        for(int j =i-1; j>=0; j--)
        System.out.print(binary[j]+"");
    }
}