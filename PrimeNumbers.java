import java.util.Scanner;
public class PrimeNumbers {
    public static void main (String [] args){
        int num,i;
        System.out.println("Enter any number");
        Scanner sc = new Scanner (System.in);
        num =sc.nextInt();
        for(i=2;i<num;i++){
            if(num%i==0){
                break;
            }
        }
        if(i==num){
            System.out.println("This is a Prime");
        }
        else{
            System.out.println("This is not a prime Number");;
        }
        return;
    }
}

