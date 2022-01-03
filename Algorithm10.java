import java.util.Scanner;

public class Algorithm10 {
    public static void main(String[] args) {
        
        String sentence, word = "";
        Scanner scan = new Scanner(System.in);

        System.out.print("Cumleyi Giriniz : ");
        sentence = scan.nextLine();

        sentence = sentence.concat(" ");

        for (int i = 0; i < sentence.length(); i++) {
            
            if (sentence.substring(i, i + 1).equals(" ")) {
                System.out.println(word);
                word = "";
            }
            else {
                word += sentence.substring(i, i + 1);
            }
           
        }

    }
}
