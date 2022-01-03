import java.util.Scanner;

public class Algorithm4 {
    public static void main(String[] args) {
        
        int height, space, star, i = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Ucgenin Yuksekligini Giriniz : ");
        height = scan.nextInt();

        while (height > 0) {
            space = height - 1;
            star = i + 1;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < star; k++) {
                System.out.print("*");
            }
            System.out.println("");
            height--;
            i += 2;
        }

    }
}
