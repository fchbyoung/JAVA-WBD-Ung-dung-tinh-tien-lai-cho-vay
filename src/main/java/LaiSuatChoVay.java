import java.util.Scanner;

public class LaiSuatChoVay {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double money = 1.0;
        int month = 1;
        double intersetRate = 1.0;
        double totalInterset = 0;

        System.out.println("Enter investment amount:");
        money = scanner.nextDouble();

        System.out.println("Enter number of months:");
        month = scanner.nextInt();

        System.out.println("Enter annual interest rate in percentage:");
        intersetRate = scanner.nextDouble();

        for(int i = 0; i < month; i++){
            totalInterset = money * (intersetRate / 100) / 12 * 3;
        }

        System.out.println("Total of interset: " + totalInterset);
    }
}
