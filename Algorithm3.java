import java.util.Scanner;

public class Algorithm3 {
    public static void main(String[] args) {
        
        int numberOfMachine, month, time, interspace;
        Scanner scan = new Scanner(System.in);

        System.out.print("Makine Sayisini Giriniz : ");
        numberOfMachine = scan.nextInt();
        System.out.print("Hangi Ayda Oldugunuzu Giriniz : ");
        month = scan.nextInt();

        if (month > 2 && month < 9) {
            time = 480;
            interspace = 45;
        }
        else {
            time = 540;
            interspace = 30;
        }

        while (numberOfMachine > 0) {
            System.out.println(time);
            time -= interspace;
            numberOfMachine --;
        }

    }
}
