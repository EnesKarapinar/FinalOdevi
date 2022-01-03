public class Algorithm7 {
    public static void main(String[] args) {
        
        int control = 0;

        for (int i = 1; i <= 50; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    control++;
                }
            }
            if (control == 2) {
                System.out.print(i + " ");
                control = 0;
            }
            else {
                control = 0;
            }
        }

    }
}
