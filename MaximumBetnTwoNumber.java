import java.util.Scanner;
public class MaximumBetnTwoNumber {
    public static void main(String[] args){
        int num1,num2;
        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        num1= sc.nextInt();
        num2= sc.nextInt();
        if(num1>num2){
            System.out.println("Num1 is greater than num2");
        }
        else{
            System.out.println("Num2 is greater than num1");
        }
         return;
    }
}
