import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        byte a = 0;
        while (a == 0) {
            System.out.println("Enter 1 if you would like to convert Miles to Kilometres, and 0 if you would like to convert Kilometres to Miles: ");
            int n = i.nextInt();
            if (n == 1) {
                System.out.println("Enter the amount of Miles:");
                double M = i.nextDouble();
                double K = M * 1.609344;
                System.out.println(M + " Miles is " + K + " Kilometres.");
            } else if (n == 0) {
                System.out.println("Enter the amount of Kilometres:");
                double K = i.nextDouble();
                double M = K / 1.609344;
                System.out.println(K + " Kilometres is " + M + " Miles.");
            } else {
                System.out.println("Error: invalid input.");
            }
            System.out.println("Would you like to continue? (0 for yes, 1 for no).");
            a = i.nextByte();
        }
    }
}
