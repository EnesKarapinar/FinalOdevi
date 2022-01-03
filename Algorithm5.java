import java.util.Scanner;

public class Algorithm5 {
    public static void main(String[] args) {
        
        int number, step = 0, singleNumerals = 0, doubleNumerals = 0, numeral, result;
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir Sayi Girin : ");
        number = scan.nextInt();

        while (number > 0) {
            numeral = number % 10;
            if (numeral % 2 == 0) {
                doubleNumerals += numeral;
            }
            else {
                singleNumerals += numeral;
            }
            number /= 10;
            step++;
        }

        if (doubleNumerals > singleNumerals) {
            result = doubleNumerals - singleNumerals;
        }
        else {
            result = singleNumerals - doubleNumerals;
        }

        System.out.println("Basamak sayisi : " + step + " Sonuc : " + result);

    }
}
