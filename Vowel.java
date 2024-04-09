import java.util.Scanner;
public class Vowel{
    public static void main(String[] args){
        System.out.println("Enter any character");
        char ch;
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);
        if((ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') || (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')){
            System.out.println("Character is Vowel");
        }
        else{
            System.out.println("Character is not vowel");
        }
        return;
    }
}

