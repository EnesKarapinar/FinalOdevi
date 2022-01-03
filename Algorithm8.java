import java.util.Scanner;

public class Algorithm8 {
    public static void main(String[] args) {

        int [] numbers = new int[10];
        int number, highest, smallest, total = 0;
        double mean1, mean2, result;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". sayiyi girin : ");
            number = scan.nextInt();
            numbers[i] = number;
            total += number;
        }

        highest = numbers[0];
        smallest = numbers[0];
        mean1 = (double) total / 10;

        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] > highest) {
                highest = numbers[j];
            }
            if (numbers[j] < smallest) {
                smallest = numbers[j];
            }
        }

        mean2 = ((double)(highest + smallest)) / 2;

        if (mean1 > mean2) {
            result = mean1 - mean2;
        }
        else {
            result = mean2 - mean1;
        }

        System.out.println(result);

    }
}
