import java.util.Scanner;

class Prog6{
    public static void main(String args[]){
        int a, b = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number for checking if it is prime or not : ");
        a = scan.nextInt();
        for(int i =2; i<a; i++){
            if(a%i == 0){
                b = 1;
            }
        }
        if(b == 1) System.out.println("The number is not prime");
        else System.out.println("The number is prime"); 
    }
}