import java.util.Scanner;

public class Algorithm2 {
    public static void main(String[] args) {
        
        float arithmeticMean = 0, geometricMean = 1, result = 0, step = 0, remainder;
        int number;
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir Sayi Giriniz : ");
        number = scan.nextInt();

        if (number % 2 == 0) {
            
            while (number > 0) {
                remainder = number % 10;
                step++;
                arithmeticMean += remainder;
                number = number / 10;
            }

            result = arithmeticMean / step;

            System.out.println("Aritmetik Ortalama : " + result);

        }
        else {
            while (number > 0) {
                remainder = number % 10;
                step++;
                geometricMean *= remainder;
                number = number / 10;
            }

            result = (float) Math.pow(geometricMean, (1 / step));

            System.out.println("Geometrik Ortalama : " + result);

        }

        

    }
}
