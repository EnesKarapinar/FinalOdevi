import java.util.Scanner;

public class Algorithm1 {
    public static void main(String[] args) {
        
        int number;
        String result = "";
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir Sayi Giriniz : ");
        number = scan.nextInt();

        if (number % 2 == 0) {
            while (number > 0) {
                result = number % 8 + result;
                number /= 8;
            }
            System.out.println("8 tabanindaki karsiligi : " + result);
        }
        else {
            while (number > 0) {
                result = number % 2 + result;
                number /= 2;
            }
            System.out.println("2 tabanindaki karsiligi : " + result);
        }

    }
}
