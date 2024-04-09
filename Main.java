//import java.util.Scanner;
interface School{
    String SchoolName = "Apna School";
    void printDetails();
}
abstract class Schoolabs implements School{
    public void printDetails(){
        System.out.println(SchoolName);
    }
}
    class Main extends Schoolabs{
    public static void main(String[] args){
    Main m= new Main();
    m.printDetails();
    }
}