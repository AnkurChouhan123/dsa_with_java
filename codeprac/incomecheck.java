package codeprac;
import java.util.Scanner;
public class incomecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sal = sc.nextDouble();
        if (sal < 250000)
            System.out.print("No Tax applicable");
        else if (sal < 500000)
            System.out.print("Tax = 5%");
        else if (sal < 1000000)
            System.out.print("Tax = 20%");
        else
            System.out.print("Tax = 30%");

    }
}