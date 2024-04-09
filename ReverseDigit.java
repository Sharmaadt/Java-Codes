import java.util.Scanner;
public class ReverseDigit {
    public static void main(String[] args){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        num =sc.nextInt();
            int rev=0;
            while(num>0){
                rev=rev*10+(num%10);
                num=num/10;
            }
        System.out.println("Reverse"+rev);
        return;
    }
}
