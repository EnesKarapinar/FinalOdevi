import java.util.Scanner;

public class Algorithm6 {

    public static void print(int start, int total, int increase) {

        while (total > 0) {
            System.out.print(start + " ");
            start += increase;
            total--;
        }

    }

    public static void main(String[] args) {

        int start, total, increase;
        Scanner scan = new Scanner(System.in);

        System.out.print("Baslangic Degerini Girin : ");
        start = scan.nextInt();
        System.out.print("Adet Miktarini Girin : ");
        total = scan.nextInt();
        System.out.print("Artis Miktarini Girin : ");
        increase = scan.nextInt();
        
        print(start, total, increase);

    }
}
