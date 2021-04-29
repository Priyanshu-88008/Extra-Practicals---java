import java.util.Scanner;

class Prog7{
    public static void main(String args[]){
        int a = 0, j = 0;
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        while(j == 0){
            System.out.print("Enter the number : ");
            a = scan.nextInt();
            sum+=a;
            System.out.println("The sum is "+sum);
            System.out.print("If you want to exit press any key but 0.");
            j = scan.nextInt();
            System.out.println();
        }
    }
}