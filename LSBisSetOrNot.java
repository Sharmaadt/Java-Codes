import java.util.Scanner;
public class LSBisSetOrNot {
    public static void main (String args[]){
        int num;
        System.out.println("Enter any number : ");
        Scanner sc = new Scanner(System.in);
        num= sc.nextInt();
        if((num & 1)==1){
            System.out.println("Num is set");
        }
        else{
            System.out.println("Num is not set");
        }
    }
}
