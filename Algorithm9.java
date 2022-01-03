import java.util.Scanner;

public class Algorithm9 {
    public static void main (String[] args) {

        String [] ones = {"Bir", "Iki", "Uc", "Dort", "Bes", "Alti", "Yedi", "Sekiz", "Dokuz"};
        String [] tens = {"On", "Yirmi", "Otuz", "Kirk", "Elli", "Altmis", "Yetmis", "Seksen", "Doksan"};
        int number, onesStep, tensStep;
        Scanner scan = new Scanner(System.in);

        System.out.print("1 ile 99 arasinda bir sayi giriniz : ");
        number = scan.nextInt();
        onesStep = number % 10;
        tensStep = number / 10;

        if (onesStep != 0) {
            System.out.println(tens[tensStep - 1] + " " + ones[onesStep - 1]);
        }
        else {
            System.out.println(tens[tensStep - 1]);
        }

    }
}