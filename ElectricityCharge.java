import java.util.Scanner;
public class ElectricityCharge{
    public static void main(String[] args) {
        int units = 250;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bill"+(units));
        n=sc.nextInt();
        int[] charges={10,15,20,25};
        int[] range={100,100,100};
        int bill=0;
    for (int i=0;i<n;i++){
      if (units<=range[i]){
        bill+=charges[i]*units;
        break;
      }
      else {
        bill+=charges[i]*range[i];
        units=range[i];
      }
    }
    return;
  }
}

