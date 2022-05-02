import java.util.Scanner;
import java.util.Random;
public class oddeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numType;
        System.out.println("Enter whether the  number is odd or even");
        String oddorEven = scanner.next();

        System.out.println("Enter the  number:");
        int n = scanner.nextInt();
        Random random = new Random();
        int x = random.nextInt(11);
        int num = 0;
        num = x + n;
        boolean y = (num % 2==0 && x % 2==0);
        boolean z= (num % 2==1 && x % 2==1);
        if  (y || z ){
            numType = "even";}
        else {
            numType = "odd";
        }
        if  (oddorEven.equals(numType)) {
            System.out.println("You are right!");}
        else{
            System.out.println("You are wrong!");}
        }
    }

