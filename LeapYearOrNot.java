import java.util.Scanner;
public class LeapYearOrNot {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner (System.in); 
        num=sc.nextInt();
       if((num%4==0 && num%100!=0) || (num%400==0)){
        System.out.println("Number is leap year");
       } 
       else{
        System.out.println("Number is not a leap year");
       }
    }
}
